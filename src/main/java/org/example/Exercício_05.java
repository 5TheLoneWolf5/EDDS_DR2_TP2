/*
*
* O problema pode ser observado na má legibilidade e carga cognitiva demasiada complexa da solução. 
* Para simplificar esse método de classificar clientes, pode-se utilizar o Strategy Pattern. 
* Os passos da solução seguem:
* Primeiro, a criação de uma classe "Cliente" para representar os dados dessa entidade.
* Criação da interface "Classificador".
* Implementação da interface "Classificador" em cada tipo (Sênior, Regular, cliente padrão e etc.), ao mesmo que todos extendem o comportamento de "Cliente".
* Desse modo, ao chamar o método classificar() no objeto Cliente ou outro que extenda seu comportamento, o comportamento permanecerá de modo mais limpo, legível e escalável (tendo as regras de negócio aplicadas em cada classe).   
*
*/
