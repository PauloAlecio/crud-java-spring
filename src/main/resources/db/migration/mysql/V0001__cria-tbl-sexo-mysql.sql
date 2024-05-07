create table sexo (
        id int not null,
        nome varchar(9) not null check (nome in ('MASCULINO','FEMININO')),
        primary key (id)
    )