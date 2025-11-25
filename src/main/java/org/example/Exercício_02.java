package org.example;

/*
* A seguir é o código com as melhorias aplicadas. As correções realizadas foram:
*
* Constantes são declaradas no topo da classe e com nomes digitados em letra maiúscula, seguindo convenções do código limpo;
* A regra de negócio para descontos foi corrigida;
* Melhores nomes foram escolhidos e o código está mais legível.
* */

class Desconto {
    private final double VALOR_PARA_DESCONTO = 1000;
    private final double DESCONTO = 0.9;

    public double calcularPrecoFinal(double preco) {
        return preco == VALOR_PARA_DESCONTO ? preco * DESCONTO : preco;
    }
}
