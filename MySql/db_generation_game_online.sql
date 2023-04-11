CREATE DATABASE IF NOT EXISTS db_generation_game_online;

USE db_generation_game_online;


CREATE TABLE tb_classes (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    arma VARCHAR(30)
);

CREATE TABLE tb_personagens (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    raca VARCHAR(30),
    nivel INT,
    ataque INT,
    defesa INT,
    classe_id BIGINT,
    FOREIGN KEY(classe_id) REFERENCES tb_classes(id)
);

INSERT INTO tb_classes(nome, arma)
VALUES ("mago", "cajado"), ("guerreiro", "espada"), ("ladino", "adaga"), ("caçador", "arco"), ("samurai", "katana");

INSERT INTO tb_personagens(nome, raca, nivel, ataque, defesa, classe_id)
VALUES ("Optis", "Orc", 95, 2800, 1700, 2),
	("Cenia", "Elfo", 88, 1900, 2000, 4),
	("Alvenir", "Humano", 60, 1200, 800, 1),
	("Merrita", "Elfo", 20, 450, 200, 2),
	("Elyster", "Gnomo", 44, 1000, 880, 3),
	("Criton", "Humano", 100, 3000, 3100, 5),
	("Yvenia", "Gnomo", 2, 100, 50, 2),
	("Meopre", "Elfo", 90, 2150, 1200, 1);

SELECT * FROM tb_personagens WHERE ataque > 2000;

SELECT * FROM tb_personagens WHERE defesa >= 1000 && defesa <= 2000;

SELECT * FROM tb_personagens WHERE nome LIKE "%c%";

SELECT * FROM tb_personagens INNER JOIN tb_classes ON tb_personagens.classe_id = tb_classes.id;

SELECT * FROM tb_personagens INNER JOIN tb_classes ON tb_personagens.classe_id = tb_classes.id WHERE tb_classes.id = 2;

SELECT * FROM tb_personagens INNER JOIN tb_classes ON tb_personagens.classe_id = tb_classes.id WHERE tb_classes.nome LIKE "%l%";