package Escola;

public class Aluno {

    String Nome;
    int Idade;

    //metodo
    public void mostrardados() {
        System.out.println("Seu nome é: " + Nome);
        System.out.println("Sua idade é: " + Idade);
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public int getIdade() {
        return Idade;
    }
}
