CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_colaboradores(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255),
    idade INT(2),
    cargo VARCHAR(255),
    salario DECIMAL(8,2),
    
    PRIMARY KEY (id)
    );

INSERT INTO tb_colaboradores(nome, idade, cargo, salario)
VALUE("Flávia",20,"Dev Junior",2500.00);

INSERT INTO tb_colaboradores(nome, idade, cargo, salario)
VALUE("Fernando",25,"Dev Pleno",5500.00);

INSERT INTO tb_colaboradores(nome, idade, cargo, salario)
VALUE("Igor",30,"Dev Senior",10000.00);

INSERT INTO tb_colaboradores(nome, idade, cargo, salario)
VALUE("Dalila",32,"Tech Leader",15000.00);

INSERT INTO tb_colaboradores(nome, idade, cargo, salario)
VALUE("Mariana",28,"Business Partner",12000.00);

SELECT * FROM tb_colaboradores;

SELECT * FROM tb_colaboradores WHERE salario > 2000;

SELECT * FROM tb_colaboradores WHERE salario < 2000;

UPDATE tb_colaboradores
SET salario = 3500.52
WHERE id = 1;