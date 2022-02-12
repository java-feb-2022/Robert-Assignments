import java.util.Arrays;

public class TestAlgo {
    public static void main(String[] args){
        Algos reverse = new Algos();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int[] reverseArray = reverse.Reverse(numbers);
        // for(int i = 0; i < reverseArray.length; i++){
            //     System.out.println(reverseArray[i]);
            // }
            
            int[] replaceEvens = reverse.replaceEvens(numbers);
            System.out.println(Arrays.toString(numbers));
        // for(int i = 0; i < numbers.length; i++){
        //     System.out.println(numbers[i]);
        // }
    }
}
