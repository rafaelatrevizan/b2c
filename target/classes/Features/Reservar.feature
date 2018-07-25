#language: pt

Funcionalidade: Reservar
Eu como usuário
Quero entrar no Portal 
Para fazer uma reserva de hotel

@reservarHotel
Cenário: Deve validar a reserva de hotel
Dado que esteja na página inicial
Quando pesquisar e selecionar um hotel ou serciço adicional
E preencher os campos de pagamento
Então a reserva deverá ser confimada



