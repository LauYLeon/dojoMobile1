Feature: Cerrar Sesion

  Como usuario
  Yo quiero una opcion de cerrar de sesion
  Para poder cerrar a la app

  Scenario: Cerrar sesion exitosamente
    Given el esta en cualquier pantalla de la app
    When el se dirige a la opcion cerrar sesion
    Then el deberia poder ver la pantalla inicial de la app