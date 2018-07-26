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
  "name": "pesquisar um hotel por destino",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "preecher as datas",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "clicar em pesquisar",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "verificar o nome do hotel escolhido",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "verificar a quantidade de hóspedes",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "selecionar ou não outro tipo de quarto",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "verificar o nome do quarto",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "verificar o nome do regime",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "verificar os valores",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "selecionar ou não outros serviços",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "clicar em comprar",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "preencher os campos de pagamento",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "a reserva deverá ser confimada",
  "keyword": "Então "
});
formatter.match({
  "location": "Common_StepDefinition.queEstejaNaPáginaInicial()"
});
formatter.result({
  "duration": 8769088756,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.pesquisarUmHotelPorDestino()"
});
formatter.result({
  "duration": 6146789351,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.preecherAsDatas()"
});
formatter.result({
  "duration": 4689457943,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.clicarEmPesquisar()"
});
formatter.result({
  "duration": 3703435898,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.verificarONomeDoHotelEscolhido()"
});
formatter.result({
  "duration": 3130905448,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.verificarAQuantidadeDeHóspedes()"
});
formatter.result({
  "duration": 2119365320,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.selecionarOuNãoOutroTipoDeQuarto()"
});
formatter.result({
  "duration": 2220221155,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.verificarONomeDoQuarto()"
});
formatter.result({
  "duration": 2244340417,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.verificarONomeDoRegime()"
});
formatter.result({
  "duration": 134019443,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.verificarOsValores()"
});
formatter.result({
  "duration": 193129775,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.selecionarOuNãoOutrosServiços()"
});
formatter.result({
  "duration": 45427378390,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.clicarEmComprar()"
});
formatter.result({
  "duration": 3247455617,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.preencher_os_campos_de_pagamento()"
});
formatter.result({
  "duration": 748022512,
  "error_message": "java.lang.IndexOutOfBoundsException: Index: 2, Size: 2\r\n\tat java.util.ArrayList.rangeCheck(Unknown Source)\r\n\tat java.util.ArrayList.get(Unknown Source)\r\n\tat Pages.Pagamento_Page.fillNames(Pagamento_Page.java:26)\r\n\tat steps.ReservarHotel.preencher_os_campos_de_pagamento(ReservarHotel.java:154)\r\n\tat ✽.E preencher os campos de pagamento(Reservar.feature:22)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ReservarHotel.a_reserva_deverá_ser_confimada()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2483394047,
  "status": "passed"
});
formatter.after({
  "duration": 1865415475,
  "status": "passed"
});
});