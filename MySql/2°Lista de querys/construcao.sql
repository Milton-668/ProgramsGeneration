create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
	id bigint(5) auto_increment,
    tipo varchar(255) not null, 
    tamanho varchar(20) not null, 
    acabamento boolean not null, 
    
    primary key (id)
);

insert tb_categoria(tipo,tamanho,acabamento) values ("HIDRÚLICA","10 METROS",true);
insert tb_categoria(tipo,tamanho,acabamento) values ("ELÉTRICA","15 METROS",true);
insert tb_categoria(tipo,tamanho,acabamento) values ("ALVENARIA"," 5 METROS",true);
insert tb_categoria(tipo,tamanho,acabamento) values ("FERRAGEM","10 METROS",true);
insert tb_categoria(tipo,tamanho,acabamento) values ("PINTURA","18 LITROS",true);

select*from tb_categoria;

create table tb_produtos(
	id bigint(5) auto_increment,
    nome varchar(255),
    preco float(5,2),
    cor varchar(20),
    categoria_id bigint,
    
    primary key (id),
    
    FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
    
);
insert tb_produtos(nome,preco,cor,categoria_id) values ("CANO DE 60mm","50.00","BRANCO",1);
insert tb_produtos(nome,preco,cor,categoria_id) values ("CANO DE 30mm","25.00","BRANCO",1);
insert tb_produtos(nome,preco,cor,categoria_id) values ("TINTA ACRILICA","250.00","BEGE",5);
insert tb_produtos(nome,preco,cor,categoria_id) values ("TINTA DE PISO","215.50","PRETA",5);
insert tb_produtos(nome,preco,cor,categoria_id) values ("FIO DE 3MM ","35.50","PRETO",2);
insert tb_produtos(nome,preco,cor,categoria_id) values ("SAPATAS","50.00","PADRÃOO",4);
insert tb_produtos(nome,preco,cor,categoria_id) values ("MILHEIRO DE TIJOLO","500.00","MARROM",3);
insert tb_produtos(nome,preco,cor,categoria_id) values ("AZULEJO","500.00","MESCLADO",3);

select *from tb_produtos;

select * from tb_produtos where preco > 50.00;
select * from tb_produtos where preco between 3.00 and 60.00;

select * from tb_produtos where nome like "%c%";

select * from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;

select * from tb_produtos where  cor like "%bra%";



