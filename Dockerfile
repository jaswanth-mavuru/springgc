FROM openjdk:17
add target/*.jar springgc-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","springgc-0.0.1-SNAPSHOT.jarr"]
