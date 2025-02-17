
services:
  mysql:
    image: 'mysql:latest'
    container_name: mysql_db
    restart: always
    environment:
      MYSQL_DATABASE: mydatabase
      MYSQL_USER: myuser
      MYSQL_PASSWORD: secret
      MYSQL_ROOT_PASSWORD: verysecret
    ports:
      - '3306:3306'
    networks:
      - mynetwork

  backend:
    build: .
    container_name: spring_app
    depends_on:
      - mysql
    environment:
      SPRING_DATASOURCE_URL: jdbc:mysql://mysql:3306/mydatabase
      SPRING_DATASOURCE_USERNAME: myuser
      SPRING_DATASOURCE_PASSWORD: secret
    ports:
      - '8080:8080'
    networks:
      - mynetwork

networks:
  mynetwork:
    driver: bridge
