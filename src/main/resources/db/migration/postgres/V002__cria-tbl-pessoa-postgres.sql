create table pessoa (
        id bigserial not null,
        nome varchar(150) not null,
        idade date not null,
        sexo_id bigint not null,
        primary key (id)
    )