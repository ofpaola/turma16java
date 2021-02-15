create database db_servico_rh;

use db_servico_rh;

create table tb_funcionarios (
	id bigint auto_increment,
	nome varchar(255) not null,
	idade int not null,
    cargo varchar(255) not null,
	salario float not null,
	ativo boolean,
	primary key(id)
);

select * from tb_funcionarios;

select nome, salario from  tb_funcionarios where salario < 20000;

select * from tb_funcionarios;

select nome, salario from  tb_funcionarios where salario > 20000;

insert into tb_funcionarios (nome,idade,cargo,salario) values ("Felipe",00,"Desenvolvedor front-end",20000);
insert into tb_funcionarios (nome,idade,cargo,salario) values ("Jean",00,"Desenvolvedor back-end",25000);
insert into tb_funcionarios (nome,idade,cargo,salario) values ("Paola",00,"Desenvolvedora full stack",18000);
insert into tb_funcionarios (nome,idade,cargo,salario) values ("Rui",00,"Analista de dados",10000);
insert into tb_funcionarios (nome,idade,cargo,salario) values ("Tatiane",00,"Gerente de dados",28000);