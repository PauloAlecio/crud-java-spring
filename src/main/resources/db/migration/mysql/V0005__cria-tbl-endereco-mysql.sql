create table endereco (
        id int not null,
        bairro varchar(120) not null,
        cep varchar(8) not null,
        complemento varchar(120) not null,
        logradouro varchar(120) not null,
        numero varchar(5) not null,
        cidade_id int,
        pessoa_id int,
        primary key (id)
    )