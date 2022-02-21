package atividade1;
import java.util.Scanner;

public class escada {
    public static void main(String[] args) {
        //#Questão 1:Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
        // A base e altura da escada devem ser iguais ao valor de n.
        // A última linha não deve conter nenhum espaço.

        Scanner sc = new Scanner(System.in);
        System.out.println("-------------Capgemini-------------");
        System.out.println("------------Exercício 1------------");

        //Usando o mecanismo de saída para solicitar informações ao usuário
        //armazenando essa informação em uma variável n.
        System.out.println("Informe o valor de n:");
        int n = sc.nextInt();


        //aplicando um laço de repetição dentro do outro, de forma que preencha linhas e colunas
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
