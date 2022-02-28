#language:es
Característica: Inicio de sesion

  Esquema del escenario: Inicio de sesion
    Dado que estoy en la pagina de inio de automationpractice
    Cuando ingreso mis credenciales
      | correo   | clave   |
      | <Correo> | <Clave> |
    Entonces inicio Sesion <Resultado>,<CP>

    Ejemplos:


      | Correo         | Clave         |Resultado|CP|
      | dayana.guzman@sqasa.com      | Todo1234 |Welcome to your account. Here you can manage all of your personal information and orders.|Exitoso|
      | dayana.guzma@sqa.com      | Todo1234 |There is 1 error|Fallido|
