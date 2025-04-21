Feature: Verificar error login con credenciales inválidas

  Scenario: Ingresar credenciales inválidas y recibir mensaje de error
    Given el usuario está en la página de login
    When el usuario ingresa credenciales inválidas
    And intenta iniciar sesión
    Then el sistema muestra un mensaje de error
    And el acceso es denegado