# Lab 06

## Goals
* You'll have to write you first ReST API
* You'll write all the business logic, all the layers of your server!
* Handle a Single Page Application, built with AngularJS

# Startup
A few classes and files are provided to help you. A SQL dump is also available in order to initialize your DB.

Look a the hints inside the code

Create a new DB schema name `yncrea_lab06` and import the provided dump.

# Main concepts
* There is a GUI that shows a Library
* All the calls between the browser and your server are made with AJAX.
* The only data format that is exchanged is JSON
* Please do not modify the front assets (HTML, JS, CSS files)!
* The previous works are your best friends for this practice.

# The API

* a `GET` call on `http://localhost:8080/lab06/api/books` should return a map with the id of the books for the keys of the map and the title of the books for the values.
* a `GET` call on `http://localhost:8080/lab06/api/books/xx` should return the details of the book with id XX (look at the provided BookDTO class !)
  * a few mapping should be done to transform a `Book` entity into a `BookDTO` instance
* a `POST` call on `http://localhost:8080/lab06/api/reviews` will save a new review in the database, based on the JSON content of the request
* a `DELETE` call on `http://localhost:8080/lab06/api/reviews/yy` will delete a review by its id YY

# The GUI
It is available at the following URL : `http://localhost:8080/lab06/`

# Tips
* The `RestController` interface must be implemented at least twice!