FROM tomcat:9-jdk17-openjdk-slim
WORKDIR /usr/local/tomcat/webapps/
COPY target/CricketAPI-0.0.1-SNAPSHOT.war ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]