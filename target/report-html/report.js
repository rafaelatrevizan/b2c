$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Reservar.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Reservar",
  "description": "Eu como usuário\r\nQuero entrar no Portal \r\nPara fazer uma reserva de hotel",
  "id": "reservar",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 9,
  "name": "Deve validar a reserva de hotel",
  "description": "",
  "id": "reservar;deve-validar-a-reserva-de-hotel",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 8,
      "name": "@reservarHotel"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que esteja na página inicial",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "pesquisar e selecionar um hotel ou serciço adicional",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "preencher os campos de pagamento",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "a reserva deverá ser confimada",
  "keyword": "Então "
});
formatter.match({
  "location": "Common_StepDefinition.queEstejaNaPáginaInicial()"
});
formatter.result({
  "duration": 9082229832,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.pesquisar_e_selecionar_um_hotel_ou_serciço_adicional()"
});
formatter.result({
  "duration": 4560035233,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.preencher_os_campos_de_pagamento()"
});
formatter.result({
  "duration": 24752,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.a_reserva_deverá_ser_confimada()"
});
formatter.result({
  "duration": 35016,
  "status": "passed"
});
formatter.after({
  "duration": 2435631257,
  "status": "passed"
});
formatter.after({
  "duration": 2800097682,
  "status": "passed"
});
});