package org.example;

class Desconto {
    private final double VALOR_PARA_DESCONTO = 1000;
    private final double DESCONTO = 0.9;

    public double calcularPreco(double preco) {
        return preco >= VALOR_PARA_DESCONTO ? preco * DESCONTO : preco;
    }
}