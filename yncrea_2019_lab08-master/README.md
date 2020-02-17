# Practice 08

## Goal
Fall in love with Spring Boot !

## Intro
You just cloned a Maven project with one module. Everything will be done in this module.

First of all, add the following parent to your project:
* groupId : org.springframework.boot
* artifactId : spring-boot-starter-parent
* version : 1.5.10.RELEASE

Add the following dependencies to the existing ones:

| groupId | artifactId |
|---------|------------|
|  org.springframework.boot | spring-boot-starter-web |
|  org.springframework.boot | spring-boot-starter-data-jpa |
|  org.springframework.boot | spring-boot-starter-actuator |
|  mysql | mysql-connector-java |
 
No version or scope to specify, everything is preconfigured in the parent!

## Provided classes
All the service/DAO/entity are provided, you just have to write a Controller that returns all the students in a JSON structure.

## Take a look at the metrics

Thanks to this [documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html), you can test the different endpoints.

## Even better
Read this [Tutorial](https://spring.io/guides/gs/accessing-data-rest/) and try to improve your DAO in order to get a full API.

## Good tutorials
* https://spring.io/guides/gs/accessing-data-rest
* https://spring.io/guides/gs/rest-service/
* https://spring.io/guides/gs/accessing-data-jpa/
