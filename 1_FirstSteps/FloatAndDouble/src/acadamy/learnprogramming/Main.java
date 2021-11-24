package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	float minFloatValue=Float.MIN_VALUE;
	float maxFloatValue=Float.MAX_VALUE;
        System.out.println(minFloatValue);
        System.out.println(maxFloatValue);

    double minDoubleValue=Double.MIN_VALUE;
    double maxDoubleValue=Double.MAX_VALUE;
    System.out.println(minDoubleValue);
    System.out.println(maxDoubleValue);

    int myIntValue=5;
    //float myFloatValue=5.25;
    //float myFloatValue=(float)5.25;
    float myFloatValue=5f/3f;
    //double myDoubleValue=5d/3d;
    double myDoubleValue=5.00/3.00;
        System.out.println("Int Value : "+myIntValue);
        System.out.println("Float Value : "+myFloatValue);
        System.out.println("Double Value : "+myDoubleValue);

    double numberOfPounds=200d;
    double convertedKilogram=numberOfPounds*0.45359237d;
        System.out.println("Kilogram : "+ convertedKilogram);

    double pi=3.1415927;
    double anotherNumber=5_000_000.787890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
