# Build Stage
FROM maven:3.8.4-openjdk-11 AS build
WORKDIR /app
COPY . /app
RUN mvn clean install

# Run Stage
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/*.jar /app/app.jar

# Expose the application port
EXPOSE 8080


# Run the application
CMD ["java", "-jar", "/app/app.jar"]



