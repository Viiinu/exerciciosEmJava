package Exercicios;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] palavras = new String[5];
        String palavraIgual = "";

        for(int i=0; i <= 4; i++) {
            System.out.println("Digite palavras: ");
            palavras[i] = scanner.next();
        }

        for(int i=0; i < palavras.length; i++) {
            System.out.println("digite palavras iguais aquelas que você escreveu, respeitando a ordem que foi digitado");
            palavraIgual = scanner.next();

            if(palavraIgual.equalsIgnoreCase(palavras[i])){
                System.out.println("achou");
                break;
            }
        }

        String maiorPalavra = palavras[0];
        for (int i = 1; i < palavras.length; i++) {
            if (palavras[i].length() > maiorPalavra.length()) {
                maiorPalavra = palavras[i]; // Atualiza a palavra com maior número de caracteres
            }
        }

        System.out.println(maiorPalavra);
        System.out.println(palavras.length);
        System.out.println(palavras[0]+palavras[1]+palavras[2]+palavras[3]);
    }
}