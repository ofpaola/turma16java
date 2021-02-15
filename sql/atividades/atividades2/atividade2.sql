create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria (
id bigint auto_increment,
tipo varchar(255) not null,
primary key (id)
);

insert tb_categoria (tipo) values ("Tradicional");
insert tb_categoria (tipo) values ("Doce");
insert tb_categoria (tipo) values ("Salgada");
insert tb_categoria (tipo) values ("Frita");
insert tb_categoria (tipo) values ("Vegana");

create table tb_pizza (
id bigint auto_increment,
sabor varchar (255) not null,
preco float not null,
tamanho varchar (255) not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_pizza (sabor, preco, tamanho, categoria_id) values ("Calabresa",29.90,"Média",1);
insert tb_pizza (sabor, preco, tamanho, categoria_id) values ("Chocolate c/ morango",46.90,"Grande",2);
insert tb_pizza (sabor, preco, tamanho, categoria_id) values ("Veguerita",19.90,"Grande",5);
insert tb_pizza (sabor, preco, tamanho, categoria_id) values ("Escarola c/ queijo",35.95,"Pequena",1);
insert tb_pizza (sabor, preco, tamanho, categoria_id) values ("Palmito",29.90,"Grande",5);
insert tb_pizza (sabor, preco, tamanho, categoria_id) values ("Marguerita",45.99,"Média",4);
insert tb_pizza (sabor, preco, tamanho, categoria_id) values ("À moda da casa",49.90,"Média",3);
insert tb_pizza (sabor, preco, tamanho, categoria_id) values ("Alho poró",38.90,"Grande",5);

select * from tb_pizza;

select * from tb_pizza where preco > 45;

select * from tb_pizza where preco between 29 and 60;

select * from tb_pizza where sabor like "%C%";

-- Faça um um select com Inner join entre tabela categoria e pizza.
select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).
select tb_pizza.sabor from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id where tb_categoria.tipo = "Vegana"