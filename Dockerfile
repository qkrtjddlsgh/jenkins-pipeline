FROM rtfpessoa/ubuntu-jdk8
ADD /var/lib/jenkins/workspace/spring_boot_hello_world/target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
