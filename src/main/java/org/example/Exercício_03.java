package org.example;

/*
* Foi criado uma classe "ClienteNull" que extende o comportamento da classe "Cliente". Com ela, podemos deixar o código mais flexível e consertar problemas relacionado com clientes nulos que estão no pedido.
* Pode-se sobrescrever os métodos da superclasse para executar algo ou nada na implementação da classe nula.
* Abaixo segue a implementação.
*/

class App {
    public static void main(String[] args) {
        Cliente cliente = criarCliente();
        Pedido pedido = new Pedido(cliente);
    }

    private static Cliente criarCliente() {
        boolean regraDeNegocio = true;
        if (regraDeNegocio) {
            return new Cliente();
        } else {
            return new ClienteNull();
        }
    }
}

class Pedido {
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getNomeCliente() {
        return cliente.getNome();
    }
}

class Cliente {
    private String nome;

    public String getNome() {
        return nome;
    }

    // Etc...
}

class ClienteNull extends Cliente {
    public boolean isNull() {
        return true;
    }

//    @Override
//    public String getNome() {
//        return "Cliente Não Cadastrado";
//    }
}
