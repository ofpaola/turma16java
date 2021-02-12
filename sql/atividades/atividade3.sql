create database db_registro_escola;

use db_registro_escola;

create table tb_alunos (
	id bigint auto_increment,
	nome varchar(255) not null,
	idade int not null,
	nota float not null,
    turma varchar(255) not null,
	primary key(id)
);

select * from tb_alunos;

select nome, nota from  tb_alunos where nota < 7;

select * from tb_alunos;

select nome, nota from  tb_alunos where nota > 7;

insert into tb_alunos (nome,idade,nota,turma) values ("Paola",15,9,"Turma 16");
insert into tb_alunos (nome,idade,nota,turma) values ("João",12,7,"Turma 13");
insert into tb_alunos (nome,idade,nota,turma) values ("Alice",12,5,"Turma 13");
insert into tb_alunos (nome,idade,nota,turma) values ("Leonardo",13,8.5,"Turma 14");
insert into tb_alunos (nome,idade,nota,turma) values ("Luiza",15,6,"Turma 16");
insert into tb_alunos (nome,idade,nota,turma) values ("Pedro",14,6.5,"Turma 15");
insert into tb_alunos (nome,idade,nota,turma) values ("Barbara",13,5,"Turma 14");
insert into tb_alunos (nome,idade,nota,turma) values ("Felipe",14,8,"Turma 15");