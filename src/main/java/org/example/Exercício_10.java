/*
 *
 * O problema é que getContadorAcessos() retorna o número de acessos (funcionalidade única) mas incrementa seu valor ao mesmo tempo.
 * Seguindo o princípio do Command Query Separation, separamos cada comando e query em um método, e não ambos ao mesmo tempo.
 * Sobre boas práticas de contadores, geralmente é ideal nomear as variáveis de maneira descritiva para entender melhor o que está sendo contado.
 * Para solucionar o problema, pode-se refatorar o código para apenas realizar o propósito original do método: retornar o contador de acessos.
*
 */
