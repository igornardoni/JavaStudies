public class ClassCalculator {
   int number;

   public ClassCalculator(int number) {
       this.number = number;
   }

   public int doubleResult() {
       return number * 2;
   }

    public static void main(String[] args) {
        ClassCalculator result = new ClassCalculator(30);
        int doubledValue = result.doubleResult();
        System.out.println("O dobro do número é: " + doubledValue);
    }

}
