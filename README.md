# Native Hire Take-home Project

This is an incomplete app that can be used as a starting point for the take-home portion of Native Team interviews.

This app is built with several open source technologies, including but not limited to the following:

- **Ionic Framework** ([ionicframework.com](https://ionicframework.com/))
- **Capacitor** ([capacitor.ionicframework.com](https://capacitor.ionicframework.com/))
- **React** ([reactjs.org](https://reactjs.org/))
- **TypeScript** ([typescriptlang.org](https://www.typescriptlang.org/))

### Prerequisites

- [Node.js](https://nodejs.org/en/) environment with npm
- [Android Studio](https://developer.android.com/studio)
- [Xcode](https://developer.apple.com/xcode)

### Install

To get started, clone the repo and install the dependencies:

```shell
git clone https://github.com/ionic-team/native-hire-project.git
cd ./native-hire-project
npm install
```

### Getting Started

This app has two React components: [`Home`](https://github.com/ionic-team/native-hire-project/blob/master/src/pages/Home.tsx) (the root component) and [`ContactListItem`](https://github.com/ionic-team/native-hire-project/blob/master/src/components/ContactListItem.tsx). Contact data is loaded from native in [`contacts.ts`](https://github.com/ionic-team/native-hire-project/blob/master/src/data/contacts.ts). You are free to modify the React app however you like, but for this project we are more interested in evaluating your competency with iOS and Android.

[**Capacitor**](https://capacitor.ionicframework.com/) (now installed in the project) is the tool that powers this app on iOS and Android. It consists of a CLI, a set of Native APIs, and a Web View runtime. For this project, we are interested in using the Capacitor bridge to invoke native functions from the web app.

The shells of these functions are already defined in their respective native projects. See the `getAll` method of the contacts plugin in [`Contacts.java`](https://github.com/ionic-team/native-hire-project/blob/master/android/app/src/main/java/io/ionic/starter/Contacts.java#L21-L33) for Android and [`Contacts.swift`](https://github.com/ionic-team/native-hire-project/blob/master/ios/App/App/Contacts.swift#L6-L11) for iOS. These functions currently return mocked data.

### Instructions

- **Part 1**: Add the functionality to retrieve all the contacts from the device on both iOS and Android. Feel free to refactor or modify the project as you see fit.

  The _minimum data_ that comprise a contact are: _first name_, _last name_, _phone number(s)_, and _email address(es)_. You are, however, welcome to return more fields.

- **Part 2**: Add a method to the contacts plugin that allows for querying contacts on the device. We are purposefully leaving this open-ended to put you in the mindset of a plugin developer.

- **Part 3**: Think about how you might further extend this API with the idea that the contacts plugin code in this app could be open-sourced and reused in many apps. As a maintainer, what functionality might you add? What would you focus on? What would be most important to get right?

  Write down your thoughts and be prepared to share with us.
