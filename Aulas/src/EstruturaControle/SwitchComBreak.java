package EstruturaControle;

import java.util.Scanner;

public class SwitchComBreak {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        System.out.println("Informe a nota: ");
        int nota = entrada.nextInt();

        switch (nota){
            case 10:
                conceito = "A";
                break;
            case 9:
                conceito = "A";
                break;

            default:
                conceito = "não informado!";
        }


        System.out.println("Conceito é " + conceito);
        entrada.close();
    }
}
