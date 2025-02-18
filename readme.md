Commands to run:
1. mvn clean install
2. docker build -t metrics-exposer .
3. docker run -d --name metrics-exposer -p 8080:8080 metrics-exposer
4. docker-compose -f src/main/resources/docker-compose-prometheus.yaml up -d