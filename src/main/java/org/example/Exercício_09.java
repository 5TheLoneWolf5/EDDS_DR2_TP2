/*
 *
 * O problema é que quem chama o método gostaria de obter a próxima mensagem, não remover uma mensagem da estrutura de dados.
 * Seguindo o princípio do Command Query Separation, separamos cada comando e query em um método, e não ambos ao mesmo tempo.
 * Para solucionar o problema, pode-se refatorar o código para obter a próxima mensagem do usuário; sem tirá-la da lista, com o método .peek() de Queue.
 * Se for necessário, cria-se também um método para apenas remover a primeira mensagem com .poll(). Desse modo, o comando (remover) e a query (ler) ficam separadas e o problema é resolvido.  
 *
 */
