create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe (
	
    id bigint auto_increment,
    nome varchar(100) not null,
    linguagem varchar(50) not null,
    nivel varchar (20) not null,
    
    primary key(id)
    
);

insert into tb_classe(nome,linguagem,nivel) values ("Desenvolvedor RPG","JAVA/SWIFT","PLENO");
insert into tb_classe(nome,linguagem,nivel) values ("Chefe desenvolvimento RPG","C#","SÊNIOR");
insert into tb_classe(nome,linguagem,nivel) values ("Testador de Jogos RPG","JAVA","PLENO");
insert into tb_classe(nome,linguagem,nivel) values ("Desenvolvedor de Design","OBJECTIVE-C","PLENO");
insert into tb_classe(nome,linguagem,nivel) values ("Desenvolvedor PLATAFORMA","JAVASCRIPT","PLENO");

select *from tb_classe;



create table tb_personagem (

	id bigint auto_increment,
    nome varchar(100) not null,
    idade int not null, 
    tipo varchar(100) not null,
    exp boolean not null,
    poder bigint not null,
    cargo_id bigint not null,
    
    primary key (id),
    
     foreign key (cargo_id) references tb_classe(id)
);

insert into tb_personagem(nome,idade,tipo,exp,poder,cargo_id) values ("CARLOS",23,"ARQUEIRO",true,2000,1);
insert into tb_personagem(nome,idade,tipo,exp,poder,cargo_id) values ("HENRIQUE",28,"FLANCO ",true,1500,3);
insert into tb_personagem(nome,idade,tipo,exp,poder,cargo_id) values ("MARIO",31,"GUERREIRO",true,3500,3);
insert into tb_personagem(nome,idade,tipo,exp,poder,cargo_id) values ("JHON",25,"ESPADCHIN",true,2300,2);
insert into tb_personagem(nome,idade,tipo,exp,poder,cargo_id) values ("ANTONIO",38,"GUARDIÃO",true,2800,4);
insert into tb_personagem(nome,idade,tipo,exp,poder,cargo_id) values ("FLAVIO",30,"FLANCO ",true,2500,1);
insert into tb_personagem(nome,idade,tipo,exp,poder,cargo_id) values ("VICTOR",20,"MAÇADOR",true,2000,1);
insert into tb_personagem(nome,idade,tipo,exp,poder,cargo_id) values ("VINI",19,"REI",true,3000,2);

select *from tb_personagem;

select * from tb_personagem where nome like "%a%";
select * from tb_personagem where poder > 2000;
select * from tb_personagem where poder between 1000 and 2000;
select count(*) from tb_personagem;
select sum(poder) from tb_personagem;
select avg(poder) as media from tb_personagem;

select* from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.cargo_id; 
select tb_personagem.nome, tb_classe.nome from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.cargo_id
where tb_personagem.exp = "1" and tb_personagem.poder< 2000 and tb_personagem.cargo_id >2;

select tb_personagem.nome, tb_classe.nome from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.cargo_id
where tb_personagem.exp = "0" or tb_personagem.poder<2000 ;

select tb_personagem.nome, tb_classe.nome from tb_personagem left join tb_classe on tb_classe.id = tb_personagem.cargo_id;

select* from tb_personagem left join tb_classe on tb_classe.id = tb_personagem.cargo_id; 
select* from tb_personagem right join tb_classe on tb_classe.id = tb_personagem.cargo_id; 




select * from tb_personagem where nome like "%c%";
select * from tb_personagem where tipo like "%FLAn%";