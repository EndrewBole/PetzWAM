#encoded: utf8

  Feature:  Search a product
    Scenario Outline: Sucess at search a simple product
      Given acess Petz site Homepage
      When i search for this product "<product>"
      And see list of product "<product>"
      Then show the title this product "<product>"

      Examples:
      |product|
      |Aquário Boyu Curvo 120 246 Litros Preto Champagne|
