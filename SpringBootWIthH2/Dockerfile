FROM openjdk:8-jdk-alpine

COPY ./target/SpringBootWIthH2-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch SpringBootWIthH2-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","SpringBootWIthH2-0.0.1-SNAPSHOT.jar"]