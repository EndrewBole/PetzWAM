#encoded: utf8

  Feature:  Search a product
    Scenario Outline: Sucess at search a simple product
      Given acess Petz site Homepage
      When i search for this product Aquario "<productSearched>"
      Then see list of product "<productSearched>"
      And  click in product "<product>" searched
      Then show the title this product "<product>" and price "<price>"

      Examples:
      |product                                          |productSearched|price      |
      |Aquário Boyu Curvo 120 246 Litros Preto Champagne|Aquario        |R$ 3.559,99|
