package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int myMinIntValue=Integer.MIN_VALUE;
	int myMaxIntValue=Integer.MAX_VALUE;
        System.out.println("Minimum Value "+ myMinIntValue);
        System.out.println("Maximum Value "+ myMaxIntValue);
        System.out.println("Busted Maximum Value "+ (myMaxIntValue+1));
        System.out.println(" Busted Minimum Value "+ (myMinIntValue-1));
    int myMaxIntTest=2_147_483_647;
        System.out.println(myMaxIntTest);
    }
}
