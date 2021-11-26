package Primitives;

public class BoolenPractice {

    public static void main(String[] args) {

        int number =11;
        System.out.println(number);
        System.out.println(11); // 11
        boolean isHungry = true;

        System.out.println(isHungry);

        boolean isLightOn = false;
        System.out.println(isLightOn);

        System.out.println(true);

        System.out.println(isHungry == isLightOn);

        isLightOn = isHungry;
        isLightOn = false;

        System.out.println(isHungry);// true
        System.out.println("Last version for isHungry>> "+isHungry); //true
        System.out.println("Last for Is Light >>"+isLightOn);// false


    }
}
