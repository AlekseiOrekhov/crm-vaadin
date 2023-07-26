FROM openjdk:17-oracle
VOLUME /tmp
COPY  build/libs/crm-vaadin-0.0.1-SNAPSHOT.jar crm-vaadin-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/crm-vaadin-0.0.1-SNAPSHOT.jar"]


#COPY . /home/alexey/Documents/crm-vaadin
#WORKDIR home/alexey/Documents/crm-vaadin
#RUN javac src/main/java/com/example/crmvaadin/CrmVaadinApplication.java
#CMD ["java", "CrmVaadinApplication"]
