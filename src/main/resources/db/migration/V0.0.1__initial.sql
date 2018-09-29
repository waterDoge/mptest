CREATE TABLE mptest.resource(
  id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(45)
);
INSERT INTO mptest.resource(name) VALUES ('a'),('b'),('c');