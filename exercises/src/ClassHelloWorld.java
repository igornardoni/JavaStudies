public class ClassHelloWorld {
    // Atributos/membros da classe
    private final String MESSAGE;

    // Construtor da classe
    public ClassHelloWorld(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    // Método da classe
    public void sayHelloWorld() {
        System.out.println(MESSAGE);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe e chamando métodos
        ClassHelloWorld helloWorld = new ClassHelloWorld("Hello, World!");
        helloWorld.sayHelloWorld();
    }
}
