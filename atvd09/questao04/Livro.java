package atvd09.questao04;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    // Construtor
    public Livro(String titulo, String autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    // Método para verificar a disponibilidade do livro
    public String verificarDisponibilidade() {
        if (disponivel) {
            return "O livro \"" + titulo + "\" de " + autor + " está disponível para empréstimo.";
        } else {
            return "O livro \"" + titulo + "\" de " + autor + " não está disponível para empréstimo.";
        }
    }

    // Método para definir o status de disponibilidade do livro
    public void setDisponibilidade(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // Método para obter o título do livro
    public String getTitulo() {
        return titulo;
    }

    // Método para obter o autor do livro
    public String getAutor() {
        return autor;
    }
}
