create database db_e_commerce;

use db_e_commerce;

create table tb_produtos (
	id bigint auto_increment,
	produto varchar(255) not null,
	quantidade int not null,
	valor float not null,
    cor varchar(30) not null,
	primary key(id)
);

select * from tb_produtos;

select produto, valor from  tb_produtos where valor < 500;

select * from tb_produtos;

select produto, valor from  tb_produtos where valor > 500;

insert into tb_produtos (produto,quantidade,valor,cor) values ("Fone de Ouvido Bluetooth",100,299.90,"Preto");
insert into tb_produtos (produto,quantidade,valor,cor) values ("Carregador Portatil",100,129.90,"Branco");
insert into tb_produtos (produto,quantidade,valor,cor) values ("RingLight",100,29.90,"Preta");
insert into tb_produtos (produto,quantidade,valor,cor) values ("Mesa Digitalizadora",100,290.00,"Preta");
insert into tb_produtos (produto,quantidade,valor,cor) values ("Tablet",100,629.90,"Cinza");
insert into tb_produtos (produto,quantidade,valor,cor) values ("Câmera Instantânea",100,559.90,"Azul");
insert into tb_produtos (produto,quantidade,valor,cor) values ("Caixa de Som",100,790.90,"Preta");
insert into tb_produtos (produto,quantidade,valor,cor) values ("Mini Impressora de Fotos",100,699.90,"Preta");

