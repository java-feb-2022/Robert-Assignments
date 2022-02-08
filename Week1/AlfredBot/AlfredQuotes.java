import java.io.Console;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        dayPeriod();
        return String.format("%s%s. Lovely to see you.", dayPeriod(), name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return "It is currently " + new Date();
    }

    private String dayPeriod() {
        int dateTime = new Date().getHours();
        if(0 <= dateTime && dateTime <= 11){
            return "Good morning, ";
        }
        else if(11 < dateTime && dateTime <= 16){
            return "Good afternoon, ";
        }
        else{
            return "Good evening, ";
        }

    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.toLowerCase().contains("alexis")){
            return "Right away sir. She certainly isn't sophistaicated enough for that.";
        }
        else if(conversation.toLowerCase().contains("alfred")){
            return "At your service. As you wish, naturally.";
        }
        else{
            return "Right. And with that I shall retire.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

