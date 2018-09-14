$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Reservar_Hotel.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Reservar",
  "description": "Eu como usuário\r\nQuero entrar no Portal \r\nPara fazer uma reserva de hotel",
  "id": "reservar",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@reservaHotelB2C"
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
  "duration": 10569522626,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Deve validar a reserva de hotel com cartão válido",
  "description": "",
  "id": "reservar;deve-validar-a-reserva-de-hotel-com-cartão-válido",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 12,
      "name": "@reservarHotel"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "pesquisar um hotel por destino",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "preecher as datas",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "clicar em pesquisar",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "selecionar ou não outro tipo de quarto",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "verificar o nome do quarto",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "verificar o nome do regime",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "verificar os valores",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "selecionar ou não outros serviços",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "clicar em comprar",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "preencher os campos de pagamento",
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "a reserva deverá ser realizada",
  "keyword": "Então "
});
formatter.match({
  "location": "ReservarHotel.pesquisarUmHotelPorDestino()"
});
formatter.result({
  "duration": 7072034103,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.preecherAsDatas()"
});
formatter.result({
  "duration": 5225750968,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.clicarEmPesquisar()"
});
formatter.result({
  "duration": 3317052806,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.selecionarOuNãoOutroTipoDeQuarto()"
});
formatter.result({
  "duration": 2422770280,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.verificarONomeDoQuarto()"
});
formatter.result({
  "duration": 3380360735,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.verificarONomeDoRegime()"
});
formatter.result({
  "duration": 135439231,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.verificarOsValores()"
});
formatter.result({
  "duration": 212558470,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.selecionarOuNãoOutrosServiços()"
});
formatter.result({
  "duration": 7580355181,
  "error_message": "java.lang.IndexOutOfBoundsException: Index: 2, Size: 0\r\n\tat java.util.ArrayList.rangeCheck(Unknown Source)\r\n\tat java.util.ArrayList.get(Unknown Source)\r\n\tat Pages.Ingresso_Page.addDataIngresso(Ingresso_Page.java:71)\r\n\tat steps.ReservarHotel.selecionarOuNãoOutrosServiços(ReservarHotel.java:84)\r\n\tat ✽.E selecionar ou não outros serviços(Reservar_Hotel.feature:21)\r\n",
  "status": "failed"
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
formatter.after({
  "duration": 2364169558,
  "status": "passed"
});
formatter.after({
  "duration": 1846819239,
  "status": "passed"
});
});