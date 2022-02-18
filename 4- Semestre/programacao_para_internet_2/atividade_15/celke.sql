
CREATE TABLE `candidato` (
  `id` int(11) NOT NULL,
  `nome` varchar(220) NOT NULL,
  `cargo` int(11) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

INSERT INTO `candidato` (`id`, `nome`, `cargo`) VALUES
(1, 'Nasser Othman', 9),
(2, 'Perdedor 1', 4),
(3, 'Perdedor 2', 4);

CREATE TABLE EXISTS urna(
id int primary key auto_increment,
secao int not null,
zona int not null,
cliente_idCliente int not null,
numeroVendas varchar(255) not null,
dataVenda date,
valorVenda double not null,
estadoVenda varchar(1),
foreign key(vendedor_idVendedor) references vendedor(idVendedor) on delete cascade on update cascade,
foreign key(cliente_idCliente) references cliente(idCliente) on delete cascade on update cascade
);


ALTER TABLE `candidato`
  ADD PRIMARY KEY (`id`);
  
ALTER TABLE `candidato`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
