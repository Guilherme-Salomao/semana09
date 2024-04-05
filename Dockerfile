FROM openjdk:17

WORKDIR /app

COPY target/senac-0.0.1-SNAPSHOT.jar /app/senac-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "senac-0.0.1-SNAPSHOT.jar"]
