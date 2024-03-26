create table cidade (
        id bigserial not null,
        nome varchar(120) not null,
        estado_id bigint,
        primary key (id)
    )