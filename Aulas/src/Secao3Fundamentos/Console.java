package Secao3Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome");
        String nome = entrada.nextLine();

        System.out.println(nome);

        entrada.close();
    }
}
