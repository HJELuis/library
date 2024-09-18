FROM ubuntu

RUN apt-get update  && apt-get install -y maven
WORKDIR /mis-archivos
COPY . /mis-archivos
RUN mvn package
CMD ["java", "-jar", "target/library-1.0-SNAPSHOT.jar"]