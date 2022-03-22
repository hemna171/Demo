public class Calculator {
    public void add(int i){
        System.out.println("int type");
    }
    public void add(float f){
        System.out.println("float type");
    }
    public void add(double d){
        System.out.println("double type");
    }
    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        calculator.add(20);
        calculator.add(20.0);
        calculator.add(8.9f);
    }
}
