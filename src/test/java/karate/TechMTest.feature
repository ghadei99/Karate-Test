Feature: Hello World

    Background:
    Given url 'https://gorest.co.in/'
    Given path 'public/v2/users/1139'
    * def dataGen = Java.type('scripts.TechnicalComponents')
    
    Scenario: Get User and validating
    When method get
    Then status 200
    * print 'this is responses'
    Then print response
    Then print response.id
    * string getResponse = response
    * dataGen.writeJSon(getResponse,"DummyJson")
    * match response.id == 1139
    * match response.name == 'Ramesh Mahajan'
    * match response.gender == 'male'
    * match response.status  == 'inactive'
    