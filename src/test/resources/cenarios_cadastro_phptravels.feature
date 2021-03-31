# language: pt
# encoding: utf-8
 
Cenario: Cadastro novo Fornecedor 

# pkg:pageobjects->pages->login ->class: LoginPage
# pkg:pageobjects->steps->login ->class: LoginSteps
Dado que esteja na tela de login
E preencha o campo de e-mail # login step
E preencha o campo de senha # login step
Quando clicar no bot�o login # login step

# pkg:pageobjects->pages->comum->navibar->class: NavbarPage
# pkg:pageobjects->steps->comum->navibar->class: NavbarSteps
Entao ser� feito o login no sistema e deve ser validado o bot�o logout 


# pkg: pageobjects->pages->comum ->class: SidebarPage
# pkg: pageobjects->steps->comum ->class: SidebarSteps
Dado que clique em Accounts na barra lateral
E clique no submenu supliers # sidebar step

# pkg: pageobjects->pages->Accounts ->class: SuppliersPage
# pkg: pageobjects->steps->Accounts ->class: SuppliersSteps
Quando for direcionado para o menu Suppliers Management
E clicar no bot�o Adicionar # Suppliers step

# pkg: pageobjects->pages->Accounts->Suppliers ->class: FormAdNewSuppliersPage
# pkg: pageobjects->steps->Accounts->Suppliers -> class: FormAdNewSuppliersSteps
E preencher as informa��es dos campos obrigat�rios no formul�rio de cadastro
E clicar no bot�o Submit # Suppliers Management Steps
E retornar ao menu Suppliers Management # Suppliers step
Entao o cadastro deve ser validado na tabela # Suppliers step

