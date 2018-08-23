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
  "duration": 8772567725,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Deve valdiar a reserva com cartão inválido",
  "description": "",
  "id": "reservar;deve-valdiar-a-reserva-com-cartão-inválido",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 26,
      "name": "@cartaoInvalido"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "pesquisar um hotel por destino",
  "keyword": "Quando "
});
formatter.step({
  "line": 29,
  "name": "preecher as datas",
  "keyword": "E "
});
formatter.step({
  "line": 30,
  "name": "clicar em pesquisar",
  "keyword": "E "
});
formatter.step({
  "line": 31,
  "name": "clicar em comprar",
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "preencher os campos de pagamento com cartão inválido",
  "keyword": "E "
});
formatter.step({
  "line": 33,
  "name": "deverá ser exibido uma mensagem de erro",
  "keyword": "Então "
});
formatter.match({
  "location": "ReservarHotel.pesquisarUmHotelPorDestino()"
});
formatter.result({
  "duration": 6531251056,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.preecherAsDatas()"
});
formatter.result({
  "duration": 5952226285,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.clicarEmPesquisar()"
});
formatter.result({
  "duration": 4220875856,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.clicarEmComprar()"
});
formatter.result({
  "duration": 7080931929,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.preencherOsCamposDePagamentoComCartãoInválido()"
});
formatter.result({
  "duration": 8050637771,
  "status": "passed"
});
formatter.match({
  "location": "ReservarHotel.deveráSerExibidoUmaMensagemDeErro()"
});
formatter.result({
  "duration": 7303600235,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class \u003d \"modal-content\"]/div[text() \u003d \"Ocorreu uma falha ao gerar o pagamento\"]\"}\n  (Session info: chrome\u003d68.0.3440.106)\n  (Driver info: chromedriver\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-F8BMU42\u0027, ip: \u0027192.168.15.13\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.35.528161 (5b82f2d2aae0ca..., userDataDir: C:\\Users\\Laercio\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 68.0.3440.106, webStorageEnabled: true}\nSession ID: 2065e43d018b60c6fa6a3548c5439666\n*** Element info: {Using\u003dxpath, value\u003d//div[@class \u003d \"modal-content\"]/div[text() \u003d \"Ocorreu uma falha ao gerar o pagamento\"]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat Pages.Pagamento_Page.msgErroCartao(Pagamento_Page.java:124)\r\n\tat steps.ReservarHotel.deveráSerExibidoUmaMensagemDeErro(ReservarHotel.java:200)\r\n\tat ✽.Então deverá ser exibido uma mensagem de erro(Reservar_Hotel.feature:33)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 2497589943,
  "status": "passed"
});
formatter.after({
  "duration": 1645843496,
  "status": "passed"
});
formatter.uri("Reservar_PacoteAereo.feature");
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
