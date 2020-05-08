# Fitness Factory Nicosia Android App

The Android application is prototype version which supports some of the main functionality provided in the **Fitness 
Factory Nicosia WebApp**. The user will be greeted with a welcome screen, providing him with the option to login. 
Following the confirmation of their credentials they will be able to access their account and operate in similar a 
manner to the web application. The other options provided in the main screen is visiting the homepage of the web app as 
well as the classes page in order to be informed of the running class program of the gym.


#### Deployment link: 
The following link is the deployment link of the web app, which the android app renders dynamically for some of the 
information provided.  <br />
[https://ffnfinal.web.app/](https://ffnfinal.web.app/)
##### The web application is also responsive and operates normally on mobile devices

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing 
purposes. See deployment for notes on how to deploy the project on a live system. The app can be run on an Android 
Studio emulator.

### User Instructions

#### Prerequisites
```
The user must have access to a basic web browser program to access the web application. They must also have installed 
Android Studio with a device ready for emulation.
```

#### Instructions about our WebApp:

**Log-in** <br/>
The login modal appears, when the user clicks the Log-in button in the Android App welcome screen. In this modal a user 
that has already created an account (from the web application) can sign-in to the system by filling his credentials.
<br/><br/>
**Home Page** <br/>
This is the front page of the web application that presents helpful information about 
the company, such as the services provided by the company and some general announcements about the gym.
The user can access the homepage at any time by clicking the home label of the 
navigation bar or by clicking the logo of the company in any page <br/><br/>
**Classes** <br/>
This page is responsible for visualizing the classes provided by the gym. The user can read a brief description
of every class in order to choose the class of his choice.The user is able to visit this page by clicking to the 
class label of the navigation bar. <br/><br/>
**ProfileUser** <br/>
This profile is responsible for visualizing the users unique profile and its only available after the user sign-in to
the system using his credentials. From this page the user has the ability view his personal messages by clicking the 
messages option, add/edit his profile picture by hovering and clicking the current profile picture, view personal 
announcements and events by clicking the available options and edit his profile from a modal that allows 
him to change the information saved in the system about him by clicking the available option.
<br/><br/>

## Testing Phase

Basic static tests were implemented by our development team in order to ensure the uninterrupted and correct 
android application's operation. This consists of several checks on the interface of the android application. Additionally,
 since the android application renders some of the information from the web application, the automated and unit tests 
 in the web app are also in effect.
 <pre>
 -> src <br/> &nbsp&nbsp&nbsp-> test <br/> &nbsp&nbsp&nbsp&nbsp&nbsp-> Automated <br/> &nbsp&nbsp&nbsp&nbsp&nbsp-> Unit
 </pre>
 ##### The above is directory representation for the files used for both automated and unit tests.

### Future Intentions

We currently do not have plans to further work in this repository, however due to the nature of the MIT License, the 
prospect of future work will lie in the hands of the community.

## Deployment

At the current state the website has been deployed to a firebase project (for hosting), firebase function (backend API),
and a MySQL database hosted on Microsoft Azure. However local deployment of the project can be achieved (if the interested
party has means of supporting a database server).
<br/>
In the api folder of our github repository there is a **database.js** file. By filling in the following information <br/>

<pre>
    conn = mysql.createConnection({
      host    : '',
      user    : '',
      password: '',
      database: '',
    });
</pre>
in the fist few lines. After this is completed running the program can be achieved with the following npm scripts.


In the src folder of our github repository there is a **repository.js** file. By filling in the following information <br/>
<pre>
const BASE_URL = 'http://{personal_ip}:5000'; 
</pre>
In order to run the backend server on the Android App as well.


<pre>
"scripts": {
    "start": "react-scripts start",<br/>
    "build": "react-scripts build",<br/>
    "dev": "concurrently \"cd api && npm run start\" \"npm run start\",<br/>
    "eject": "react-scripts eject"<br/>
    "test": "react-scripts test ./src/test/Unit/* --env=jest-environment-jsdom-sixteen",<br/>
    "mocha": "mocha src/test/Automated/*.test.js"
  }
  </pre>

```
    "start": "react-scripts start",
    This command/script is used to start the necessary scripts required for normal
    web application's operation with the necessary react features in place.
```
```
    "build": "react-scripts build",
    This command/script is used to combine the necessary scripts required for normal
    web application's operation.
```
```
    "run": "concurrently \"cd api && npm run start\" \"npm run start\",
    This command/script is used in order to run both the start script for the normal web app operation, as well as the 
    backend server (running on localhost:5000) (API).
```
```
    "eject": "react-scripts eject"<br/>
    This command/script calls the create-react-app which encapsulates all of the npm modules 
    it is using internally, so that your package.json will be very clean and simple without 
    you having to worry about it.
```
```
    "test": "react-scripts test",
    This command/script is used in order to run the unit tests implemented.
```
```
    "mocha": "mocha src/test/Automated/*.test.js",
    This command/script is used in order to run the automated tests.
```

## Built With

* [React.js](https://reactjs.org/) - A JavaScript library for building user interfaces
* [Express.js](https://expressjs.com/) - A Node.js web application framework for API implementation

## Tested With

* [Selenium Web Driver for Node.js](https://www.npmjs.com/package/selenium-webdriver/) - Selenium is a browser 
automation library, mainly used for automated testings.
* [Jest.js](https://jestjs.io/) - Jest is a JavaScript Testing Framework for unit testing purposes.
* [Mocha.js](https://mochajs.org/) - Mocha is a JavaScript Testing Framework for asynchronous testing purposes.
* [Chai.js](https://www.chaijs.com/) - Chai is a BDD / TDD assertion library for node optimal for test driven 
 development.
* [React Testing Library](https://testing-library.com/docs/react-testing-library/intro) - React Testing Library builds 
on top of DOM Testing Library by adding APIs for working with React components.

##### Note: Currently there is a sql file in our repository which will be used for building the web application's database.
## Contributing

This web application is being developed within the constraints of a university course subject. Hence, the development 
team is fixed, and the web application development was strictly private. Now that the web app has been launched with an 
MIT License the development and future expansion of this project is not limited by any constrains.

## Versioning

We (the development team) are able to access version iterations or iterative development stages based on 
our github branches/commits.

## Authors

* **Andreas Loizou** - *Initial work* - [aloizo03](https://github.com/aloizo03)
* **Panagiotis Melios** - *Initial work* - [pmelio01](https://github.com/pmelio01)
* **Andreas Paraskeva** - *Initial work* - [aparas01](https://github.com/aparas01)
* **Antonis Poullis** - *Initial work* - [poullis](https://github.com/poullis)
* **Loizos Siakallis** - *Initial work* - [lsiaka01](https://github.com/lsiaka01)
* **Yiannis Sophocleous** - *Initial work* - [isopho01](https://github.com/isopho01)


See also the list of [contributors](https://github.com/CS-UCY-EPL343/winter19.team9/graphs/contributors) who 
participated in this project.

## License

MIT License

## Acknowledgments

* Inspiration: [Bootstrap Templates](https://getbootstrap.com/docs/4.3/examples/) and several [Codepen](https://codepen.io/) examples.
