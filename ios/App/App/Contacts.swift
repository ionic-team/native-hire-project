import Foundation
import Capacitor

@objc(Contacts)
public class Contacts : CAPPlugin {
    @objc func getAll(_ call: CAPPluginCall) {
        let contacts = getAllMocked() // TODO: Replace mocked data with real implementation.
        call.success([
            "contacts": contacts
        ])
    }
    
    private func getAllMocked() -> [Any] {
        return [
            [
                "firstName": "Elton",
                "lastName": "Json",
                "phoneNumbers": ["2135551111"],
                "emailAddresses": ["elton@eltonjohn.com"],
            ],
            [
                "firstName": "Freddie",
                "lastName": "Mercury",
                "phoneNumbers": [],
                "emailAddresses": [],
            ],
        ]
    }
}
