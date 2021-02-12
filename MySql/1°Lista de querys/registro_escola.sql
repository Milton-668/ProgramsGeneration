create database db_registro_escola;


use db_registro_escola;

create table tb_registro_escola(

	id bigint auto_increment,
	matricula int not null,
    nome varchar(255) not null,
    sala int not null,
    nota float(10,2) not null,
    materia varchar(255),
    
    primary key(id)
);

insert into tb_registro_escola(nome,matricula,sala,nota,materia) values ("MARCOS ABREU ROCHA",10,13,7.5,"GEOGRAFIA");
insert into tb_registro_escola(nome,matricula,sala,nota,materia) values ("JOÃO PINTO ROCHA",15,13,9.0,"FILOSOFIA");
insert into tb_registro_escola(nome,matricula,sala,nota,materia) values ("MARIA CANDIDA ROCHA",30,12,6.8,"FÍSICA QUÂNTICA");
insert into tb_registro_escola(nome,matricula,sala,nota,materia) values ("YASMIM FERREIRA ROCHA",45,12,5.8,"FÍSICA");
insert into tb_registro_escola(nome,matricula,sala,nota,materia) values ("JANA DEL REY",50,13,10,"MATEMÁTICA");
insert into tb_registro_escola(nome,matricula,sala,nota,materia) values ("OLINDA OLIVEIRA DEL REY",60,10,4.5,"BIOLOGIA");
insert into tb_registro_escola(nome,matricula,sala,nota,materia) values ("JANUARIA SOUSA LEME",65,10,5.5,"HISTÓRIA");
insert into tb_registro_escola(nome,matricula,sala,nota,materia) values ("FRANCESCO OLIVEIRA LEME",10,13,7.5,"ED.FÍSICA");

 select *from tb_registro_escola where nota>7;
select *from tb_registro_escola where nota<7;

select * from tb_registro_escola;

update tb_registro_escola set nota = 9.8 where id =2;


