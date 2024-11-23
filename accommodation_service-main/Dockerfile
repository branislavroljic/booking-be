FROM eclipse-temurin:21-jdk AS build

WORKDIR /home/accommodation_service

COPY .mvn/ .mvn/
COPY mvnw pom.xml ./

COPY src ./src

RUN ./mvnw package -DskipTests

FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /home/accommodation_service/target/accommodation_service-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-Xms256m", "-Xmx3072m", "-jar", "app.jar"]