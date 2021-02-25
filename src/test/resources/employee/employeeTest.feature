Feature: test employee api
  Scenario: client gets all employees
    When the client calls all employee
    Then the client receives 3 employees