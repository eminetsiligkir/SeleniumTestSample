@Login @Test
  Feature: Login Hepsiburada

    @WrongPasswordLogin
    Scenario: Failed Login To Hepsiburada Page
      Given user is on login page
      When popup accept
      When user fill the username address on login page
      When user click to giris button on login email page
      Then successfully addressed to password page on login page
      When user fill the wrong password on login page
      Then giris button is available on login page
      When user click to giris button on password page
      Then Error message will disappear

    @WrongEmailLogin
    Scenario: Failed Login To Hepsiburada Page
      Given user is on login page
      When user fill the wrong username address on login page
      When user click to giris button on login email page
      Then Error message will disappear on wrong email page

    @SuccessfullyLogin
    Scenario: Successfully Login To Hepsiburada Page
      Given user is on login page
      When user fill the correct username address on login page
      When user click to giris button on login email page
      Then successfully addressed to password page on login page
      When user fill the password on login page
      Then giris button is available on login page
      When user click to giris button on login page
      Then login is successfully


