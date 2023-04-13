package Classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook"); // a palavra reservada "new", chama o objeto "Produto"
       // p1.nome = "Notebook";
        p1.valor = 435.78;
        p1.desconto = 498.7;

        var p2 = new Produto("Caneta");
        //p2.nome = "Caneta";
        p2.valor = 15.7;
        p2.desconto = 0.50;

        double precoFinal = p1.precoComDesconto(); // (), quer dizer que está chamando um método
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho = (precoFinal + precoFinal2) / 2;


    }
}
