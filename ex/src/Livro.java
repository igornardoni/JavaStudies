public class Livro {
//    Desenvolva uma classe Livro com os atributos privados titulo e autor.
//    Utilize métodos getters e setters para acessar e modificar esses atributos.
//    Adicione um método exibirDetalhes que imprime o título e o autor do livro.

    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhesDoLivro() {
        System.out.printf("Nome do livro: %s\n", getTitulo());
        System.out.printf("Nome do autor: %s\n", getAutor());
    }

    public static void main(String[] args) {

        Livro livro001 = new Livro();

        livro001.setTitulo("O Homem do Castelo Alto");
        livro001.setAutor("Phillip K. Dick");

        livro001.exibirDetalhesDoLivro();

    }
}
