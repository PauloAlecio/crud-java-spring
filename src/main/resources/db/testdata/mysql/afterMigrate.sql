DELETE FROM endereco;
ALTER TABLE endereco auto_increment = 1;


DELETE FROM cidade;
ALTER TABLE cidade auto_increment = 1;


DELETE FROM pessoa;
ALTER TABLE pessoa auto_increment = 1;


DELETE FROM sexo;
ALTER TABLE sexo auto_increment = 1;


DELETE FROM estado;
ALTER TABLE estado auto_increment = 1;


-- Inserção de dados na tabela sexo

INSERT INTO sexo (id,nome) VALUES (1,'MASCULINO');
INSERT INTO sexo (id,nome)  VALUES (2,'FEMININO');


-- Inserção de dados na tabela pessoa
INSERT INTO pessoa (id,nome, idade, sexo_id) VALUES (1,'João', '1985-02-16', 1);
INSERT INTO pessoa (id,nome, idade, sexo_id) VALUES (2,'Maria', '1972-04-15', 2);
INSERT INTO pessoa (id,nome, idade, sexo_id) VALUES (3,'Carlos', '1964-07-14', 1);
INSERT INTO pessoa (id,nome, idade, sexo_id) VALUES (4,'Ana', '1992-12-17', 2);
INSERT INTO pessoa (id,nome, idade, sexo_id) VALUES (5,'Suellen', '1996-05-16', 2);
INSERT INTO pessoa (id,nome, idade, sexo_id) VALUES (6,'Paulo', '1998-11-28', 1);
INSERT INTO pessoa (id,nome, idade, sexo_id) VALUES (7,'Silva', '1980-10-23', 2);



-- Inserindo dados na tabela estado
INSERT INTO estado (id, nome, sigla) VALUES(1, 'Acre', 'AC');
INSERT INTO estado (id, nome, sigla) VALUES(2, 'Alagoas', 'AL');
INSERT INTO estado (id, nome, sigla) VALUES(3, 'Amazonas', 'AM');
INSERT INTO estado (id, nome, sigla) VALUES(4, 'Amapá', 'AP');
INSERT INTO estado (id, nome, sigla) VALUES(5, 'Bahia', 'BA');
INSERT INTO estado (id, nome, sigla) VALUES(6, 'Ceará', 'CE');
INSERT INTO estado (id, nome, sigla) VALUES(7, 'Distrito Federal', 'DF');
INSERT INTO estado (id, nome, sigla) VALUES(8, 'Espírito Santo', 'ES');
INSERT INTO estado (id, nome, sigla) VALUES(9, 'Goiás', 'GO');
INSERT INTO estado (id, nome, sigla) VALUES(10, 'Maranhão', 'MA');
INSERT INTO estado (id, nome, sigla) VALUES(11, 'Minas Gerais', 'MG');
INSERT INTO estado (id, nome, sigla) VALUES(12, 'Mato Grosso do Sul','MS');
INSERT INTO estado (id, nome, sigla) VALUES(13, 'Mato Grosso', 'MT');
INSERT INTO estado (id, nome, sigla) VALUES(14, 'Pará', 'PA');
INSERT INTO estado (id, nome, sigla) VALUES(15, 'Paraíba', 'PB');
INSERT INTO estado (id, nome, sigla) VALUES(16, 'Pernambuco', 'PE');
INSERT INTO estado (id, nome, sigla) VALUES(17, 'Piauí', 'PI');
INSERT INTO estado (id, nome, sigla) VALUES(18, 'Paraná', 'PR');
INSERT INTO estado (id, nome, sigla) VALUES(19, 'Rio de Janeiro', 'RJ');
INSERT INTO estado (id, nome, sigla) VALUES(20, 'Rio Grande do Norte', 'RN');
INSERT INTO estado (id, nome, sigla) VALUES(21, 'Rondônia', 'RO');
INSERT INTO estado (id, nome, sigla) VALUES(22, 'Roraima', 'RR');
INSERT INTO estado (id, nome, sigla) VALUES(23, 'Rio Grande do Sul', 'RS');
INSERT INTO estado (id, nome, sigla) VALUES(24, 'Santa Catarina', 'SC');
INSERT INTO estado (id, nome, sigla) VALUES(25, 'Sergipe', 'SE');
INSERT INTO estado (id, nome, sigla) VALUES(26, 'São Paulo', 'SP');
INSERT INTO estado (id, nome, sigla) VALUES(27, 'Tocantins', 'TO');


-- Inserindo dados na tabela cidade
INSERT INTO cidade (id, nome, estado_id) VALUES(1, 'Manaus',3);
INSERT INTO cidade (id, nome, estado_id) VALUES(2, 'Bauru',26);
INSERT INTO cidade (id, nome, estado_id) VALUES(3, 'Jordão',1);
INSERT INTO cidade (id, nome, estado_id) VALUES(4, 'Cuité',15);
INSERT INTO cidade (id, nome, estado_id) VALUES(5, 'Sobradinho',7);
INSERT INTO cidade (id, nome, estado_id) VALUES(6, 'Porto Velho',21);
INSERT INTO cidade (id, nome, estado_id) VALUES(7, 'Vitória',8);



-- Inserindo dados na tabela endereco
INSERT INTO endereco (id, bairro, cep, complemento, logradouro, numero, cidade_id, pessoa_id) VALUES (1, 'Margaridas', '27949442', 'casa', 'Rua Flor de Liz','662' , 1, 7);
	

INSERT INTO endereco (id, bairro, cep, complemento, logradouro, numero, cidade_id, pessoa_id) VALUES (2, 'Tangarás', '01153000', 'casa', 'Rua Bento Cruz','553' , 2, 6);
		
	
INSERT INTO endereco (id, bairro, cep, complemento, logradouro, numero, cidade_id, pessoa_id) VALUES (3, 'Anacleto', '69900000', 'BLOCO-C AP.222', 'Rua Benjamim Anacleto','752' , 3, 5);
	
	
INSERT INTO endereco (id, bairro, cep, complemento, logradouro, numero, cidade_id, pessoa_id) VALUES (4, 'Paraíbano', '58200000', 'BLOCO-A AP.325', 'Rua Paraíba','553' , 4, 2);
	
	
INSERT INTO endereco (id, bairro, cep, complemento, logradouro, numero, cidade_id, pessoa_id) VALUES (5, 'Brasilandia', '70070080', 'casa', 'Rua Brasilandia Norte','423' , 5, 1);
	
	
INSERT INTO endereco (id, bairro, cep, complemento, logradouro, numero, cidade_id, pessoa_id)	VALUES (6, 'Rondonópolis', '76995000', 'BLOCO-B AP.325', 'Rua Rosa Maria','443' , 6, 4);
	
	
INSERT INTO endereco (id, bairro, cep, complemento, logradouro, numero, cidade_id, pessoa_id)	VALUES (7, 'Vitória', '29010035', 'BLOCO-E AP.405', 'Rua Rosa Maria','204' , 7, 3);

	
	