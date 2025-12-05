/*
 *
 * Este é um problema relacionado a efeitos colaterais, no qual o programador adicionou mais funcionalidade(s) no método do que era seu escopo originalmente.
 * Nesse caso, quem chama o método gostaria de saber se é possível comprar algo com o saldo na conta, retornando um booleano. Mas, no mesmo método, o saldo já é subtraído com base no valor. Isso pode criar grandes problemas.
 * Seguindo o princípio do Command Query Separation, separamos cada comando e query em um método, mas não ambos ao mesmo tempo.
 * Para solucionar o problema, pode-se refatorar e criar um próprio método para efetuar o pagamento. Desse modo, as funcionalidades ficam separadas e o problema é resolvido.  
 *
 * */
