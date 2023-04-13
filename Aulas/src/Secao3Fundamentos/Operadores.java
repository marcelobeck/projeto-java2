package Secao3Fundamentos;

public class Operadores {

    public static void main(String[] args) {

        // Atribuição

        int a = 3;
        int b = a;
        int c = a + b;

        c += b; // c = c + b
        c -= a; // c = c - a
        c *= b; // c = c * b
        c /= a; // c = c / a

        System.out.println(c);

        // Unários

        int a1 = 1;
        int b1 = 2;

        a1++; // a = a + 1;
        a--; // a = a - 1

        ++b1; // b = b + 1;
        --b1; // b = b - 1;

        // Ternário

        double media = 7.6;
        String resultadoRecuperacao = media >= 5.0 ? "em recuperação" : "reprovado";
        String resultado = media >= 7.0 ? "aprovado." : resultadoRecuperacao;

        System.out.println("O aluno está " + resultado);



    }

}
