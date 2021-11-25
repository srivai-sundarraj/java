package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int level = 5;
        int bonus = 100;
        /*if (score < 5000 && score>1000) {
            System.out.println("your score is less than 5000 and greater than 1000");
        } else if(score < 1000) {
            System.out.println("your value less than 1000");
        }
        else
        System.out.println("Go here");*/

        if(gameOver==true){
            int finalScore=score+(level*bonus);
            finalScore+=1000;
            System.out.println("your Final Score : "+ finalScore);
        }

        //use new variable
        /*boolean newGameOver = true;
        int newScore = 10000;
        int newLevel = 8;
        int newBonus = 200;
        if (newGameOver == true) {
            int finalScore = newScore + (newLevel * newBonus);
            System.out.println("your Final Score : " + finalScore);
        }*/

        //Duplicate varibale
        score = 10000;
        level = 8;
        bonus = 200;
        if(gameOver==true){
            int finalScore=score+(level*bonus);
            System.out.println("your Final Score : "+ finalScore);
        }
    }
}
