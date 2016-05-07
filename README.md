# README #

### What is this repository for? ###

This is a simple XML based implementation of MUnit (Mule Testing Framework). It has 4 basic Mule flow example with the corresponding MUnit Test Suite. The implementation targets to use MUnit on the following basic connectors:

*  JDBC (Outbound using OOTB MUnit's Mock Embedded DB Server)
 
*  HTTP (Outbound using HTTP Mock Definition)

*  FTP (Inbound and Outbound using OOTB MUnit's Mock Local FTP Server)

*  JMS (Inbound and Outbound using Embedded Non-Persistent Active MQ)

Mule Runtime Version 3.7.3 EE

MUnit Version 1.1.0

Anypoint Studio 5.4.3

### How do I get set up? ###

* To run this project you'll be needing, Anypoint Studio (preferably 3.7.3 or greater if available) with MUnit Anypoint Studio Plugin and MUnit Synchronize Module for Integration Testing. MUnit Software Site: http://studio.mulesoft.org/r4/munit

* If you want to run the test only, execute this command:

```
#!Maven

mvn clean test
```

* If you want to run the application and package without testing, execute this command:

```
#!Maven

mvn clean package -DskipTests
```
 or 
```
#!Maven

mvn clean package -DskipMunitTests
```


* Check out this site for additional maven command reference: https://docs.mulesoft.com/munit/v/1.1.1/munit-maven-support

### Notes ###

* Check out wiki section to read about my lessons learned while creating this project.

* I just want to mention here my experience with the current MUnit debug mode in the Anypoint Studio, it seems that there is a bug (at the time of writing), which is it doesn't stop on a break point. So if you are are trying to debug test suite code on your local Anypoint Studio don't be surprise that the debug mode won't work. It is advisable to run Anypoint Studio as Administrator when you are using Windows PC; I was using Windows PC when I write this test.

### Repo Owner and Admin ###

* Neil Carlo P. Catalan
