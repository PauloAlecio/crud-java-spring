create table estado (
        id int not null,
        nome varchar(20) not null,
        sigla varchar(2) not null 
        check (sigla in ('AC', 'AL', 'AM', 'AP', 'BA', 'CE', 'DF', 'ES', 'GO', 'MA', 'MG', 'MS', 'MT', 'PA', 
                      'PB', 'PE', 'PI', 'PR', 'RJ', 'RN', 'RO', 'RR', 'RS', 'SC', 'SE', 'SP', 'TO')),
        primary key (id)
    )