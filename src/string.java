public class string {
    public static void main(String[] args) {
        String[] product = {"iphone", "ipad pro", "ipad air", "macbook air", "macbook pro"};
        boolean a = false;
        for (int i = 0; i < 5; i++) {
            if (product[i] =="ipad pro") {
                a=true;
                System.out.println(product[i]);
                break;
            }

        }
    }

}