public class IdadePessoa {
//    Crie uma classe idadePessoa com os atributos privados nome e idade.
//    Utilize métodos getters e setters para acessar e modificar esses atributos.
//    Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibeIdade() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade() + " anos");
    }

    public void verificarIdade() {
        if (getIdade() < 18) {
            System.out.println("O indíviduo é menor de idade.");
        } else {
            System.out.println("O indíviduo é maior de idade.");
        }
        System.out.println(); // Quebra de linha
    }

    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();

        pessoa1.setNome("Bruce Wayne");
        pessoa1.setIdade(32);

        pessoa1.exibeIdade();
        System.out.println(); // Quebra de linha
        System.out.println("É maior de idade?");
        pessoa1.verificarIdade();
    }
}
