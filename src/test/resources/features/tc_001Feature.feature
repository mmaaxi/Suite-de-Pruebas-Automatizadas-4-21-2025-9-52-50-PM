Feature: Verificar login exitoso

  Scenario: Usuario puede iniciar sesión con credenciales válidas
    Given el usuario está en la página de login
    When el usuario ingresa credenciales válidas
    And hace clic en el botón de login
    Then el usuario es redirigido a la página principal