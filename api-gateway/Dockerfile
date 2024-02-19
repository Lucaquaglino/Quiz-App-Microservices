FROM eclipse-temurin
LABEL mentainer="luca quaglino"
WORKDIR /App
COPY target/api-gateway-0.0.1-SNAPSHOT.jar /App/api-gateway-0.0.1-SNAPSHOT.jar
EXPOSE 8765
ENTRYPOINT ["java", "-jar", "api-gateway-0.0.1-SNAPSHOT.jar"]