create database vendasDesktop;
use vendasDesktop;

-- bairro novo

CREATE TABLE IF NOT EXISTS bairro (
  idBairro INT primary key AUTO_INCREMENT,
  nomeBairro VARCHAR(45) NOT NULL
);

CREATE TABLE IF NOT EXISTS `cidade` (
  `idCidade` INT NOT NULL AUTO_INCREMENT,
  `nomeCidade` VARCHAR(45) NOT NULL,
  `ufCidade` VARCHAR(2) NOT NULL,
  PRIMARY KEY (`idcidade`));
  
  -- cor nova
  
  
CREATE TABLE IF NOT EXISTS `cor` (
  `idCor` INT NOT NULL AUTO_INCREMENT,
  `nomeCor` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCor`))
ENGINE = InnoDB;

-- caracteristica

CREATE TABLE IF NOT EXISTS `caracteristicaProduto` (
  `idCaracteristicaProduto` INT NOT NULL AUTO_INCREMENT,
  `idProduto` INT NOT NULL,
  `idCor` INT NOT NULL,
  `tamanhoProduto` VARCHAR(3) NOT NULL,
  `barraProduto` VARCHAR(13) NOT NULL,
  `qtdEstoqueProduto` FLOAT NOT NULL,
   PRIMARY KEY (`idCaracteristicaProduto`),
  CONSTRAINT `fk_caracteristicaProduto_produto`
    FOREIGN KEY (`idProduto`)
    REFERENCES `produto` (`idProduto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_caracteristicaProduto_cor`
    FOREIGN KEY (`idCor`)
    REFERENCES `cor` (`idCor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

---

CREATE TABLE IF NOT EXISTS `endereco` (
  `idCep` INT primary key AUTO_INCREMENT,
  `cep` VARCHAR(10) NOT NULL,
  `logradouroCep` VARCHAR(100) NULL,
  `idBairro` INT NOT NULL,
  `idCidade` INT NOT NULL,
  CONSTRAINT `fk_cep_bairro1`
    FOREIGN KEY (`idBairro`)
    REFERENCES `bairro` (`idBairro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cep_cidade1`
    FOREIGN KEY (`idCidade`)
    REFERENCES `cidade` (`idCidade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
	
CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` INT primary key AUTO_INCREMENT,
  `nomeCliente` VARCHAR(100) NOT NULL,
  `dtNasCliente` DATE NOT NULL,
  `cpfCliente` VARCHAR(14) NOT NULL,
  `rgCliente` VARCHAR(12) NULL,
  `foneCliente` VARCHAR(14) NOT NULL,
  `fone2Cliente` VARCHAR(14) NULL,
  `emailCliente` VARCHAR(100) NULL,
  `compleEnderecoCliente` VARCHAR(100) NOT NULL,
  `idCep` INT NOT NULL,
  CONSTRAINT `fk_cliente_endereco1`
    FOREIGN KEY (`idCep`)
    REFERENCES `endereco` (`idCep`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE IF NOT EXISTS vendedor(
idVendedor int primary key auto_increment ,
nomeUsuario varchar(100) not null,
codVendedor varchar(8) not null,
biVendedor varchar(14) not null,
nomeVendedor varchar(255) not null,
telefoneVendedor varchar(15),
estado varchar(1) not null
);

describe vendedor;

CREATE TABLE IF NOT EXISTS cliente(
idCliente int primary key auto_increment,
codCliente varchar(8) not null,
biCliente varchar(14) not null,
nomeCliente varchar(255) not null, 
enderecoCliente varchar(255),
estadoCliente varchar(1) not null
);

select * from cliente;

CREATE TABLE IF NOT EXISTS vendas(
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

CREATE TABLE IF NOT EXISTS produto(
idProduto int primary key auto_increment,
nomeProduto varchar(255) not null,
precoProduto double not null,
stockProduto int not null,
estadoProduto varchar(1)
);

CREATE TABLE IF NOT EXISTS detalhesVenda(
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