/*
*
* O problema pode ser observado na má legibilidade e carga cognitiva demasiada complexa da solução. 
* Para simplificar esse método de classificar clientes, pode-se utilizar o Strategy Pattern. 
* Os passos da solução seguem:
* Primeiro, a criação de uma classe "Cliente" para representar os dados dessa entidade.
* Criação da interface "Classificador".
* Implementação da interface "Classificador" e do método para cada tipo (Sênior, Regular etc.), ao mesmo que todos extendem o comportamento de "Cliente" (mesmo o padrão).
* Desse modo, ao chamar o método classificar() do objeto Cliente ou outro que extenda seu comportamento, o comportamento continuará mas de modo mais limpo, legível e escalável.   
*
*/
