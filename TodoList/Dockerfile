FROM openjdk:8-jdk-alpine

ADD ./TodoList-0.0.1-SNAPSHOT.jar app.jar
VOLUME /tmp
ENTRYPOINT ["java","-jar","/app.jar"]