FROM openjdk:17-jdk-alpine
COPY ./target/java-29102024-0.0.1-SNAPSHOT.jar java-29102024.jar

ENTRYPOINT ["java","-jar","/java-29102024.jar"]