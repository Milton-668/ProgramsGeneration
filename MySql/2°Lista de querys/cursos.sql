create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;


create table tb_categoria(
	id bigint(5) auto_increment,
    area varchar(255),
    periodo int(20),
    tipo varchar(255),
    
    primary key (id)
);

insert tb_categoria(area,periodo,tipo) values("DESENVOLVIMENTO WEB","12","CERTIFICAÇÃO");
insert tb_categoria(area,periodo,tipo) values("DESENVOLVIMENTO MOBILE","6","CERTIFICAÇÃO");
insert tb_categoria(area,periodo,tipo) values("INFRAESTRUTURA","24","TECNOLOGO");
insert tb_categoria(area,periodo,tipo) values("DESENVOLVIMENTO DESKTOP","12","CERTIFICAÇÃO");
insert tb_categoria(area,periodo,tipo) values("USER EXPERIENCE","6","CERTIFICAÇÃO");

select *from tb_categoria;

create table tb_produtos(
	id bigint(5) auto_increment,
    curso varchar(255) not null,
    descricao varchar(255) not null, 
    preco float (5,2) not null,
    categoria_id bigint,
    
    primary key (id),
    
    FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_produtos(curso,descricao,preco,categoria_id) values("FRONT-END","HTML/CSS/JAVASCRIPT",500.00,1);
insert tb_produtos(curso,descricao,preco,categoria_id) values("BACK-END","JAVA/SPRINGBOOT",750.00,4);
insert tb_produtos(curso,descricao,preco,categoria_id) values("JOGOS DIGITAIS","C#/SWIFT",900.00,2);
insert tb_produtos(curso,descricao,preco,categoria_id) values("HARDWARE E REDES","MANUSEIO/TC-IP",250.00,3);
insert tb_produtos(curso,descricao,preco,categoria_id) values("EXPERIÊNCIA DO USUÁRIO","FERRAMENTAS DE DESIGN",950.00,1);
insert tb_produtos(curso,descricao,preco,categoria_id) values("DEVELOPER","C++/PYTHON",750.00,4);
insert tb_produtos(curso,descricao,preco,categoria_id) values("CABEAMENTO ","MANUESEIO FIRBRA",300.00,3);
insert tb_produtos(curso,descricao,preco,categoria_id) values("DBA","BANCO DE DADOS ",850.00,1);

select*from tb_produtos;

select * from tb_produtos where preco > 50.00;
select * from tb_produtos where preco between 3.00 and 600.00;

select * from tb_produtos where curso like "%j%";

select * from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;

select * from tb_produtos where  preco like "%750%";

