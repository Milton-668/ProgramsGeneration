create database db_ecommerce;

use db_ecommerce;

create table tb_ecommerce(
    id bigint auto_increment,
    produto varchar(255) not null,
    descricao varchar(255) not null,
    cor varchar(20)not null,
    preco float(10,2) not null,
	tamanho varchar(1),
    primary key (id)
    );
    
    insert into tb_ecommerce (produto,descricao,cor,preco,tamanho) values ("JOGO DE TALHER","MATERIAL EM PRATA","PRATEADA",550.59,"M");
    insert into tb_ecommerce (produto,descricao,cor,preco,tamanho) values ("JOGO DE PRATO","MATERIAL EM PORCELNA","BRANCA",1500.59,"M");
    insert into tb_ecommerce (produto,descricao,cor,preco,tamanho) values ("JOGO DE TAÇA","MATERIAL EM CRISTAL","INCOLOR",359.59,"P");
    insert into tb_ecommerce (produto,descricao,cor,preco,tamanho) values ("JOGO DE TOALHA","MATERIAL EM ALGODAO","BRANCA",121.59,"G");
    insert into tb_ecommerce (produto,descricao,cor,preco,tamanho) values ("QUADRO DE FOTOS","MATERIAL EM VIDRO","FOSCO",79.99,"M");
    insert into tb_ecommerce (produto,descricao,cor,preco,tamanho) values ("PUFF","MATERIAL EM ESTOPA","PRETO",59.99,"G");
    insert into tb_ecommerce (produto,descricao,cor,preco,tamanho) values ("MESA DE CENTRO","MATERIAL EM PINHEIRO","MARROM",259.99,"M");
    insert into tb_ecommerce (produto,descricao,cor,preco,tamanho) values ("TAPETE MOSAIDO","MATERIAL EM LÃ DE CARNEIRO","COLORIDO",1800.00,"G");
    
    select *from tb_ecommerce where preco>500;
	select *from tb_ecommerce where preco<500;

    select *from tb_ecommerce;

	update tb_ecommerce set descricao = "MATERIAL EM PORCELANA" where id =2;
	update tb_ecommerce set produto = "TAPETE MOSAICO" where id =8;