public class Aluno {
//    Desenvolva uma classe Aluno com os atributos privados nome e notas.
//    Utilize métodos getters e setters para acessar e modificar esses atributos.
//    Adicione um método calcularMedia que retorna a média das notas do aluno.

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    private double notaFinal;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void calcularMedia() {
        setNotaFinal((getNota1() + getNota2() + getNota3()) / 3);
    }

    public void exibirNotaDoAluno() {
        System.out.printf("Aluno: %s\n", getNome());
        System.out.printf("Nota do primeiro bimestre: %.1f\n", getNota1());
        System.out.printf("Nota do segundo bimestre: %.1f\n", getNota2());
        System.out.printf("Nota do terceiro bimestre: %.1f\n", getNota3());
        System.out.printf("Média final: %.1f", getNotaFinal());
    }

    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();

        aluno01.setNome("Juca");
        aluno01.setNota1(7);
        aluno01.setNota2(5);
        aluno01.setNota3(8.5);

        aluno01.calcularMedia();

        aluno01.exibirNotaDoAluno();
    }
}
