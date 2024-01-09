public class Produto {
     // Desenvolva uma classe Produto com os atributos privados nome e preco.
    //  Utilize métodos getters e setters para acessar e modificar esses atributos.
    // Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

    private String nomeDoProduto;
    private double preco;

    private double precoFinal;

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public void aplicarDesconto() {
        setPrecoFinal(getPreco() - (getPreco() * 0.2)); // Aplicando desconto de 20%
    }


    public void exibirProduto() {
        System.out.println(getNomeDoProduto());
        System.out.printf("R$ %.2f\n", getPreco());
        System.out.printf("Preço após desconto de 20%%: R$ %.2f", getPrecoFinal());
        // % extra para evitar que o Java interprete como um placeholder como %f, %s, %d
    }

    public static void main(String[] args) {
        Produto bolsa = new Produto();

        bolsa.setNomeDoProduto("Bolsa de viagem");
        bolsa.setPreco(98.99);

        bolsa.aplicarDesconto();

        bolsa.exibirProduto();
    }
}
