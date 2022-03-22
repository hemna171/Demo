import java.util.Scanner;
public class Case {
    public static void main(String[] args){

        Country temperature = new Country();
        Scanner input =  new Scanner(System.in);
        temperature.setName("a");
        temperature.setTempC(0);

        boolean A= temperature.checkTemperature();
        if (A){
            System.out.println("below freezing temperature");

        }else{
            System.out.println("above freezing temperature");
        }

    }
}
