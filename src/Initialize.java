import java.util.Locale;

public class Initialize {

    public static void main(String[] args) {
        int a =10;
        int b =20;
        int c = a+b;
        System.out.println(c);
        if (a>b){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        boolean check= a<b;
        System.out.println(check);

        int money=20;
        int penCost=30;

        String result = money>penCost?"yes":"no";
        System.out.println(result);

        String value[]={"spidy","hulk","hemna"};
        System.out.println(value[0]);

        String name= "Hemna";
        System.out.println(name.lastIndexOf("a"));

    }
}
