# JDK sürümü
FROM openjdk:20
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
CMD apt-get update-y
ENTRYPOINT ["java","-jar","/app.jar"]