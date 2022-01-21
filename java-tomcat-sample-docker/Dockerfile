FROM tomcat:8.0
#RUN cp -a ./java-tomcat-sample-docker/target/*.war /usr/local/tomcat/webapps/
cp -a **/*.war /usr/local/tomcat/webapps/
EXPOSE 8081
CMD ["catalina.sh", "run"]
