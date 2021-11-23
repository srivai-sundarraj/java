package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	String myString="This is a String";
        System.out.println("My String is: "+myString);
    myString=myString+", and this is more.";
        System.out.println("My String is: "+myString);
    myString=myString+" \u00A9 2019";
        System.out.println("My String is: "+myString);
    String myNumberString="45.5";
    //myNumberString=myNumberString+54.5;
    myNumberString=myNumberString+"54.5";
        System.out.println(myNumberString);
    String lastString="10";
    int myNumber=30;
    lastString=lastString+myNumber;
        System.out.println("My Last String is: "+lastString);
    double myDoubleNumber=123.456d;
    lastString=lastString+myDoubleNumber;
        System.out.println("My Last String is: "+lastString);

    }
}
