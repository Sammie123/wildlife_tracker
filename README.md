## Wildlife Tracker

An app for the forest service to track animals for an environmental impact study.

### Description

The Forest Service is considering a proposal from a timber company to clearcut a nearby forest of Douglas Fir. Before this proposal may be approved, they must complete an environmental impact study. This application was developed to allow Rangers to track wildlife sightings in the area.

### Added features/re-written/refactored

I added update/delete methods for EndangeredAnimal.java and Sighting.java. Rework the routing for the update/delete function for endangered animal and non-endangered animals. Add Timestamp for each class and abstract class(Animal.java).

### Setup

To create the necessary databases, launch postgres, then psql, and run the following commands:

* `Git clone this respository onto your local computer;`
* `CREATE DATABASE wildlife_tracker;`
* `\c wildlife_tracker;`
* `CREATE TABLE animals (id serial PRIMARY KEY, name varchar, time timestamp);`
* `CREATE TABLE endangered_animals (id serial PRIMARY KEY, name varchar, health varchar, age varchar, time timestamp);`
* `CREATE TABLE sightings (id serial PRIMARY KEY, animal_id int, location varchar, ranger_name varchar, time timestamp);`
* `CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;`
* `To access Database, type "psql wildlife_tracker < media.sql" into terminal;`
* `To access the web application, type 'gradle run' into terminal then input localhost:4567 in a web browser;`


### Specifications

* Adding an Animal:
  * Input: Type in animal name and if the animal is endangered check the box along with picking the health status and its age

* Report Sightings:
  * Input: Click on the animal, type in location, and your name

* Updating:
  * Input: Type name, changed health and age and click on update

* Delete:
  * input: Click on delete button

### Contact

Contact me at huylincoln007@yahoo.com

### Technologies Used

* Java
* junit
* Gradle
* PostgreSQL
* Spark

### License

Copyright (c) 2017 **_MIT License_**
