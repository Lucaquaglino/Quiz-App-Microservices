FROM eclipse-temurin
LABEL mentainer="luca quaglino"
WORKDIR /App
COPY target/quiz-service.jar /App/quiz-service.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "quiz-service.jar"]
