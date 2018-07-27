#language: pt

@reservaPacoteAereoB2C
Funcionalidade: Reservar
Eu como usuário
Quero entrar no Portal 
Para fazer uma reserva de pacote aereo

Contexto: Deve validar reserva
Dado que esteja na página inicial

@reservarPacoteAereo
Cenário: Deve validar a reserva de pacote aereo com cartão válido
Quando clicar na aba Pacote Aereo 
E pesquisar uma origem
E selecionar um destino
E preecher as datas de ida de volta
E clicar em buscar
E selecionar um hotel
E verificar o valor
E selecionar outro voo
E selecionar ou não outro tipo de quarto
E verificar o nome do quarto
E verificar o nome do regime
E verificar a quantidade de hóspedes
E verificar os valores
E selecionar ou não outros serviços do pacote
E clicar em comprar
E preencher os campos de pagamento
Então a reserva deverá ser realizada

@cartaoInvalido
Cenário: Deve valdiar a reserva com cartão inválido
Quando pesquisar um hotel por destino
E preecher as datas
E clicar em pesquisar
E verificar o nome do hotel escolhido
E clicar em comprar
E preencher os campos de pagamento com cartão inválido
Então deverá ser exibido uma mensagem de erro

@reservaCrianca
Cenário: Deve validar a reserva com criança
Quando pesquisar um hotel por destino
E preecher as datas
E adicionar uma ou mais crianças
E clicar em pesquisar
E verificar o nome do hotel escolhido
E verificar a quantidade de hóspedes com crianca
E selecionar ou não outro tipo de quarto
E verificar o nome do quarto
E verificar o nome do regime
E verificar os valores
E selecionar ou não outros serviços
E clicar em comprar
E preencher os campos de pagamento
E atualizar a idade da criança
Então a reserva deverá ser realizada





