package string;

public class Concat {

    public static void main(String[] args) {

        String test = "Chicago";

        String number= "1";
        number+="2";
        number+=2;
        System.out.println(number); // 122 is the outcome

        // System has built metods /functions you can call by using your variable
        String book  = "Chicago";


        test.concat("is the best");
        test = test.concat("in the summer");
        System.out.println(test);
    }
}
