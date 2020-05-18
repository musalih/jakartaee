FROM airhacks/glassfish
COPY ./target/javaeetutorial.war ${DEPLOYMENT_DIR}
