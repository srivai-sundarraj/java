package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int myMinIntValue=Integer.MIN_VALUE;
	int myMaxIntValue=Integer.MAX_VALUE;
        System.out.println("Minimum int Value "+ myMinIntValue);
        System.out.println("Maximum int Value "+ myMaxIntValue);
        System.out.println("Busted Maximum int Value "+ (myMaxIntValue+1));
        System.out.println(" Busted Minimum int Value "+ (myMinIntValue-1));
    int myMaxIntTest=2_147_483_647;
        System.out.println(myMaxIntTest);

        byte myMinByteValue=Byte.MIN_VALUE;
        byte myMaxByteValue=Byte.MAX_VALUE;
        System.out.println("Minimum Byte Value : "+myMinByteValue);
        System.out.println("Maximum Byte Value : "+myMaxByteValue);

        short myMinShortValue=Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;
        System.out.println("Minimum Short Value : "+myMinShortValue);
        System.out.println("Maximum Short Value : "+myMaxShortValue);

        long myMinLongValue=Long.MIN_VALUE;
        long myMaxLongValue=Long.MAX_VALUE;
        System.out.println("Minimum Long Value : "+myMinLongValue);
        System.out.println("Maximum Long Value : "+myMaxLongValue);

        long bigLongValue=2_147_483_647_787L;
        System.out.println("my bigLongValue "+ bigLongValue);

        int myTotal=(myMinIntValue/2);
        System.out.println(myTotal);

        byte newByteValue=(byte) (myMinByteValue/2);
        System.out.println(newByteValue);

        short newShortValue=(short) (myMinShortValue/2);
        System.out.println(newShortValue);

    }
}
