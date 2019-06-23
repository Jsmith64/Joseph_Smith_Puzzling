import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.List;

public class PuzzleJava {

    public static void main(String[] args){
        PuzzleJava tester = new PuzzleJava();

        System.out.println("Code 1"+ "\n");
        int[] numberArray = {3,5,1,2,7,9,8,13,25,32};
        System.out.println(tester.sumArrayAndGreaterThan10(numberArray));

        System.out.println("\n" + "Code 2"+ "\n");
        String[] names = {"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
        System.out.println(tester.namePrintAndSort(names));

        System.out.println("\n" + "Code 3"+ "\n");
        String[] letter = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        tester.randomLetter(letter);

        System.out.println("\n" + "Code 4"+ "\n");
        System.out.println(Arrays.toString(tester.randomNumber55To100()));

        System.out.println("\n" + "Code 5"+ "\n");
        tester.randomSort55To100();

        System.out.println("\n" + "Code 6"+ "\n");
        tester.randomString(letter);

        System.out.println("\n" + "Code 7"+ "\n");
        tester.tenRandomString(letter);

    }
        //Takes an integer array and sums up the integers. It also returns all values greater than 10 in an array
    public ArrayList sumArrayAndGreaterThan10(int[] arr){
        int sum = 0;
        ArrayList<Integer> newArray = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] > 10){
                newArray.add(arr[i]);
            }
        }
        System.out.println("The sum of the array is: " + sum);
        return newArray;
    }
    //Takes a String array and prints all string values. It also returns all String values with more than 5 character in an array
    public ArrayList namePrintAndSort(String[] names){
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
            if(names[i].length() > 5){
                list.add(names[i]);
            }
        }
        return list;
    }
    //takes an array of letters and shuffles the values. It prints the last and first letter of the new array order, and if the first letter is a vowel it will print a message
    public void randomLetter(String[] input){
        List<String> letters = Arrays.asList(input);
        Collections.shuffle(letters);
        System.out.println(letters.get(letters.size() - 1));
        System.out.println(letters.get(0));
        if(letters.get(0) == "a" || letters.get(0) == "e" || letters.get(0) == "i" || letters.get(0) == "o" || letters.get(0) == "u"){
            System.out.println("Lucky!");
        }
    }
    //creates and array with 10 random numbers between 55 and 100
    public int[] randomNumber55To100(){
        int[] numbers = new int[10];
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            numbers[i] = random.nextInt(100 - 55) + 55; 
        }
        return numbers;
    }
    //creates a list of 10 random numbers, sorts and prints the highest and lowest values, before returning the list
    public List randomSort55To100(){
        int[] numbers = new int[10];
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            numbers[i] = random.nextInt(101 - 55) + 55; 
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i : numbers){
            list.add(i);
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        return list;
    }
    //creates a string from an array of letters.
    public void randomString(String[] letters){
        Random random = new Random();
        String ranString = "";
        for(int i = 0; i < 5; i++){
            ranString += letters[random.nextInt(letters.length)];
        }
        System.out.println(ranString);
    }

    public void tenRandomString(String[] letters){
        Random random = new Random();
        String[] list = new String[10];
         for(int j = 0; j < 10; j++){
            String ranString = "";
            for(int i = 0; i < 5; i++){
                ranString += letters[random.nextInt(letters.length)];
            }
            list[j] = ranString;
         }
        System.out.println(Arrays.toString(list));
    }

}