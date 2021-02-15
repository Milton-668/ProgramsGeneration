create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
    id bigint auto_increment,
    tipo bigint not null,
    quantidade int not null,
    frequencia varchar(30),
    primary key(id)
);

insert into tb_categoria(tipo,quantidade,frequencia) values (10,30,"12-HRS");
insert into tb_categoria(tipo,quantidade,frequencia) values (25,60,"6-HRS");
insert into tb_categoria(tipo,quantidade,frequencia) values (15,45,"8-HRS");
insert into tb_categoria(tipo,quantidade,frequencia) values (30,90,"3-HRS");
insert into tb_categoria(tipo,quantidade,frequencia) values (35,120,"2-HRS");

select*from tb_categoria;

create table tb_produto(
	id bigint auto_increment,
    nome varchar(100),
    prescricao varchar(100),
    validade varchar(20),
    uso varchar(10),
    preco float(5,2),
    medic_id bigint,
    
    primary key(id),
    
    foreign key (medic_id) references tb_categoria(id)
);
insert into tb_produto(nome,prescricao,validade,uso,preco,medic_id) values ("LORATADINA","ALERGIA E ESPIRRO","60 dias","oral",10.50,2);
insert into tb_produto(nome,prescricao,validade,uso,preco,medic_id) values ("DORIL","DORES MUSCULARES","90 dias","oral",5.50,2);
insert into tb_produto(nome,prescricao,validade,uso,preco,medic_id) values ("NIMESULIDA","INFLAMAÇÕES","120 dias","oral",8.50,3);
insert into tb_produto(nome,prescricao,validade,uso,preco,medic_id) values ("PANTOPRAZOL","GASTRITE","60 dias","oral",55.00,4);
insert into tb_produto(nome,prescricao,validade,uso,preco,medic_id) values ("LUFITAL","DESCONFORTO ABDOMINAL","90 dias","oral",55.00,2);
insert into tb_produto(nome,prescricao,validade,uso,preco,medic_id) values ("ESTUGERON","PRESSÃO ALTA","30 dias","oral",65.90,5);
insert into tb_produto(nome,prescricao,validade,uso,preco,medic_id) values ("VIAGRA","----------","60 dias","oral",70.00,2);
insert into tb_produto(nome,prescricao,validade,uso,preco,medic_id) values ("MARACUJINA","ESTRESSE","90 dias","oral",50.00,2);

select *from tb_produto;

select * from tb_produto where preco > 50.00;
select * from tb_produto where preco between 3.00 and 60.00;

select * from tb_produto where nome like "%c%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.medic_id;
select * from tb_produto where validade like "%60 dias%";
