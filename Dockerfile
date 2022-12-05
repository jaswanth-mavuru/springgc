FROM openjdk:17
add target/*.jar nnewapp.jar
ENTRYPOINT ["java","-jar","nnewapp.jar"]