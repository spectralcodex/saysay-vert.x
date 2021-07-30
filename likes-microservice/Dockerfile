# Extend vert.x image
FROM java:8-jre

#
ENV VERTICLE_FILE target/likes-microservice-fat.jar

# Set the location of the verticles
ENV VERTICLE_HOME /opt/verticles

EXPOSE 8085

# Copy your verticle to the container
COPY $VERTICLE_FILE $VERTICLE_HOME/
COPY src/config/docker.json $VERTICLE_HOME/


# Launch the verticle
WORKDIR $VERTICLE_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar  likes-microservice-fat.jar -cluster -ha -conf docker.json"]
