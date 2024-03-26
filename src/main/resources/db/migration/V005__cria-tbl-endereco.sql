create table endereco (
        id bigserial not null,
        bairro varchar(120) not null,
        cep varchar(8) not null,
        complemento varchar(120) not null,
        logradouro varchar(120) not null,
        numero varchar(5) not null,
        cidade_id bigint,
        pessoa_id bigint,
        primary key (id)
    )