create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria (
id bigint auto_increment,
categoria varchar(255) not null,
primary key (id)
);

insert tb_categoria (categoria) values ("Medicamentos");
insert tb_categoria (categoria) values ("Suplementos");
insert tb_categoria (categoria) values ("Vitaminas");
insert tb_categoria (categoria) values ("Cosmético");
insert tb_categoria (categoria) values ("Maquiagem");

create table tb_produto (
id bigint auto_increment,
produto varchar (255) not null,
preco float not null,
estoque int not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_produto (produto,preco,estoque,categoria_id) values ("Protetor Solar",59.90,10,4);
insert tb_produto (produto,preco,estoque,categoria_id) values ("Vitamina A",29.90,10,3);
insert tb_produto (produto,preco,estoque,categoria_id) values ("Whey Pro Perfomance",79.90,10,2);
insert tb_produto (produto,preco,estoque,categoria_id) values ("Sabonete líquido",19.90,10,4);
insert tb_produto (produto,preco,estoque,categoria_id) values ("Vitamina C",29.90,10,3);
insert tb_produto (produto,preco,estoque,categoria_id) values ("Novalgina",9.90,10,1);
insert tb_produto (produto,preco,estoque,categoria_id) values ("Batom",29.90,10,5);
insert tb_produto (produto,preco,estoque,categoria_id) values ("Neosaldina",9.90,10,1);

select * from tb_produto;

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where produto like "%B%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select tb_produto.produto from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_categoria.categoria = "Vitaminas"