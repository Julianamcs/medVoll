create table medicos(
    id bigint not null auto_increment,
    name vachar(100) not null,
    email vachar(100) not null,
    crm vachar(6) not null,
    especialidade vachar(100) not null,
    logradouro vachar(100) not null,
    bairro vachar(100) not null,
    cep vachar(9) not null,
    complemento vachar(100) not null,
    numero vachar(100) not null,
    uf vachar(2) not null,
    cidade vachar(100) not null,

    primary key(id)

);