package EstruturaControle;

public class Switch01 {

    public static void main(String[] args) {

        String faixa = "vermelha";

        switch (faixa.toLowerCase()){
            case "marron":
                System.out.println("1");
            break;
            
            default:
                System.out.println("Não sei nada");
        }
    }
}
