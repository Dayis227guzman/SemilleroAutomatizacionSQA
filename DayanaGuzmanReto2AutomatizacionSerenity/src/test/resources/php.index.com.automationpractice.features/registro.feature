#language:es
Característica: Registro de Usuario

  Esquema del escenario: Registro de Usuario

      Dado que estoy en la pagina de inio de automationpractice

    Cuando ingreso mis los datos de Registro
      | nombre |apellido |correo |clave |diaNaci |mesNaci |anoNaci |compania |postal|direccion |ciudad |estado|codPostal| pais|informacion | telefono | celular |alias|nombre2| apellido2 |
       | <Nombre> |<Apellido> |<Correo> |<Clave> |<DiaNaci> |<MesNaci> |<AnoNaci> |<Compania> |<Postal>|<Direccion> |<Ciudad> |<Estado>|<CodPostal>| <Pais>|<Informacion> | <Telefono> | <Celular> |<Alias>|<Nombre2> | <Apellido2> |

    Entonces inicio Sesion <Resultado>,<CP>

    Ejemplos:

| Nombre |Apellido |Correo |Clave |DiaNaci |MesNaci |AnoNaci |Compania |Postal|Direccion |Ciudad |Estado|CodPostal| Pais|Informacion | Telefono | Celular |Alias|Nombre2 | Apellido2 |Resultado|CP|
 | Cindy |Guzman |dguzman@todo3.gov |Todo1234 |27 |2 |1988 |Todo1 |00001|calle 2 |Medellin |6|00001| 21|para registro | 4444444 | 3003002525 |Alias| dayana | guzman |Welcome to your account. Here you can manage all of your personal information and orders.|Exitoso|