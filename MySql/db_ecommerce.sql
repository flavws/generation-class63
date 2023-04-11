CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(30),
    categoria VARCHAR(20),
    preco DECIMAL(8,2),
    qtde INT,
    
    PRIMARY KEY(id)
    
    );
    
    INSERT INTO tb_produtos(nome, categoria, preco, qtde)
    VALUES ("celular","smartphones",1500.00,2), 
		("estante","movel",169.99,8), 
		("mouse","perifericos",45.00,15), 
		("xbox", "jogos", 2500.00, 1),
        ("cadeira", "movel", 70.00, 4),
        ("cama para cachorro", "pets", 120.00, 5),
        ("teclado gamer", "perifericos", 160.50, 2),
        ("pneu", "automoveis", 175.99, 4);
    
    SELECT * FROM tb_produtos;
    
    SELECT * FROM tb_produtos WHERE preco > 500;
    
	SELECT * FROM tb_produtos WHERE preco < 500;
    
	UPDATE tb_produtos
    SET nome = "teclado gamer"
    WHERE id = 7;