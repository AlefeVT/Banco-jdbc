# Banco-jdbc
O programa é uma aplicação bancária simplificada, que oferece opções para realizar operações bancárias como listar contas abertas, abrir conta, encerrar conta, consultar saldo, realizar saque, realizar depósito e realizar transferência. 
O programa interage com o usuário por meio do console, exibindo um menu de opções e solicitando informações para realizar as operações. 
As informações são processadas pelo programa, que utiliza uma classe ContaService para realizar as operações de negócio no modelo de domínio de contas bancárias. 
Em caso de exceções, como tentar realizar uma operação inválida, o programa exibe uma mensagem de erro e volta ao menu de opções.

O programa possui todo o código necessário para integração com um banco de dados. 
Ele utiliza a API JDBC (Java Database Connectivity) para se conectar e interagir com o banco de dados. 
Isso permite que as informações das contas bancárias sejam armazenadas de forma persistente e recuperadas posteriormente, além de permitir o controle de transações, segurança e integridade dos dados. 
O programa já possui classes de acesso a dados (DAOs) implementadas que utilizam SQL para acessar e manipular as tabelas do banco de dados. 
Com isso, é possível integrá-lo facilmente a diferentes bancos de dados e torná-lo uma aplicação bancária mais completa.

Como usar: 
Primeiro integre ele a um banco de dados.. 
Ao acessar o sistema, será exibido um menu com as opções disponíveis. 
Para cadastrar uma nova conta, selecione a opção "Abrir conta" e informe o número da conta, o nome do cliente, o CPF do cliente e o e-mail do cliente.
Para realizar uma transferência, selecione a opção "Realizar transferência" e informe o número da conta de origem, o número da conta de destino e o valor a ser transferido.
Para consultar o saldo de uma conta, selecione a opção "Consultar saldo de uma conta" e informe o número da conta.
Para realizar um saque em uma conta, selecione a opção "Realizar saque em uma conta" e informe o número da conta e o valor a ser sacado.
Para realizar um depósito em uma conta, selecione a opção "Realizar depósito em uma conta" e informe o número da conta e o valor a ser depositado.
Para encerrar uma conta, selecione a opção "Encerramento de conta" e informe o número da conta.
