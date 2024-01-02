public class Student {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showStudent() {
        System.out.println("Aluno: " + name + "\n" + "Idade: " + age + " anos");
    }

    public static void main(String[] args) {
        Student student1 = new Student("Paul Stanley", 71);
        student1.showStudent();
    }

}
