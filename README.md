# Cinema-app
 ## Table of contents
1. [Project Description](#project-description)
2. [Available Functionality](#available-functionality)
3. [Structure](#structure)
4. [Roles Endpoints](#roles-endpoints)
5. [Technologies](#technologies)
6. [How to Install the App](#how-to-install-the-app)
 ## Project description <a name="project-description"></a>
Cinema web application is a simple imitation of cinema, with user authorization and authentication. Here we have user, ordering ticket to movie session with cinema hall mentioned.
## Available functionality <a name="available-functionality"></a>
* User LogIn/LogOut
* create, update delete cinema-hall
* create, update delete movie
* create, update delete movie-session
* create, update delete order (ticket to movie-session)
## Structure <a name="structure"></a>
* Controller - accepts requests from the client, passes them to the service layer
* Service - accepts requests from the controller, passes them to the DAO layer, and performs all business logic
* DAO - accepts requests from the service, passes them to the DB, and executes all SQL queries
## Roles Endpoints <a name="roles-endpoints"></a>
* DELETE: /movie-sessions/{id} - (admin)
* GET: /cinema-halls - (user/admin)
* GET: /movies - (user/admin)
* GET: /movie-sessions/available - (user/admin)
* GET: /orders - (user)
* GET: /shopping-carts/by-user - (user)
* GET: /users/by-email - (admin)
* POST: /register - (all)
* POST: /cinema-halls - (admin)
* POST: /movies - (admin)
* POST: /movie-sessions - (admin)
* POST: /orders/complete - (user)
* PUT: /movie-sessions/{id} - (admin)
* PUT: /shopping-carts/movie-sessions - (user)
## Technologies <a name="technologies"></a>
* JDK 17
* Maven 4.0
* Hibernate 5.6.14.Final
* Spring (Core, Web) 5.3.20
* Spring Security 5.6.10
* MySQL 8.0.33
* TomCat 9.0.50
## How to install the app <a name="how-to-install-the-app"></a>
1. Install Intellij, JDK 17, MySQL, and TomCat on your computer (if you don't have some already);
2. Clone this repo to your IDE and open it;
3. Link your MySql database: replace username, password, driver, and URL in resources/db.properties with your own;
4. Add Tomcat@9 configuration;
5. Run "mvn clean package" command in the terminal;
6. Start Tomcat and try the app.

*P.s. You can use Postman for running HTTP requests for a better experience
