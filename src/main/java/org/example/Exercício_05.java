/*
*
* O problema pode ser observado na má legibilidade e carga cognitiva demasiada complexa da solução. 
* Para simplificar esse método de classificar clientes, pode-se dividir as tarefas em outras funções. 
* A solução, primeiro, envolve a criação de uma classe "Cliente" para representar os dados dessa entidade. Depois, pode ser criado métodos booleanos para verificar se o atributo é X ou Y.
* Ao fazer isso, é possível simplificar a função de chamada da seguinte forma:
* 
*/

public class App {
    public String classificarCliente() {
          Cliente cliente = new Cliente(); 
          cliente.classificar(cliente);
    }
}

public class Cliente {

    // Abstração: variáveis da classe, construtores e getters and setters.
    
    public String classificar(Cliente cliente) {
          if (ehClienteIdoso(cliente.getIdade())) {
            return classificarClienteSenior(cliente) + " Sênior";
          } else {
            return classificarClienteJovem(cliente) + " Jovem";
          }
    }

    public boolean ehClienteIdoso(int idade) {
      return idade > 60;
    }

  public String classificarClienteSenior(Cliente cliente) {
          if (ehClienteSeniorBaixaRenda(cliente.getRenda())) {
            return "Cliente Baixa Renda";
          } else {
            return classificarSeniorClienteRegularPremium(cliente);
          }
  }

  public boolean ehClienteSeniorBaixaRenda(int renda) {
      return renda > 5000;
  }

  public String classificarClienteJovem(Cliente cliente) {
          if (ehClienteJovemBaixaRenda(cliente.getRenda())) {
            return "Cliente Baixa Renda";
          } else {
            return classificarJovemClienteRegularPremium(cliente);
          }
  }

  public boolean ehClienteJovemBaixaRenda(int renda) {
      return renda > 7000;
    }

  public String classificarSeniorClienteRegularPremium(Cliente cliente) {
          if (ehClienteSeniorPremium(cliente.getCompras())) {
            return "Cliente Premium";
          } else {
            return "Cliente Regular";
          }
  }

  public boolean ehClienteSeniorPremium(int compras) {
      return compras > 10;
  }

  public String classificarSeniorClienteRegularPremium(Cliente cliente) {
          if (ehClienteSeniorPremium(cliente.compras)) {
            return "Cliente Premium";
          } else {
            return "Cliente Regular";
          }
  }

  public String classificarJovemClienteRegularPremium(Cliente cliente) {
          if (ehClienteJovemPremium(cliente.compras)) {
            return "Cliente Premium";
          } else {
            return "Cliente Regular";
          }
  }

  public boolean ehClienteJovemPremium(int compras) {
      return compras > 20;
  }
  
}
