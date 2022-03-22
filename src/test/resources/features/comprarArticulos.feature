Feature: Compra de articulos
  Como usuario
  Yo quiero una opcion de carrito de comprar
  Para poder comprar los articulos que desee

  Background: El usuario se debe encontrar en vista principal de la app
    Given el esta en la pantalla de inicio de sesion y se loguea

  Scenario: Realizar la compra de dos articulos
    When Selecciona dos articulos
    Then deberia poder ver la cantidad de articulos en el carrito