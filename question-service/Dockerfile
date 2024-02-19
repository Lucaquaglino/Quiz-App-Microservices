FROM eclipse-temurin
LABEL mentainer="luca quaglino"
WORKDIR /App
COPY target/question-service.jar /App/question-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "question-service.jar"]