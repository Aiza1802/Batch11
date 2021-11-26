package Primitives;

public class CastingPractice {
    {
    int number1 = 23;

    long l1 = number1; //implicit casting (happens by java)

    short sh1 = (short) number1; //explicit casting

    byte by1 = 1;

    byte by2 = 2;

    //short sum1 = by1 + by2; compile time error ( due to numeric promotion
    //java wants to store the result in to larger data type(int). that's why is not compiling

    short sum2 = (short) (by1 + by2); //explicit casting

    short sum3 = (short) (by1 + (short) by2);


    int price = (int)758.99;

    System.out.println(price);


}

}
