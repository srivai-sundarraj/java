package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int result=1+2;
        System.out.println(result);
    int previousResult=result;
        System.out.println("previousResult : "+previousResult);
        result=result-1;
        System.out.println("result : "+result);
        System.out.println("previousResult : "+previousResult);
        result=result*10;
        System.out.println("result 2 * 10 : "+result);
        result=result/5;
        System.out.println("result 20/5: "+result);
        result=result%3;
        System.out.println("result 4 % 3 : "+result);

    }
}
