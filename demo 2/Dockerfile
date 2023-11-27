# Use Maven for building the application
FROM maven:3.5-jdk-8-alpine AS builder

# Set the working directory inside the container
WORKDIR /app

# Copy the project files into the container
COPY . .

# Build the application using Maven
RUN mvn clean package

# Use AdoptOpenJDK 11 as the base image for running the application
FROM adoptopenjdk:11-jre-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the builder stage to the current stage
COPY --from=builder /app/target/*.jar app.jar

# Expose the port on which the Spring Boot application will run
EXPOSE 8080

USER 10014


# Set the entry point for the container to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
