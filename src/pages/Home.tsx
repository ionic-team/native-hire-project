import ContactListItem from '../components/ContactListItem';
import React, { useState } from 'react';
import { Contact, getContacts } from '../data/contacts';
import {
  IonContent,
  IonHeader,
  IonList,
  IonPage,
  IonTitle,
  IonToolbar,
  useIonViewWillEnter
} from '@ionic/react';
import './Home.css';

const Home: React.FC = () => {

  const [contacts, setContacts] = useState<Contact[]>([]);

  useIonViewWillEnter(async () => {
    const msgs = await getContacts();
    setContacts(msgs);
  });

  return (
    <IonPage id="home-page">
      <IonHeader>
        <IonToolbar>
          <IonTitle>Contacts</IonTitle>
        </IonToolbar>
      </IonHeader>
      <IonContent fullscreen>
        <IonHeader collapse="condense">
          <IonToolbar>
            <IonTitle size="large">
              Contacts
            </IonTitle>
          </IonToolbar>
        </IonHeader>

        <IonList>
          {contacts.map(contact => <ContactListItem key={contact.id} contact={contact} />)}
        </IonList>
      </IonContent>
    </IonPage>
  );
};

export default Home;
