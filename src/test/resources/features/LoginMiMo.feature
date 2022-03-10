Feature: El usuario navega Mi Claro

  @Smooke
  Scenario: El Usuario navega Mi Claro web
    Given El usuario está en la pantalla de inicio de miclaro.claro.com.ar
    When El Usuario hace click en el boton ingresar ahora
    And El usuario completa los campos. Email: <email> Contraseña: <pass>
    And El Usuario hace click en el boton INGRESAR
    Then El usuario verifica que ha iniciado sesión.

    Examples:
      | email                                              | pass                         |
      | inserte.mail.de.usuario@valido.net                 | PassUserValidoQwerty1234     |