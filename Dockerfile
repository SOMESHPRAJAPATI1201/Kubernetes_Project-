FROM openjdk:21-jdk-slim
LABEL authors="Dell"

WORKDIR /app

CMD ["mvn","clean","package"]

COPY target/KubernetesProject-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar","app.jar"]