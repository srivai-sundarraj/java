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

    //Abbreviating Operators
    result++;// 1+1=2
        System.out.println("result++ (1+1): "+result);
    result--;//2-1=1
        System.out.println("result-- (2-1): "+result);
    result += 2;//1+2 =3
        System.out.println("result+=2 : "+ result);
    result-=2; //3-2=1
        System.out.println("result-=2: "+ result);
    result*=10; // 1*10 =10
        System.out.println("result*=10 : "+result);
    result/=5; //10/5=2;
        System.out.println("result/=5 : "+result);
    result%=2; // 2%2=0;
        System.out.println("result%=2 : "+result);

   //if-then Statement
   boolean isAlien=false;
   if(isAlien==false)
   {
       System.out.println("I'm not a Alien");
        System.out.println("I'm Alien");
   }
   int topScore=80;
   if(topScore<100)
       System.out.println("You got high score");

   int anotherTopScore=81;
   if(topScore>anotherTopScore && anotherTopScore<100)
       System.out.println("greater than second top score and less than 100");

   if((topScore>90) || (anotherTopScore>=90))
       System.out.println("Both conditions are failed");

   int newValue=100;
   if(newValue==100)
       System.out.println("This is true");
   boolean isCar=false;
   if(isCar==true) // if(isCar=true) code work here
       System.out.println("It is really car");

   isCar=true;
   boolean wasCar=isCar?true:false;
   if(wasCar)
       System.out.println("wasCar is true");

   int ageofClient=20;
   boolean isEighteenOver=(ageofClient>18)?true:false;
   if(isEighteenOver)
       System.out.println("Yes it is eighteen over");

    }
}
