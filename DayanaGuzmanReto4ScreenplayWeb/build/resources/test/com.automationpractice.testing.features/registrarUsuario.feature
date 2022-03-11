#language: es

Característica: registrar usuario en la aplicacion

    Esquema del escenario: registrar usuario
        Dado que el usuario abre la aplicacion
        Cuando ingresa los requisitos
            | correo   | titulo   | nombre   | apellido   | contrasena   | dia   | mes   | anio   | compania   | postal   | direccion   | ciudad   | estado   | codPostal   | pais   | informacion   | telefono   | celular   | alias   |
            | <Correo> | <Titulo> | <Nombre> | <Apellido> | <Contrasena> | <Dia> | <Mes> | <Anio> | <Compania> | <Postal> | <Direccion> | <Ciudad> | <Estado> | <CodPostal> | <Pais> | <Informacion> | <Telefono> | <Celular> | <Alias> |
        Entonces queda registrado exitosamente <Resultado>



    Ejemplos:
        | Correo            | Titulo | Nombre | Apellido | Contrasena | Dia | Mes | Anio | Compania | Postal | Direccion | Ciudad   | Estado  | CodPostal | Pais | Informacion   | Telefono | Celular    | Alias | Resultado                                                                                 |
        | dguzman@todo4.gov | 2      | Cindy  | Guzman   | Tod123456  | 7   | 2   | 1988 | Todo1    | 00001  | calle 2   | Medellin | Florida | 00001     | 21   | para registro | 4444444  | 3003002525 | Alias | Welcome to your account. Here you can manage all of your personal information and orders. |


