## Diagrama de classes 

```mermaid
classDiagram
    class Cliente {
        -String nome
        +getNome
        +getConta()
        +getFuncionalidades()
        +getCartoes()
        +getNovidades()
    }

    class Conta {
        -String numero
        -String agencia
        -Double saldo
        -Double limite
        +getNumero()
        +getAgencia()
        +getSaldo()
        +getLimite()
    }

    class Funcionalidade {
        -String icone
        -String descricao
        +getIcone()
        +getDescricao()
    }

    class Cartao {
        -String numero
        -String validade
        -Double limite
        +getNumero()
        +getLimite()
        +getValidade()
    }

    class Novidade {
        -String icone
        -String descricao
        +getIcone()
        +getDescricao()
    }

    Usuario "1" *-- "1" Conta
    Usuario "1" *-- "*" Funcionalidade
    Usuario "1" *-- "*" Cartao
    Usuario "1" *-- "*" Novidade

```
