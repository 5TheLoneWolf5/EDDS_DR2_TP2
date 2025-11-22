package org.example;

class Pedido {
    private Cliente cliente;
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getNomeCliente() {
        return cliente.getNome();
    }
}