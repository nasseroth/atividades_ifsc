
<h1>Lista de Produtos</h1>

<hr>

<form method="post">
    @csrf

    <b>Produto:</b>
    <input type="text" name="produto" id=""><br><br>

    <b>Preço:</b>
    <input type="text" name="preco" id=""><br><br>

    <b>Categoria:</b>
    <input type="text" name="categoria" id=""><br><br>

    <input type="submit" value="Salvar">
</form>

<hr>

<label>
    Produto: {{ $produto }}
</label>

<label>
    Preço: {{ $preco }}
</label>

<label>
    Categoria: {{ $categoria }}
</label>
