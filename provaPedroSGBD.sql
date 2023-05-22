create database provaPedro;

create table automoveis(
idAuto serial primary key,
marca varchar(100),
modelo varchar(100),
cor varchar(100),
importado varchar(3),
numeroRodas int,
preco double
);

insert into automoveis (marca,modelo,cor,importado,numeroRodas,preco)values("Carro1","Sedan","Azaul","Sim",4,123.00);
insert into automoveis (marca,modelo,cor,importado,numeroRodas,preco)values("Carro2","SUV","Vermelho","Não",4,2453345);
insert into automoveis (marca,modelo,cor,importado,numeroRodas,preco)values("Carro3","Sedan","Amarelo","Sim",2,44.00);
insert into automoveis (marca,modelo,cor,importado,numeroRodas,preco)values("Carro4","Esportivo","Roxo","Sim",4,231243214.00);
insert into automoveis (marca,modelo,cor,importado,numeroRodas,preco)values("Carro5","Luxo","Verde","Sim",10,1.00);
insert into automoveis (marca,modelo,cor,importado,numeroRodas,preco)values("Carro6","Sedan","Azul","Sim",4,123424144.00);
insert into automoveis (marca,modelo,cor,importado,numeroRodas,preco)values("Carro7","SUV","Laranja","Não",4,123);
insert into automoveis (marca,modelo,cor,importado,numeroRodas,preco)values("Mario Kart","Esportivo","Vermelho, preto e branco","Sim",4,99999);
insert into automoveis (marca,modelo,cor,importado,numeroRodas,preco)values("Mario Kart","Casual","Vermelho, amarelo, preto e branco","Não",3,0);
insert into automoveis (marca,modelo,cor,importado,numeroRodas,preco)values("Mario Kart","SUV","Roxo, prata e bege","Sim",4,99999999);
insert into automoveis (marca,modelo,cor,importado,numeroRodas,preco)values("Mario Kart","Esportivo","Branco, verde e amarelo","Não",4,12345);
insert into automoveis (marca,modelo,cor,importado,numeroRodas,preco)values("Hello Kitty","Triciclo","Branco e rosa","Sim",3,2.864172647916416e15);
select * from automoveis where idAuto = 4;
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
insert into funcionario (nomeFun,sobrenomeFun,senhaFun,dataNascimentoFun,rgFun,cpfFun)values("Qandke","Eatocean","senha123","2132-11-11","39.466.228-3","345.791.900-33");
insert into funcionario (nomeFun,sobrenomeFun,senhaFun,dataNascimentoFun,rgFun,cpfFun)values("Roberto","Robertin","bananananaan","2000-02-15","32.657.052-4","281.783.360-06");
insert into funcionario (nomeFun,sobrenomeFun,senhaFun,dataNascimentoFun,rgFun,cpfFun)values("Roberta","Carlita","batatatata","1808-02-15","16.106.641-0","727.598.810-08");
select nomeFun,sobrenomeFun,senhaFun,dataNascimentoFun,rgFun,cpfFun from funcionario where idFun = 1; 
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

insert into cliente (nomeCli,sobrenomeCli,senhaCli,dataNascimentoCli,rgCli,cpfCli,gasto)values("Junior","Burtan","senhaoriginal123","2023-12-01","42.123.633-4","876.922.430-29",2452312254);
insert into cliente (nomeCli,sobrenomeCli,senhaCli,dataNascimentoCli,rgCli,cpfCli,gasto)values("CArlos","Roberto","pao123","2023-12-01","13.455.951-4","848.348.780-23",0);
insert into cliente (nomeCli,sobrenomeCli,senhaCli,dataNascimentoCli,rgCli,cpfCli,gasto)values("Roberto","Carlos","arrozcomfeijao","2023-12-01","23.743.120-8","449.617.460-02",0);
insert into cliente (nomeCli,sobrenomeCli,senhaCli,dataNascimentoCli,rgCli,cpfCli,gasto)values("Mario","Bros","senhasenhasenha","2023-12-01","26.400.483-8","484.353.690-30",12345);
select nomeCli,sobrenomeCli,senhaCli,dataNascimentoCli,rgCli,cpfCli from cliente where idCli = 1;
select * from cliente;