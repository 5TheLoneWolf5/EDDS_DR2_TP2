/*
*
* Primeiramente, é importante destacar o princípio do encapsulamento na Programação Orientada a Objetos. Se ela fosse aplicada de modo correto neste código, a proteção do comportamento do atributo "preço" do "Produto" poderia ser definida.
* Do modo como está, não só o atributo fica desprotegido e fere boas práticas, como também altera o preço base do produto. Isso vai causar problemas em logs, auditorias e na funcionalidade; pois ao aplicar o desconto, o preço base é alterado.
* Um modo simples de corrigir isso seria refatorar o código para não alterar o preço do objeto diretamente, e então mudar a lógica para retornar o produto descontado (podendo ser uma subclasse "ProdutoDesconto" de "Produto") ou o preço descontado. 
*
* */
