#language: pt

Funcionalidade: Registro

  @Registrar
  Cenário: Realizar Registro
    Dado que eu esteja na tela de Registro
    Quando faço o preenchimento das informações da tela de Register
      | First Name | Last Name | Phone         | Email                 | Address               | Complement | City   | State | Cep      | Pais   | User      | Pass   | Confirm Pass |
      | Tiago      | Silva     | 5511984426727 | tiagors1992@gmail.com | Rua General Florencio | Apto 143   | Osasco | SP    | 06182002 | Brazil | trsilva92 | 123456 | 123456       |
    Então eu sou registrado com sucesso
