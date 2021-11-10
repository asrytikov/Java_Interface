public class Numb{

  /*@Override
    public double getValue() {
      int count;
      int sum = 0;
      while (count<5){
          sum = sum + count;
          count++;
      }
        return sum;
    }*/

    public static void main(String[] args) {
        MyNumber number;
        //number = () -> ;

        number = () -> {
            int count = 1;
            int sum = 0;
            while (count<5){
                sum = sum + count;
                count++;
            }
            return sum;
        };

    }
}
