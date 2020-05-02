package ru.victoria.arrays;

public class ArraysSearch {
    public static void main(String[] args) {
        String[] words = {
                "foo", "airplane", "space", "bar", "function", "planet"
        };

        System.out.println(containsWord(words, "foo"));
        System.out.println(containsWord(words, "test"));
        System.out.println(containsWord(words, "planet"));
        System.out.println(containsWord(words, "Space"));
    }

    //function signature === functionName + parameterType
    public static boolean containsWord(String[] words, String word) {
        for(int i = 0; i < words.length; i++ ){
            //if (words[i]==word)
            if (words[i].equals(word)){
                return true;
            }
        }
        return false;
    }

    //implement

    public static boolean containsNumber(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == num) {
                return true;
            }
        return false;
    }


    public static boolean containsNumber(double[] nums, double num) {
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == num){
                return true;
            }
        }
        return false;
    }

}
