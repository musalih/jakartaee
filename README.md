# Build
mvn clean package && docker build -t com.mustafa/javaeetutorial .

# RUN

docker rm -f javaeetutorial || true && docker run -d -p 8080:8080 -p 4848:4848 --name javaeetutorial com.mustafa/javaeetutorial 