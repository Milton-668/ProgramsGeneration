create database db_cadastro_rh;

use db_cadastro_rh;

Create table tb_cadastro(
	id bigint auto_increment,
    nome varchar(255) not null,
    idade int not null,
    salario float not null,
    cargo varchar(50) not null,
    primary key (id)
);

alter table tb_cadastro add setor varchar(30);

insert into tb_cadastro (nome,idade,salario,cargo,setor) values ("João",30,1500.50,"Ajudante Geral","SOLDA");
insert into tb_cadastro (nome,idade,salario,cargo,setor) values ("Ananias",58,3500.50,"Encarregado","ESTAMPARIA");
insert into tb_cadastro (nome,idade,salario,cargo,setor) values ("Josefa",48,2000.50,"Cozinheira","COZINHA");
insert into tb_cadastro (nome,idade,salario,cargo,setor) values ("Filomena",42,2700.50,"Administradora Pleno","FINANCEIRO");
insert into tb_cadastro (nome,idade,salario,cargo,setor) values ("Eriberto",22,1800.50,"Operador de CNC","FERRAMENTARIA");

select *from tb_cadastro;

select *from tb_cadastro where salario>2000;
select *from tb_cadastro where salario<2000;

update tb_cadastro set salario = 1800 where id = 3;

delete from tb_cadastro  where id =1; 
delete from tb_cadastro  where id =2;
delete from tb_cadastro  where id =3;
delete from tb_cadastro  where id =4;
delete from tb_cadastro  where id =5;
delete from tb_cadastro  where id =6;
delete from tb_cadastro  where id =7;
delete from tb_cadastro  where id =8;
delete from tb_cadastro  where id =9;
delete from tb_cadastro  where id =10;






