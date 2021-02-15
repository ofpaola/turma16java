create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria (
id bigint auto_increment,
categoria varchar(255) not null,
primary key (id)
);

insert tb_categoria (categoria) values ("Seitan");
insert tb_categoria (categoria) values ("Soja");
insert tb_categoria (categoria) values ("Tempeh");
insert tb_categoria (categoria) values ("Jaca");
insert tb_categoria (categoria) values ("Cogumelos");

create table tb_produto (
id bigint auto_increment,
produto varchar (255) not null,
preco float not null,
quantidade int not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_produto (produto,preco,quantidade,categoria_id) values ("Carne de Seitan",59.90,10,1);
insert tb_produto (produto,preco,quantidade,categoria_id) values ("Hamburguer de Soja",9.90,10,2);
insert tb_produto (produto,preco,quantidade,categoria_id) values ("Frango de Jaca",19.90,10,4);
insert tb_produto (produto,preco,quantidade,categoria_id) values ("Frango de Seitan",15.90,10,1);
insert tb_produto (produto,preco,quantidade,categoria_id) values ("Carne de Cogumelos",18.90,10,5);
insert tb_produto (produto,preco,quantidade,categoria_id) values ("Bacon de Tempeh",17.90,10,3);
insert tb_produto (produto,preco,quantidade,categoria_id) values ("Linguiça de Soja",29.90,10,2);
insert tb_produto (produto,preco,quantidade,categoria_id) values ("Hamburguer de Cogumelos",9.90,10,5);

select * from tb_produto;

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where produto like "%C%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select tb_produto.produto from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_categoria.categoria = "Seitan"