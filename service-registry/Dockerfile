FROM eclipse-temurin
LABEL mentainer="luca quaglino"
WORKDIR /App
COPY target/service-registry-0.0.1-SNAPSHOT.jar /App/service-registry-0.0.1-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "service-registry-0.0.1-SNAPSHOT.jar"]
