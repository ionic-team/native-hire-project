export interface Contact {
  id: string;
  firstName: string;
  lastName: string;
  phoneNumbers: string[];
  emailAddresses: string[];
}

const messages: Contact[] = [
  {
    id: '1',
    firstName: 'Elton',
    lastName: 'John',
    phoneNumbers: ['6085551111'],
    emailAddresses: ['elton@eltonjohn.com'],
  },
  {
    id: '2',
    firstName: 'Freddie',
    lastName: 'Mercury',
    phoneNumbers: ['6085552222'],
    emailAddresses: ['freddie@queenonline.com'],
  },
];

export const getContacts = async () => messages;
