create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe (
	id bigint auto_increment,
	categoria varchar(255) not null,
	primary key(id)
);

insert tb_classe (categoria) values ("Mutante");
insert tb_classe (categoria) values ("Místico");
insert tb_classe (categoria) values ("Científico");
insert tb_classe (categoria) values ("Arqueiro");
insert tb_classe (categoria) values ("Folclórico");

create table tb_personagem (
	id bigint auto_increment,
	nome varchar(255) not null,
    sexo varchar(255) not null,
    forca int not null,
	ataque int not null,
	defesa int not null,
    classe_id bigint,
	primary key(id),
    foreign key(classe_id) references tb_classe(id)
);

insert tb_personagem (nome,sexo,forca,ataque,defesa, classe_id) values ("Tempestade","Feminino",10,2500,2000,1);
insert tb_personagem (nome,sexo,forca,ataque,defesa, classe_id) values ("Saci Pererê","Masculino",7,1500,2600,5);
insert tb_personagem (nome,sexo,forca,ataque,defesa, classe_id) values ("Robin Hood","Masculino",8,1500,2700,4);
insert tb_personagem (nome,sexo,forca,ataque,defesa, classe_id) values ("Professor Frink","Masculino",6,1000,2900,3);
insert tb_personagem (nome,sexo,forca,ataque,defesa, classe_id) values ("Magia","Feminino",9,3000,3800,2);
insert tb_personagem (nome,sexo,forca,ataque,defesa, classe_id) values ("Legolas","Masculino",9,2800,3500,4);
insert tb_personagem (nome,sexo,forca,ataque,defesa, classe_id) values ("Iara","Feminino",8,2000,3000,5);
insert tb_personagem (nome,sexo,forca,ataque,defesa, classe_id) values ("Clea","Feminino",9,1500,3100,2);

select * from tb_personagem where ataque > 2000;

select * from tb_personagem where defesa between 1000 and 2000;

select * from tb_personagem where nome like "%C%";

select * from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.classe_id;

select tb_personagem.nome from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.classe_id where tb_classe.categoria = "Místico"