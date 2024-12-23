## Diagrama de classes 

```mermaid
classDiagram
    class Usuario {
        -String nome
        +getConta()
        +getFuncoes()
        +getCartoes()
        +getNovidades()
    }

    class Conta {
        -String numero
        -String agencia
        -Double saldo
        -Double limite
        +getSaldo()
        +getLimite()
    }

    class Funcao {
        -String icone
        -String descricao
        +getIcone()
        +getDescricao()
    }

    class Cartao {
        -String numero
        -String validade
        -Double limite
        +getLimite()
        +getValidade()
    }

    class Novidade {
        -String icone
        -String descricao
        +getIcone()
        +getDescricao()
    }

    Usuario "1" -- "1" Conta
    Usuario "1" -- "*" Funcao
    Usuario "1" -- "*" Cartao
    Usuario "1" -- "*" Novidade

```
