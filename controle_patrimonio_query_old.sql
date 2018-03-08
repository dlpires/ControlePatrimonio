create database if not exists controle_patrimonio;

use controle_patrimonio;


create table if not exists usuario(
	login_usuario varchar(20) not null,
    senha_usuario varchar(20) not null,
    conf_senha_usuario varchar(20),
    nome_usuario varchar(30) not null,
    funcao_usuario varchar(20),
	cell_usuario varchar(20),
    nivel_Acesso int not null,
    constraint prk_login_usuario primary key (login_usuario)
);

create table if not exists patrimonio(
	cod_patrimonio int not null auto_increment,
	num_proc_entrada int not null,
	num_nota_fiscal int not null,
	nome_patrimonio varchar(30) not null,
	marca_patrimonio varchar(30),
    descricao_patrimonio varchar(200),
	modelo_patrimonio varchar(30),
	num_serie_patrimonio int not null,
	valor_patrimonio float not null,
	mod_aqu_patrimonio varchar(30),
	local_patrimonio varchar(30),
	baixa_patrimonio bit,
    constraint prk_cod_patrimonio primary key (cod_patrimonio)
);
