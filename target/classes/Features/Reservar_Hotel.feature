#language: pt

@reservaHotelB2C
Funcionalidade: Reservar
Eu como usuário
Quero entrar no Portal 
Para fazer uma reserva de hotel

Contexto: Deve validar reserva
Dado que esteja na página inicial

@reservarHotel
Cenário: Deve validar a reserva de hotel com cartão válido
Quando pesquisar um hotel por destino
E preecher as datas
E clicar em pesquisar
E selecionar ou não outro tipo de quarto
E verificar o nome do quarto
E verificar o nome do regime
E verificar os valores
E selecionar ou não outros serviços
E clicar em comprar
E preencher os campos de pagamento
Então a reserva deverá ser realizada

@cartaoInvalido
Cenário: Deve valdiar a reserva com cartão inválido
Quando pesquisar um hotel por destino
E preecher as datas
E clicar em pesquisar
E clicar em comprar
E preencher os campos de pagamento com cartão inválido
Então deverá ser exibido uma mensagem de erro

@reservaCrianca
Cenário: Deve validar a reserva com criança
Quando pesquisar um hotel por destino
E preecher as datas
E adicionar uma ou mais crianças
E clicar em pesquisar
E selecionar ou não outro tipo de quarto
E verificar o nome do quarto
E verificar o nome do regime
E verificar os valores
E selecionar ou não outros serviços
E clicar em comprar
E preencher os campos de pagamento
E atualizar a idade da criança
Então a reserva deverá ser realizada





