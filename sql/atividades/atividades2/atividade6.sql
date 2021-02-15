create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria (
id bigint auto_increment,
tipo varchar(255) not null,
primary key (id)
);

insert tb_categoria (tipo) values ("Tecnologia da Informação");
insert tb_categoria (tipo) values ("Línguas");
insert tb_categoria (tipo) values ("Artes");
insert tb_categoria (tipo) values ("Administração");
insert tb_categoria (tipo) values ("Meio Ambiente");

create table tb_curso (
id bigint auto_increment,
curso varchar (255) not null,
valor float not null,
nivel varchar (255) not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_curso (curso,valor,nivel,categoria_id) values ("Inglês",159.90,"Avançado",2);
insert tb_curso (curso,valor,nivel,categoria_id) values ("Poluição",39.90,"Avançado",5);
insert tb_curso (curso,valor,nivel,categoria_id) values ("Desenvolvedor Web FullStack",298.99,"Iniciante",1);
insert tb_curso (curso,valor,nivel,categoria_id) values ("Artes Plásticas",455.90,"Intermediário",3);
insert tb_curso (curso,valor,nivel,categoria_id) values ("Alemão",109.90,"Iniciante",2);
insert tb_curso (curso,valor,nivel,categoria_id) values ("Desenvolvedor Mobile",89.90,"Intermediário",1);
insert tb_curso (curso,valor,nivel,categoria_id) values ("Empreendedorismo",45.90,"Intermediário",4);
insert tb_curso (curso,valor,nivel,categoria_id) values ("Artes Cênicas",500.00,"Avançado",3);

select * from tb_curso;

select * from tb_curso where valor > 50;

select * from tb_curso where valor between 3 and 60;

select * from tb_curso where curso like "%J%";

select * from tb_curso inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id;

select tb_curso.curso from tb_curso inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id where tb_categoria.tipo = "Artes"