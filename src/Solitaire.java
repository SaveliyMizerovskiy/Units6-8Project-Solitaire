import java.util.Scanner;

public class Solitaire {
    //logic
    public Solitaire(){

    }

    public void startGame(){
        System.out.println("Welcome to Java Solitaire!");
        boolean isRunning = true;
        while (isRunning){
            try {isRunning = menu();} catch(InterruptedException ignored){}
        }

    }

    private boolean menu() throws InterruptedException{
        boolean isRunning = true;
        System.out.println("Please Select an Option:");
        System.out.println("1. Start New Game");
        System.out.println("2. Make a Move");
        System.out.println("3. Get Hint");
        System.out.println("4. Get Card From Stack");
        System.out.println("5. Quit Game");
        Scanner scan = new Scanner(System.in);
        System.out.print("Choice: ");
        int choice = scan.nextInt();
        if (choice == 1){
            resetGame();
            System.out.println("Game Reset");
            Thread.sleep(500);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        else if (choice == 2){
            if (!makeMove()){
                System.out.println("Invalid Move");
            }
            Thread.sleep(500);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        else if (choice == 3){
            getHint();
            Thread.sleep(500);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        else if (choice == 4){
            getCard();
            Thread.sleep(500);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        else if (choice == 5){
            System.out.println("Game Ended, Come Back Soon!");
            isRunning = false;
            Thread.sleep(500);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } else {
            System.out.println("Invalid Choice");
            Thread.sleep(500);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        //Thread.sleep(500);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        return isRunning;
    }
    private void resetGame(){
        System.out.println("Game Reset Successful");
    }
    private boolean makeMove(){
       return true; // true if move successful
    }
    private void getHint(){
        System.out.println("Hunt Acquired");
    }
    private void getCard(){
        System.out.println("Card Acquired");
    }
}
