$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Reservar_PacoteAereo.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Reservar",
  "description": "Eu como usuário\r\nQuero entrar no Portal \r\nPara fazer uma reserva de pacote aereo",
  "id": "reservar",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@reservaPacoteAereoB2C"
    }
  ]
});
formatter.background({
  "line": 9,
  "name": "Deve validar reserva",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que esteja na página inicial",
  "keyword": "Dado "
});
formatter.match({
  "location": "Common_StepDefinition.queEstejaNaPáginaInicial()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 13,
  "name": "Deve validar a reserva de pacote aereo com cartão válido",
  "description": "",
  "id": "reservar;deve-validar-a-reserva-de-pacote-aereo-com-cartão-válido",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 12,
      "name": "@reservarPacoteAereo"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "clicar na aba Pacote Aereo",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "pesquisar uma origem",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "selecionar um destino",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "preecher as datas de ida de volta",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "clicar em buscar",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "selecionar um hotel",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "verificar o valor",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "selecionar outro voo",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "selecionar ou não outro tipo de quarto",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "verificar o nome do quarto",
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "verificar o nome do regime",
  "keyword": "E "
});
formatter.step({
  "line": 25,
  "name": "verificar a quantidade de hóspedes",
  "keyword": "E "
});
formatter.step({
  "line": 26,
  "name": "verificar os valores",
  "keyword": "E "
});
formatter.step({
  "line": 27,
  "name": "selecionar ou não outros serviços do pacote",
  "keyword": "E "
});
formatter.step({
  "line": 28,
  "name": "clicar em comprar",
  "keyword": "E "
});
formatter.step({
  "line": 29,
  "name": "preencher os campos de pagamento",
  "keyword": "E "
});
formatter.step({
  "line": 30,
  "name": "a reserva deverá ser realizada",
  "keyword": "Então "
});
formatter.match({
  "location": "Reservar_PacoteAereo.clicarNaAbaPacoteAereo()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Reservar_PacoteAereo.pesquisarUmaOrigem()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Reservar_PacoteAereo.selecionarUmDestino()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Reservar_PacoteAereo.preecherAsDatasDeIdaDeVolta()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Reservar_PacoteAereo.clicarEmBuscar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Reservar_PacoteAereo.selecionarOutroHotel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Reservar_PacoteAereo.verificarAOrigemEDestinoEValor()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Reservar_PacoteAereo.selecionarOutroVoo()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReservarHotel.selecionarOuNãoOutroTipoDeQuarto()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReservarHotel.verificarONomeDoQuarto()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReservarHotel.verificarONomeDoRegime()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReservarHotel.verificarAQuantidadeDeHóspedes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReservarHotel.verificarOsValores()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "ReservarHotel.clicarEmComprar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReservarHotel.preencher_os_campos_de_pagamento()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReservarHotel.a_reserva_deverá_ser_confimada()"
});
formatter.result({
  "status": "skipped"
});
});