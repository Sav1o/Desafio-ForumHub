create table topicos (

    id bigint not null auto_increment,
    titulo varchar(255) not null unique,
    mensagem varchar(255) not null unique,
    dataCriacao timestamp not null,
    estadoDoTopico tinyint not null,
    autor varchar(255) not null,
    curso varchar(255) not null,

    primary key (id)
);