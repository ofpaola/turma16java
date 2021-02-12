-- cria um banco de dados
create database db_servico_rh;

-- acessa o banco de dados
use db_servico_rh;

-- cria tabela 
create table tb_funcionarios(
id bigint auto_increment,
nome varchar(255) not null,
idade int not null,
salario float not null,
ativo boolean,
primary key(id)
);

-- busca das informações da tabela funcionario
select * from tb_funcionarios;

select nome, salario from  tb_funcionarios where salario < 20000;

-- cadastra dados na minha tabela
insert into tb_funcionarios (nome,idade,salario) values ("Raphael",00,10000);
insert into tb_funcionarios (nome,idade,salario) values ("Mayara",00,10000);

-- add coluna na tabela
alter table tb_funcionarios
add decricao varchar(255);

-- modifica coluna no banco de dados
alter table  tb_funcionarios change decricao descricao_funcionario varchar(255);

-- atualiza um dado na tabela
update tb_funcionarios set salario =  20000 where id = 2;

-- delete uma linha da tabela
delete from tb_funcionarios where id = 3;
