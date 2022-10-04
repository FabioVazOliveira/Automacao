#Author: your.email@your.domain.com

@tag
Feature: Preencher formulario
  Eu como usuario quero enviar formulario para obter cotacao

  @tag1
  Scenario: Formulario carro
    Given que esteja no site
    And preencho enter vehicle data
    And preencho enter insurant data
    And preencho enter product data
    And select price option
    When send quote
    Then valido a mensage de sucesso
  