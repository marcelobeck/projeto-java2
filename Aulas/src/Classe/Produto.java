package Classe;

public class Produto {

    String nome;
    double valor;
    double desconto;

    // Basicamente um construtor, construi um objeto, alterando os nomes dos atributos.

    // Construtor Padrão
   //    Produto(){
    //    }

    // Agora o construtor padrão não existe mais.
    Produto(String nomeInicial) {
        nome = nomeInicial;
    }
    double precoComDesconto(){ // Método não tem parametro porque já temos os atributos criados.
        return valor * (1 - desconto);
    }
}
