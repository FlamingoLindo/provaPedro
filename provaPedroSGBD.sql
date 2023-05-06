create database provaPedro;

create table automoveis(
idAuto serial primary key,
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
idFun serial primary key,
nomeFun varchar(100),
sobrenomeFun varchar(100),
senhaFun varchar(100),
dataNascimentoFun date,
rgFun varchar(100),
cpfFun varchar(100)
);

insert into funcionario (nomeFun,sobrenomeFun,senhaFun,dataNascimentoFun,rgFun,cpfFun)values("Adolfo","Jonathan","babababa","1999-02-15","25.865.801-0","879.855.410-71");
select * from funcionario;

create table cliente(
idCli serial primary key,
nomeCli varchar(100),
sobrenomeCli varchar(100),
senhaCli varchar(100),
dataNascimentoCli date,
rgCli varchar(100),
cpfCli varchar(100),
gasto float
);

insert into cliente (nomeCli,sobrenomeCli,senhaCli,dataNascimentoCli,rgCli,cpfCli,gasto)values("Junior","Burtan","funfun","2023-12-01","42.123.633-4","876.922.430-29",2452312254);
select * from cliente;