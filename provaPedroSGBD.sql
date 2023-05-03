create database provaPedro;

create table automoveis(
id serial primary key,
marca varchar(100),
modelo varchar(100),
cor varchar(100),
importado boolean,
numeroRodas int,
preco float
);

insert into automoveis (marca,modelo,cor,importado,numeroRodas,preco)values("Nissa","Sedan","Azul",false,4,123424144.00);
select * from automoveis;

create table funcionario(
id serial primary key,
nome varchar(100),
sobrenome varchar(100),
dataNascimento date,
rg varchar(100),
cpf varchar(100)
);

insert into funcionario (nome,sobrenome,dataNascimento,rg,cpf)values("Adolfo","Jonathan","1999-02-15","25.865.801-0","879.855.410-71");
select * from funcionario;

create table cliente(
id serial primary key,
nome varchar(100),
sobrenome varchar(100),
dataNascimento date,
rg varchar(100),
cpf varchar(100),
gasto float
);

insert into cliente (nome,sobrenome,dataNascimento,rg,cpf,gasto)values("Junior","Burtan","2023-12-01","42.123.633-4","876.922.430-29",2452312254);
select * from cliente;