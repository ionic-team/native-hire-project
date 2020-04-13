import React from 'react';
import {
  IonItem,
  IonLabel,
  IonNote
} from '@ionic/react';
import { Contact } from '../data/contacts';
import './ContactListItem.css';

interface ContactListItemProps {
  contact: Contact;
}

const ContactListItem: React.FC<ContactListItemProps> = ({ contact }) => {
  return (
    <IonItem>
      <IonLabel className="ion-text-wrap">
        <h2>
          {contact.firstName} {contact.lastName}
          <span className="date">
            <IonNote>{contact.phoneNumbers[0]}</IonNote>
          </span>
        </h2>
        <h3>{contact.emailAddresses[0]}</h3>
      </IonLabel>
    </IonItem>
  );
};

export default ContactListItem;
