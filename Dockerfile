FROM rtfpessoa/ubuntu-jdk8
ADD /target/demo-0.0.3-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]