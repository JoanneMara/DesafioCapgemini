package atividade2;
import java.util.Scanner;
import java.util.regex.Pattern;

public class cadastro {
    public static void main(String[] args) {
        //# Questão 02
        //
        //Débora se inscreveu em uma rede social para se manter em contato com seus amigos.
        // A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte.
        // O site considera uma senha forte quando ela satisfaz os seguintes critérios:
        //
        //Possui no mínimo 6 caracteres.
        //Contém no mínimo 1 digito.
        //Contém no mínimo 1 letra em minúsculo.
        //Contém no mínimo 1 letra em maiúsculo.
        //Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
        //Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte.
        // Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem
        // ser adicionados para uma string qualquer ser considerada segura.
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------Capgemini-------------");
        System.out.println("------------Exercício 2------------");

        System.out.println("Informe seu nome:");
        String nome = sc.next();
        System.out.println("Informe sua senha:");
        String senha = sc.next();

        //Definindo os padrões
        Pattern p1 = Pattern.compile("[!@#$%^&*()-+]");
        Pattern p2 = Pattern.compile("[0-9]");
        Pattern p3 = Pattern.compile("[a-z]");
        Pattern p4 = Pattern.compile("[A-Z]");
        int contador = 0;

        //comparando a senha com os padrões a cima
        if(!p1.matcher(senha).find())
            contador++;
        if(!p2.matcher(senha).find())
            contador++;
        if(!p3.matcher(senha).find())
            contador++;
        if(!p4.matcher(senha).find())
            contador++;

        if(senha.length() < 6)
            contador++;

        System.out.println(contador);

    }
}
