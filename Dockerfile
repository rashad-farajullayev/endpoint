FROM java:8-jre-alpine
WORKDIR /code/
COPY target/demo-0.0.1-SNAPSHOT.jar .
EXPOSE 8181
CMD java -Dloader.path=. -jar demo-0.0.1-SNAPSHOT.jar