import java.util.Scanner;

class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    
    Scanner input = new Scanner(System.in);
    //create a scanner object to read input from console

    int round=0;
    int cnt=0;
    System.out.println("please type in how many round");
    round = input.nextInt();
    System.out.println("great let's start talking "+ round + " round, what do you want to talk about?");
    //set the round limit
    input.nextLine();
    

    
    while(cnt<round){
      System.out.println("you: ");
      String talk=input.nextLine();
      System.out.println("bot: humm");
      cnt++;
    }

  }
}
