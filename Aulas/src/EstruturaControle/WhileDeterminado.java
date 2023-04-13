package EstruturaControle;

public class WhileDeterminado {
    //WhileDeterminado, porque sabemos quantas vezes deve se repetir
    public static void main(String[] args) {

        int contador = 1;

        while(contador <= 10){
            System.out.printf("i = %d\n", contador);
            contador++;
        }
    }
}
