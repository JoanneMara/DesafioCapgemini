package atividade3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Anagrama {
    public static void main(String[] args) {
        //#Questão 3: Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------Capgemini-------------");
        System.out.println("------------Exercício 3------------");

        //Usando o mecanismo de saída para solicitar informações ao usuário
        //armazenando essa informação em uma variável palavra.
        System.out.println("Informe uma palavra:");
        String palavra = sc.next();

        HashMap<String, Integer> mapeamento = new HashMap<>();

        // Realizando mapeamento das substrings da palavra e contando a frequencia de caracteres em cada uma.  
        for(int i=0; i<palavra.length(); i++) {
            for(int j=i; j<palavra.length(); j++) {

                char[] substring = palavra.substring(i, j+1).toCharArray();
                Arrays.sort(substring);

                String auxiliar = new String(substring);
                if (mapeamento.containsKey(auxiliar))
                    mapeamento.put(auxiliar, mapeamento.get(auxiliar)+1);
                else
                    mapeamento.put(auxiliar, 1);
            }
        }

        int quantidadePares = 0;
        for (String chave: mapeamento.keySet()) {
            int valor = mapeamento.get(chave);
            quantidadePares = quantidadePares + (valor * (valor-1))/2;
        }

        System.out.println(quantidadePares);
    }
}
