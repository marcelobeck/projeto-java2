package Secao3Fundamentos;

public class Wrapper {

    // Wrapper empacotador (Tem como principal função “envolver coisas” adicionando funcionalidades à ela.)
   // O Java conta com diversos Wrappers que adicionam funcionalidades a outras classes ou tipos primitivos, um exemplo
   // dele é o Integer, que é o Wrapper do tipo primitivo int.

    public static void main(String[] args) {

        // Ex: Integer é uma classe.

        // byte

        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 100000L; // Classe Long, primitivo (long)

        Float f = 123.10F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; // char
        System.out.println(c + "...");

    }
}
