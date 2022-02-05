select * from detalhesVenda
inner join vendas on  venda_idVenda = idVenda
inner join produto on produto_idProduto = idProduto
inner join vendedor on vendedor_idVendedor = idVendedor
inner join cliente on cliente_idCliente = idCliente;