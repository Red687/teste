package Escola;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        //chamamdo a classe Aluno
        Aluno dados = new Aluno();
        Scanner scanner = new Scanner(System.in);
        
        //Usando o set
        System.out.println("Digite seu nome: ");
        dados.setNome(scanner.nextLine());
        System.out.println("Digite sua idade: ");
        dados.setIdade(scanner.nextInt());
        
        //chamando o metodo
        dados.mostrardados();
    }
}
