import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    
    Scanner input = new Scanner(System.in);
    //create a scanner object to read input from console

    List<String> transcript = new ArrayList<>();
    //create a list for transcript

    int round=0;
    int cnt=0;
    System.out.print("How many round? ");
    round = input.nextInt();
    System.out.println("great let's start talking "+ round + " round, what do you want to talk about?");
    //set the round limit
    String talk = input.nextLine();
    //
    
    while(cnt<round){
      System.out.print("you: ");
      talk=input.nextLine();
      String botReply="humm";
      System.out.println(botReply);
      cnt++;
      transcript.add(talk);
      transcript.add(botReply);
    }
    //do the talking

    System.out.println("\n--- Conversation Transcript ---");
    for (String line : transcript) {
      System.out.println(line);
    }
    //print a transcript

  }
}
