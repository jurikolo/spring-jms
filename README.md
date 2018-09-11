# spring-jms
Demo app for Spring Boot and ActiveMQ integration.
Inspired by lankydan [spring-boot-jms](https://github.com/lankydan/spring-boot-jms) repository and article on [DZone](https://dzone.com/articles/using-jms-in-spring-boot-1)

# Prerequisites
Setup ActiveMQ prior running the app

# Usage
The app exposes 2 REST endpoints:
* /demo/get. You can access via browser by visiting something like http://localhost:8080/demo/get
* /demo/post. You can use httpie client, example command: `http http://localhost:8080/demo/post id=1 message=test`