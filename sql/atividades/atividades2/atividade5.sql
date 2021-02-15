create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria (
id bigint auto_increment,
categoria varchar(255) not null,
primary key (id)
);

insert tb_categoria (categoria) values ("Ferramentas");
insert tb_categoria (categoria) values ("Iluminação");
insert tb_categoria (categoria) values ("Madeira");
insert tb_categoria (categoria) values ("Decoração");
insert tb_categoria (categoria) values ("Material de Construção");

create table tb_produto (
id bigint auto_increment,
produto varchar (255) not null,
preco float not null,
estoque int not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_produto (produto,preco,estoque,categoria_id) values ("Refletor",89.90,10,2);
insert tb_produto (produto,preco,estoque,categoria_id) values ("Piso",9.90,10,3);
insert tb_produto (produto,preco,estoque,categoria_id) values ("Quadro",99.90,10,4);
insert tb_produto (produto,preco,estoque,categoria_id) values ("Tijolo",1.90,10,5);
insert tb_produto (produto,preco,estoque,categoria_id) values ("Cortina",78.90,10,4);
insert tb_produto (produto,preco,estoque,categoria_id) values ("Broca",0.90,10,1);
insert tb_produto (produto,preco,estoque,categoria_id) values ("Abajur",29.90,10,2);
insert tb_produto (produto,preco,estoque,categoria_id) values ("Forro",69.90,10,3);

select * from tb_produto;

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where produto like "%C%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select tb_produto.produto from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_categoria.categoria = "Decoração"