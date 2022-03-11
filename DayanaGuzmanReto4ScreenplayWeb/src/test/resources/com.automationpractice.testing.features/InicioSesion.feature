#language: es

Característica: Inicio de sesion

  Esquema del escenario: inicio de sesion
    Dado que el usuario abre la aplicacion
    Cuando ingresa usuario y contrasena
      | correo   | contrasena   |
      | <Correo> | <Contrasena> |

    Entonces queda logeado <Resultado>,<CP>

    Ejemplos:
      | Correo            | Contrasena | Resultado                                                                                 | CP      |
      | dguzman@todo4.gov | Tod123456  | Welcome to your account. Here you can manage all of your personal information and orders. | Exitoso |
      | dguzman@todo.gov  | Tod123456  | There is 1 error                                                                          |Fallido|

