FROM maven:3.8.8-eclipse-temurin-8 AS build
WORKDIR /app

# Cache dependencies first
COPY pom.xml ./
RUN mvn -q -DskipTests dependency:go-offline

# Build application
COPY src ./src
RUN mvn -q -DskipTests clean package

FROM eclipse-temurin:8-jre
WORKDIR /app

COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
