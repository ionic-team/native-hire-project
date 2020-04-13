#import <Capacitor/Capacitor.h>

CAP_PLUGIN(Contacts, "Contacts",
  CAP_PLUGIN_METHOD(getAll, CAPPluginReturnPromise);
)
