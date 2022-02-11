import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> dieCasts = new ArrayList<>();
        for(Integer i = 0; i <= 10; i++){
            dieCasts.add(getRoll(20));
        }
        return dieCasts;
    }    
    public Integer getRoll(Integer randLimit){
        Random rand = new Random();
        return rand.nextInt(randLimit) + 1;
    }

    public ArrayList<String> getNewPasswordSet(int setLength){
        ArrayList<String> giveSet = new ArrayList<String>();
        for(int i = 0; i < setLength; i++){
            giveSet.add(generatePassword(8));
        }
        return giveSet;
    }

    public String generatePassword(int limit){
        String password = "";
        for(int i = 1; i <= limit; i++){
            password = password.concat(getRandomLetter());
        }
        return password;
    }

    public String getRandomLetter(){
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        return alphabet[new Random().nextInt(26)];
    }

    public ArrayList<String> shuffleArray(ArrayList<String> givenList){
        for(int i = 0; i < givenList.size(); i++){
            givenList = swapArrayItems(givenList, i, new Random().nextInt(givenList.size()));
        }
        return givenList;
    }

    public ArrayList<String> swapArrayItems(ArrayList<String> givenList, int firstIndex, int secondIndex){
        String tempValue = givenList.get(firstIndex);
        givenList.set(firstIndex, givenList.get(secondIndex));
        givenList.set(secondIndex, tempValue);
        return givenList;
    }

}
