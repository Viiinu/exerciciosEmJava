package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<String>();

        for (int i = 0; i <= 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite palavras");
            palavras.add(scanner.next());

        }
        palavras.sort((a, b) -> Integer.compare(b.length(), a.length()));
        palavras.size();

        System.out.println(palavras.size());
        System.out.println(palavras.get(0) + ", possui " + palavras.get(0).length() + " caracteres");
        System.out.println(palavras.get(0) + palavras.get(1) + palavras.get(2));


    }
}
