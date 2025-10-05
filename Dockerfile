FROM openjdk:21-oracle

COPY target/*.jar animal.jar

EXPOSE 8089

ENTRYPOINT ["java","-jar","animal.jar"]