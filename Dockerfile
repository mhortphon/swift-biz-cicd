FROM openjdk:17-alpine
EXPOSE 8080
ADD target/spring-boot-cicd-0.0.1-SNAPSHOT.jar spring-boot-cicd-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-cicd-0.0.1-SNAPSHOT.jar"]