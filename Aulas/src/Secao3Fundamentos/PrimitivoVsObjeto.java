package Secao3Fundamentos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {

        // Tudo em java é objeto, menos os tipos primitivos.

        // Criar um Objeto
        String s = new String("texto"); // Aqui é um objeto.
        s.toUpperCase(); // Dentro do objeto tem (atributos e comportamentos)

        // String é uma classe que dentro dela tem atributos e objetos(toUpperCase)
        String s1 = "texto"; // Aqui é um objeto
        s.toUpperCase();

        // O tipo primitivo carrega só o valor dele mesmo.
        int a = 123; // Aqui é um tipo primitivo
    }
}
