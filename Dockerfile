# Use a Java 17 base image
FROM eclipse-temurin:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file and rename it
COPY target/bookstore-0.0.1-SNAPSHOT.jar bookstore.jar

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "bookstore.jar"]
