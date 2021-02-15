create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(100) not null,
osso boolean not null,
ativo boolean not null,

primary key (id)
);

insert tb_categoria (descricao,osso,ativo) values ("BOVINO",true,true);
insert tb_categoria (descricao,osso,ativo) values ("SUINO",true,true);
insert tb_categoria (descricao,osso,ativo) values ("AVES",true,true);
insert tb_categoria (descricao,osso,ativo) values ("PERTENCE FEIJOADA",true,true);
insert tb_categoria (descricao,osso,ativo) values ("Embutidos",false,true);
insert tb_categoria (descricao,osso,ativo) values ("OUTROS",false,true);


select * from tb_categoria;

create table tb_produtos (
id bigint auto_increment,
nome varchar (100) not null,
preco decimal not null,
qtProduto int not null,
nobre boolean not null,
fresca boolean not null,
categoria_id bigint,

primary key (id),

FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_produtos (nome, preco, qtProduto, nobre,fresca,categoria_id) values ("ASA",40.00,30,1,1,3);
insert tb_produtos (nome, preco, qtProduto, nobre,fresca,categoria_id) values ("MAMINHA",20.00,30,1,1,1);
insert tb_produtos (nome, preco, qtProduto, nobre,fresca,categoria_id) values ("COXA PERNIL",20.00,30,1,1,3);
insert tb_produtos (nome, preco, qtProduto, nobre,fresca,categoria_id) values ("BACON",30.00,30,1,1,1);
insert tb_produtos (nome, preco, qtProduto, nobre,fresca,categoria_id) values ("HAMBURGUER",60.00,30,1,1,5);
insert tb_produtos (nome, preco, qtProduto, nobre,fresca,categoria_id) values ("CUPIM",20.00,30,1,1,1);
insert tb_produtos (nome, preco, qtProduto, nobre,fresca,categoria_id) values ("FILÉ DE PEITO",25.00,30,1,1,3);
insert tb_produtos (nome, preco, qtProduto, nobre,fresca,categoria_id) values ("RABO DE PORCO",20.00,30,1,1,4);
insert tb_produtos (nome, preco, qtProduto, nobre,fresca,categoria_id) values ("SALSICHA",18.00,30,1,1,5);
insert tb_produtos (nome, preco, qtProduto, nobre,fresca,categoria_id) values ("MEDLÃO",50.00,30,1,1,3);
insert tb_produtos (nome, preco, qtProduto, nobre,fresca,categoria_id) values ("MOCOTÓ",20.00,30,1,1,2);
insert tb_produtos (nome, preco, qtProduto, nobre,fresca,categoria_id) values ("CHULETA",20.00,30,1,1,1);
insert tb_produtos (nome, preco, qtProduto, nobre,fresca,categoria_id) values ("CARVÃO",20.00,30,0,0,3);

select * from tb_produtos;

select * from tb_produtos where preco > 50.00;
select * from tb_produtos where preco between 3.00 and 60.00;

select * from tb_produtos where nome like "%c%";

select * from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;

select * from tb_produtos where qtProduto like "%30%";