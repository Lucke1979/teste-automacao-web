# language: pt
# encoding: utf-8
Funcionalidade: Cadastrar novo supplier
 
Cenario: Cadastro novo Fornecedor 

Dado que esteja na tela de login
E preencha o campo de e-mail 
E preencha o campo de senha 
Quando clicar no botao login 
Entao sera feito o login no sistema e deve ser validado o botao logout 
Dado que clique em Accounts na barra lateral
E clique no submenu supliers
Quando for direcionado para o menu Suppliers Management
E clicar no botao Adicionar 
E preencher as informacoes dos campos obrigatorios no formulario de cadastro
E clicar no botao Submit 
Quando for direcionado para o menu Suppliers Management
Entao o cadastro deve ser validado na tabela
 

