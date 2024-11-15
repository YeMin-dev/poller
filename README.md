
# poller

## What is this repository for?

**Quick summary**

* About The Project

	FTP Poller

## Built With

A list of commonly used resources are listed in the acknowledgements.

* [Java](https://java.com)
* [Spring Boot](https://spring.io)
* [Spring Framework](https://docs.spring.io/spring-framework/docs/current/reference/html/)
* [Spring JDBC](https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/#reference)
* [Apache Camel](https://camel.apache.org/docs/)
* [Quartz](http://www.quartz-scheduler.org/documentation/)
* [Oracle DB](https://docs.oracle.com/en/database/)

## Current Version

* 0.0.1-SNAPSHOT

## How do I set-up the project and get running?

* Summary of set up
	
	For this project to be running properly, we will need some tools and frameworks to be installed in our machine as prerequisites:
		
	* [Java 8](https://docs.oracle.com/javase/8/docs/api/)
	* [Maven](https://maven.apache.org/download.cgi)
	* [Git](https://git-scm.com/downloads)

* Configuration
	
	* Following are the profiles that can be used.
	  
        * sit -> local development testing
        * uat -> for uat environment
        * prod-> for production environment
    
	
* How to build this project
	
		mvn clean package -P <profile-id> 
		or
		mvn clean install -P <profile-id> 

* How to Deploy this project
	
		mvn spring-boot:run -Dspring-boot.run.profiles=profile
		or
		java -Dspring.profiles.active=profile -jar target/poller.jar
	
## Copyright

	* Privasia (refer https://privasia.com/)

* Contributors
	* [Ye Min Khant]

	