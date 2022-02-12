class Algos{

    public int[] Reverse(int[] numbers){
        int[] reverse = new int[numbers.length];
        int index = 0;
        for(int i = numbers.length - 1; i >= 0; i--){
            reverse[index] = numbers[i];
            index++;
        }
        return reverse;
    }

    public int[] replaceEvens(int[] intArray){
        int index = 0;
        while(index < intArray.length){
            if(intArray[index] % 2 == 0){
                intArray[index] = 0;
            }
            index++;
        }
        return intArray;
    }
}