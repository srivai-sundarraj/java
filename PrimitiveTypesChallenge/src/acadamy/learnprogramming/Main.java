package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	byte byteValue=10;
	short shortValue=20;
	int intValue=50;
	long longTotal=1000L+20L+(byteValue+shortValue+intValue);
        System.out.println(longTotal);
    short shortTotal=(short) (1000+20+ (byteValue+shortValue+intValue));
        System.out.println(shortTotal);

    }
}
