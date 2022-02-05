create database vendasDesktop;
use vendasDesktop;

create table vendedor(
idVendedor int primary key auto_increment ,
nomeUsuario varchar(100) not null,
codVendedor varchar(8) not null,
biVendedor varchar(14) not null,
nomeVendedor varchar(255) not null,
telefoneVendedor varchar(15),
estado varchar(1) not null
);

describe vendedor;

create table cliente(
idCliente int primary key auto_increment,
codCliente varchar(8) not null,
biCliente varchar(14) not null,
nomeCliente varchar(255) not null, 
enderecoCliente varchar(255),
estadoCliente varchar(1) not null
);

select * from cliente;

create table vendas(
idVenda int primary key auto_increment,
vendedor_idVendedor int not null, 
cliente_idCliente int not null,
numeroVendas varchar(255) not null,
dataVenda date,
valorVenda double not null,
estadoVenda varchar(1),
foreign key(vendedor_idVendedor) references vendedor(idVendedor) on delete cascade on update cascade,
foreign key(cliente_idCliente) references cliente(idCliente) on delete cascade on update cascade
);

create table produto(
idProduto int primary key auto_increment,
nomeProduto varchar(255) not null,
precoProduto double not null,
stockProduto int not null,
estadoProduto varchar(1)
);

create table detalhesVenda(
idDetalhe int primary key auto_increment,
venda_idVenda int not null,
produto_idProduto int not null,
quantidade int(11) not null,
valorTotal double not null,
foreign key(venda_idVenda) references vendas(idVenda) on delete no action on update cascade,
foreign key(produto_idProduto) references produto(idProduto) on delete no action on update cascade 
);

select * from detalhesVenda
inner join vendas on  venda_idVenda = idVenda
inner join produto on produto_idProduto = idProduto
inner join vendedor on vendedor_idVendedor = idVendedor
inner join cliente on cliente_idCliente = idCliente
where idVenda = 18;

select * from vendas
inner join vendedor on vendedor_idVendedor = idVendedor
inner join cliente on cliente_idCliente = idCliente;

select max(numeroVendas) from vendas;