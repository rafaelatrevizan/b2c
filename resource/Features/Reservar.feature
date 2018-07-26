#language: pt

Funcionalidade: Reservar
Eu como usuário
Quero entrar no Portal 
Para fazer uma reserva de hotel

@reservarHotel
Cenário: Deve validar a reserva de hotel
Dado que esteja na página inicial
Quando pesquisar um hotel por destino
E preecher as datas
E clicar em pesquisar
E verificar o nome do hotel escolhido
E verificar a quantidade de hóspedes
E selecionar ou não outro tipo de quarto
E verificar o nome do quarto
E verificar o nome do regime
E verificar os valores
E selecionar ou não outros serviços
E clicar em comprar
E preencher os campos de pagamento
Então a reserva deverá ser confimada



