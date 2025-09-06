FROM openjdk:21-jdk-slim

WORKDIR /app

# Copy source code
COPY . .

# Make mvnw executable and build
RUN chmod +x ./mvnw && ./mvnw clean package -DskipTests

# Expose port
EXPOSE 8080

# Run the jar
CMD ["java", "-jar", "target/gifmaker-0.0.1-SNAPSHOT.jar"]
