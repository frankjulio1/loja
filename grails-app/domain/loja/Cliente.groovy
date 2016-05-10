package loja

class Cliente {
    String nome
    String cpf
    Date dataNascimento
    String classeSocial

    static constraints = {
        classeSocial inList: ["BAIXA","MÉDIA","ALTA"]
      //  cpf nullable: true
    }

    static mapping = {
        table name: "cli_clientes"
    }
}
