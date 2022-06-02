FROM openjdk:8-jdk-alpine
MAINTAINER S0cke3t
EXPOSE 8080
ADD target/CVE-2022-22978-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT exec java -jar /demo.jar