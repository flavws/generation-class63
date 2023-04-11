CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_aluno (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255),
    dataNascimento DATE,
    contato VARCHAR(50),
    nota DECIMAL,
    PRIMARY KEY(id)
);

INSERT INTO tb_aluno(nome, dataNascimento, contato, nota)
VALUES ("Flávia", '2002-12-25', "(28) 2183-8105", 9.5),
	("Jessica", '2002-08-11', "(87) 3759-5413", 6.5),
	("Ronaldo", '2002-11-27', "(84) 2287-2944", 6.0),
	("Alex", '2002-10-30', "(69) 2147-8368", 3.5),
	("Lorena", '2002-02-28', "(95) 3635-1613", 9.0),
	("Isabela", '2002-04-01', "(81) 3128-0213", 5.0),
	("Cristiano", '2002-03-21', "(96) 3300-7277", 7.0),
	("José", '2002-09-30', "(86) 2828-8257", 8.5);

SELECT * FROM tb_aluno WHERE nota > 7.0;

SELECT * FROM tb_aluno WHERE nota < 7.0;

UPDATE tb_aluno
SET dataNascimento = '2002-02-27'
WHERE id = 5;