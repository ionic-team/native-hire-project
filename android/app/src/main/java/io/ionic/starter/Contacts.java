package io.ionic.starter;

import android.Manifest;
import android.content.pm.PackageManager;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

import java.util.Arrays;

@NativePlugin(
    requestCodes = { Contacts.GET_ALL_REQUEST }
)
public class Contacts extends Plugin {
  static final int GET_ALL_REQUEST = 95817;

  @PluginMethod()
  public void getAll(PluginCall call) {
    if (!hasPermission(Manifest.permission.READ_CONTACTS) || !hasPermission(Manifest.permission.WRITE_CONTACTS)) {
      saveCall(call);
      pluginRequestPermissions(new String[] { Manifest.permission.READ_CONTACTS, Manifest.permission.WRITE_CONTACTS }, GET_ALL_REQUEST);
      return;
    }

    JSObject result = new JSObject();
    JSArray mockedContacts = this.getAllMocked(); // TODO: Replace mocked data with real implementation.
    result.put("contacts", mockedContacts);
    call.success(result);
  }

  protected JSArray getAllMocked() {
    JSArray contacts = new JSArray();
    JSObject eltonJson = new JSObject();
    eltonJson.put("firstName", "Elton");
    eltonJson.put("lastName", "Json");
    eltonJson.put("phoneNumbers", new JSArray(Arrays.asList("2135551111")));
    eltonJson.put("emailAddresses", new JSArray(Arrays.asList("elton@eltonjohn.com")));
    contacts.put(eltonJson);
    JSObject freddieMercury = new JSObject();
    freddieMercury.put("firstName", "Freddie");
    freddieMercury.put("lastName", "Mercury");
    freddieMercury.put("phoneNumbers", new JSArray());
    freddieMercury.put("emailAddresses", new JSArray());
    contacts.put(freddieMercury);

    return contacts;
  }

  @Override
  protected void handleRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
    super.handleRequestPermissionsResult(requestCode, permissions, grantResults);

    PluginCall savedCall = getSavedCall();
    if (savedCall == null) {
      return;
    }

    for(int result : grantResults) {
      if (result == PackageManager.PERMISSION_DENIED) {
        savedCall.error("User denied permission");
        return;
      }
    }

    if (requestCode == GET_ALL_REQUEST) {
      this.getAll(savedCall);
    }
  }
}
