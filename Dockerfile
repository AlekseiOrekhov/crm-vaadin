FROM openjdk:17-oracle
VOLUME /tmp
ENV POSTGRES_URL=POSTGRES_URL \
    POSTGRES_PORT=POSTGRES_PORT \
    POSTGRES_DATABASE_NAME=POSTGRES_DATABASE_NAME \
    POSTGRES_USER_NAME=POSTGRES_USER_NAME \
    POSTGRES_PASSWORD=POSTGRES_PASSWORD \

COPY  build/libs/crm-vaadin-0.0.1-SNAPSHOT.jar crm-vaadin-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=${ENV}" , "-jar","/crm-vaadin-0.0.1-SNAPSHOT.jar"]


#COPY . /home/alexey/Documents/crm-vaadin
#WORKDIR home/alexey/Documents/crm-vaadin
#RUN javac src/main/java/com/example/crmvaadin/CrmVaadinApplication.java
#CMD ["java", "CrmVaadinApplication"]
