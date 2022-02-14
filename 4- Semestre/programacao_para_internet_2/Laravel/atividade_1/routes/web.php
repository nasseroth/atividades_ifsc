<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\HomeController;
use App\Http\Controllers\ProdutosController;


// Route::view('/', 'HomeController@index');

Route::get('/', [HomeController::class, 'index']);

Route::get('/produtos', [ProdutosController::class, 'index']);
Route::post('/produtos', [ProdutosController::class, 'index']);
Route::get('/produtos/excluir/{id}', [ProdutosController::class, 'excluir']);
