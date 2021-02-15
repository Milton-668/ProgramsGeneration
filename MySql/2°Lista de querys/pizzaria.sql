create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
	
    id bigint auto_increment,
    tipo varchar(100) not null,
    tamanho varchar(20) not null,
    sabor varchar (20) not null,
    
    primary key  (id) 
);

insert into tb_categoria(tipo,tamanho,sabor) values ("Tradicional","8 PEDAÇOS","SALGADA");
insert into tb_categoria(tipo,tamanho,sabor) values ("PICANTE","8 PEDAÇOS","SALGADA");
insert into tb_categoria(tipo,tamanho,sabor) values ("Tradicional","4 PEDAÇOS","SALGADA");
insert into tb_categoria(tipo,tamanho,sabor) values ("PICANTE","4 PEDAÇOS","SALGADA");
insert into tb_categoria(tipo,tamanho,sabor) values ("Tradicional","8 PEDAÇOS","DOCE");

select * from tb_categoria;

create table tb_pizza(
	id bigint auto_increment,
    pizza varchar(50),
    descricao varchar(100),
    tempo int,
    bordas boolean,
    preco float(5,2),
    categoria_id bigint,
    
    primary key (id),
    
    foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_pizza(pizza,descricao,tempo,bordas,preco,categoria_id) values ("FRANGO C/MILHO","FRANGO, MOLHO e MILHO",60,TRUE,35.50,1);
insert into tb_pizza(pizza,descricao,tempo,bordas,preco,categoria_id) values ("FRANGO C/MILHO","FRANGO, MOLHO, MILHO E CATUPIRY",55,TRUE,40.50,1);
insert into tb_pizza(pizza,descricao,tempo,bordas,preco,categoria_id) values ("CALABRESA PICANTE","CALABRESA, CEBOLA E PIMENTA",50,TRUE,32.50,2);
insert into tb_pizza(pizza,descricao,tempo,bordas,preco,categoria_id) values ("CALABRESA","CALABRESA, MOLHO E CEBOLA",45,TRUE,27.50,1);
insert into tb_pizza(pizza,descricao,tempo,bordas,preco,categoria_id) values ("MEXICANA","PIMENTA, NACHOS E QUEIJO",60,TRUE,45.50,2);
insert into tb_pizza(pizza,descricao,tempo,bordas,preco,categoria_id) values ("FRANGO C/MILHO","FRANGO, MOLHO, MILHO E CATUPIRY",60,TRUE,15.99,4);
insert into tb_pizza(pizza,descricao,tempo,bordas,preco,categoria_id) values ("CALABRESA","CALABRESA, MOLHO E CEBOLA",30,TRUE,16.50,4);
insert into tb_pizza(pizza,descricao,tempo,bordas,preco,categoria_id) values ("BRIGADEIRO","CHOCOLATE E GRANULADO",45,FALSE,32.00,5);

select *from tb_pizza;

select * from tb_pizza where preco > 45.00;
select * from tb_pizza where preco between 29.00 and 60.00;
select * from tb_pizza where pizza like "%c%";

 
select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;

select * from tb_pizza where pizza like "%frango%";



