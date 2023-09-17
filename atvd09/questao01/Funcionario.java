package atvd09.questao01;

public class Funcionario {
    private String nome;
    private int idade;
    private float salarioAnual;
    public Funcionario(String nome, int idade, float salarioAnual) {
        this.nome = nome;
        this.idade = idade;
        this.salarioAnual = salarioAnual;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public float getSalarioAnual() {
        return salarioAnual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSalarioAnual(float salarioAnual) {
        this.salarioAnual = salarioAnual;
    }
}
