public class Numb2 {

    public static void main(String[] args) {
        MyNumber2 numb2;

        numb2 = (n, m) -> n+m;

        double th = numb2.getValue2(10, 10);
        System.out.println(th);

    }

}
