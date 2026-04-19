import java.util.*;
public class string{
    //function for printing string using loop and charAt
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    //check a string is palindrome or not
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }

    //finding shortest path for a given string
    public static float getShortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0; i<path.length(); i++){
            int dir = path.charAt(i);
            //North
            if(dir == 'N'){
                y++;
            }
            //South;
            else if(dir == 'S'){
                y--;
            }
            //West
            else if(dir == 'W'){
                x--;
            }
            //East
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }

    //printing substring of a string
    public static String printSubString(String str, int si, int ei){
        String subString = "";
        for(int i=si; i<ei; i++){
            subString += str.charAt(i);
        }
        return subString;
    }

    //function for converting a string into uppercase
    public static String toUpperCaseString(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    //function for string compressed
    public static String compressed(String str){
        String newStr = "";

        for(int i=0; i<str.length(); i++){
            Integer count = 1;

            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            //for single number of string
            newStr += str.charAt(i);

            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;

    }

    // practie question
    // 1. Count how many times lowercase vowels occurred in a String entered by the user.
    public static void countVowels(String str){
        int count = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
            
        }
        System.out.println("Count of vowel is " + count);
    }

    // Determine if 2 Strings areanagrams of each other.What are anagrams?If two strings contain the same characters but in a different order,they can be said to be anagrams. Consider race and care.In this case,race's characters can be formed into a study, or care's characters can be formed into race.Below is a java program to check if two strings are anagrams or not.

    public static void anagramsString(String str1, String str2){
        //converting into lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check the length are same or not
        if(str1.length() == str2.length()){
            char [] str1charArray = str1.toCharArray();
            char [] str2charArray = str2.toCharArray();

            //sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else{
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else{
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }

    }
    public static void main (String args[]){
        // char arr[] = {'a', 'b', 'c', 'd'};

        // //Strings
        // String str = "abcd12@";
        // String str1 = new String("abcde11#2@");

        // //String are immutable
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a String: ");
        // String name = sc.nextLine();
        // System.out.println(name);

        // //length function
        // System.out.println(name.length());

        //concatination
        String firstname = "Jafar";
        String lastname = "Ali";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        //charAt function
        // System.out.println(fullname.charAt(2));
        // printLetters(fullname);

        // String str = "1221";
        // System.out.println(isPalindrome(str));

        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));

        String str = "HelloWorld";
        //with userdefined function
        // System.out.println(printSubString(str, 0, 5));

        // with pre-defined function
        System.out.println(str.substring(0, 5));

        //find largest string 
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];

        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        // System.out.println(largest);

        //converting into uppercase
        String name = "hi, my name is jafar ali";
        // System.out.println(toUpperCaseString(name));

        //compressed strings
        String newStr = "aaaabbbcc";
        System.out.println(compressed(newStr));

        // Ans 1. 
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        countVowels(st);

        // Ans 4
        String str1 = "earth";
        String str2 = "Heart";

        anagramsString(str1, str2);


    }
}