// Design anagram game using array.
//  Allow a user to enter N words and store it in an array.
//  Generate a random number between 0 to N-1.
//  Based on the random number generated display the word stored at that
// index of an array and allow user to enter its anagram.
//  Check whether the word entered by the user is an anagram of displayed
// number or not and display an appropriate message.
//  Given a word A and word B. B is said to be an anagram of A if and only if
// the characters present in B is same as characters present in A,
// irrespective of their sequence. For ex: “LISTEN” == “SILENT”

import java.util.*;

public class Lab32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 :- ");
        String a = sc.nextLine();
        System.out.println("Enter string 2 :- ");
        String b = sc.nextLine();
        int temp = 0;
        String n = a.toLowerCase();
        String m = b.toLowerCase();
        if(a.length()!=b.length()){
            System.out.println("Given Strings are not Anagram Strings");
        }
        else{
            for(int i=0;i<a.length();i++){
                for(int j=0;j<b.length();j++){
                    if(n.charAt(i)==m.charAt(j)){    
                        temp++;
                        break;
                    }
                }    
            }
        }
        if(temp == a.length()){
            System.out.println("Given Strings are Anagram Strings");
        }
        else{
            System.out.println("Given Strings are not Anagram Strings");
        }
        sc.close();
    }
}
