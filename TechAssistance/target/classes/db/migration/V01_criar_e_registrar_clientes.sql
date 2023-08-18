CREATE TABLE customer (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT NULL,
	cellphone VARCHAR(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user (id, name, email, cellphone) values (1, 'João Vitor', 'jovi@hotmail.com', '(206) 342-8631');
INSERT INTO user (id, name, email, cellphone) values (2, 'Hellen Lohana', 'lolo@hotmail.com', '(209) 300-2557');
