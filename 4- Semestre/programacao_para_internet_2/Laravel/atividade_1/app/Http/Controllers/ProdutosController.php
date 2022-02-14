<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class ProdutosController extends Controller
{
    public function index(Request $request) {

        // opção 1
/*
        $dados = $request->all();

        $produto = $dados['produto'];
        $preco = $dados['preco'];
        $categoria = $dados['categoria'];
        print_r($dados);
*/

        //opcao 2
        /*
        $produto = $request->query('produto');
        $preco = $request->query('preco');
        $categoria = $request->query('categoria');
        */

        // opcao 3 (com post no form)
/*
        $produto = $request->input('produto');
        $preco = $request->input('preco');
        $categoria = $request->input('categoria');
*/
        //opcao 4
        $dados = [
            'produto'=>$request->input('produto'),
            'preco'=>$request->input('preco'),
            'categoria'=>$request->input('categoria')
        ];

        return view('produtos', $dados);
    }

    public function excluir($id) {
        echo $id;
    }
}
