
public class Review02 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
            //　3と5の整数で割り切れるとき"FizzBuzz"と表示させる
              System.out.println("FizzBuzz");
            // 3の整数で割り切れるとき"Fizz"と表示させる
            } else if (i % 3 == 0) {
              System.out.println("Fizz");
            // 5の整数で割り切れるとき"Buzz"と表示させる
            } else if (i % 5 == 0) {
              System.out.println("Buzz");
            // それ以外の整数のとき
            } else {
              System.out.println(i);
            }
          }
        }
      
    }


