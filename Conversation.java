import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 * This class simulates a conversation with a bot that mirrors certain words
 * and provides a transcript of the conversation at the end.
 */
class Conversation {
/**
 * This is the entry point of the conversation program. It handles user input, 
 * mirrors responses, and prints a transcript of the conversation.
 * @param arguments Command line arguments (not used in this program)
 */
  public static void main(String[] arguments) {
    // start the conversation 
    
    Scanner input = new Scanner(System.in);
    //create a scanner object to read input from console

    int round=0;
    
    System.out.print("How many round? ");
    round = input.nextInt();//set the round limit
    input.nextLine();
    String[] userInput = new String[round];
    System.out.println("Hi there!  What's on your mind?");  
    String[] botResponse = new String[round];
    
    for(int i=0;i<round;i++){
      System.out.print("you: ");

      userInput[i]=input.nextLine();
      System.out.print("bot: ");
      botResponse[i] = mirrorWords(userInput[i]);
      System.out.println(botResponse[i]);
      

    }
   
    System.out.println("see ya!");
    // Print the transcript
    System.out.println("----------TRANSCRIPT:-----------");
    ArrayList<String> transcript = new ArrayList<>();

   transcript.add("Hi there!  What's on your mind?");
   for(int i=0;i<round;i++){
      transcript.add(userInput[i]);
      transcript.add(botResponse[i]);
   }
   
    transcript.add("See ya!");

    for (String element : transcript) {
      System.out.println(element);
  }
    input.close();
  }
 
  /**
 * This method mirrors specific words like "I" to "you", "am" to "are", etc., 
 * and returns the mirrored sentence.
 * @param input The user's input string
 * @return The mirrored response string
 */
    private static String mirrorWords(String input) {
      // Define word pairs for mirroring
      
      String[] result = input.split(" ");
      String[] original = Arrays.copyOf(result, result.length);
      String[] cannedWordArrayString = {"Mmm-hm","Ah-ha","Agree","You're sick","love ya"};
      for (int i = 0; i < result.length; i++) {
      // Loop through the word pairs and replace if the input contains the word
        if (result[i].equals("I")) {
          result[i] = "you"; 
        }else if (result[i].equals("me")) {
          result[i] = "you"; 
        }else if (result[i].equals("am")) {
          result[i] = "are"; 
        }else if (result[i].equals("You")) {
          result[i] = "I";  
        } else if (result[i].equals("my")) {
          result[i] = "your"; 
        } else if (result[i].equals("your")) {
          result[i] = "my"; 
        } 
      }
      if(Arrays.equals(result, original)){
        int randomIndex = (int) (Math.random() * cannedWordArrayString.length);
        String cannedWord= cannedWordArrayString[randomIndex];
        return cannedWord;
      }else{
        return String.join(" ", result)+"?";
      }
  
 

  }
 
}
