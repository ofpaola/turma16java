create database db_ecommerce;

use db_ecommerce;

create table usuario (
	id bigint auto_increment,
	nome varchar(255) not null,
	email varchar(255) not null,
	senha varchar(255) not null,
	localizacao varchar(255) not null,
	vendedor boolean not null,
	comprador boolean not null,
	primary key (id)
);

create table categoria (
	id bigint auto_increment,
	nome varchar(255) not null,
	classificacao varchar(255),
	ativo boolean not null,
	primary key (id)
);

create table produto (
	id bigint auto_increment,
	nome varchar(255) not null,
	descricao varchar(255) not null,
	localizacao varchar(255) not null,
	valor decimal not null,
	estoque float not null,
	categoria_id bigint,
	primary key (id),
    foreign key (categoria_id) references categoria(id)
);