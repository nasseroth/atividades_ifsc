<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

/*
Route::get('/', function () {
    return view('welcome');
});*/

/*
Route::get('/', function() {
    return view('home');
});*/

Route::view('/', 'home');

Route::view('/produtos', 'produtos');

Route::get('/produtos/{nomeProduto}/comentario/{id}', function($nomeProduto, $id) {
    echo "Este é o comentário: ".$id.", do produto: ".$nomeProduto;
});
//http://127.0.0.1:8000/produtos/mesa/5
