FROM openjdk:15

EXPOSE 8080

COPY petclinic-0.0.1-SNAPSHOT.jar petclinic.jar

ENTRYPOINT ["java","-jar","/petclinic.jar"]


