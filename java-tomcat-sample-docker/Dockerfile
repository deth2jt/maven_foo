FROM tomcat:8.0
RUN cp -a **/target/*.war /usr/local/tomcat/webapps/
EXPOSE 8081
CMD ["catalina.sh", "run"]
