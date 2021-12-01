package assignment_5;
import java.util.*;

public class HahingMap {
    public static void octal(String s)
    {

        // Here binary number is represented by string 's'
        // over which standard length() method is computed
        // to get the length of binary number

        // Appending 2 zeros if binary numbers leaves
        // remainder as 1 after dividing with 3
        if (s.length() % 3 == 1) {

            // Append  two zeros to it
            s = "00" + s;
        }

        // If binary string number length after equals 2
        else if (s.length() % 3 == 2) {

            // Concatenate string by adding 1 zero to it
            s = "0" + s;
        }

        // Creating an object of HashMap
        // Declaring object of String and Integer types
        HashMap<String, Integer> hm = new HashMap<>();

        // Adding elements to the object created above
        // using the put() method

        // Adding elements(key-value) pairs to given object
        // 000 in binary system  ->  0 in octal system
        // 001 in binary system  ->  1 in octal system

        // Similarly adding for 0 to N-1 (N=8 for octal)
        hm.put("000", 0);
        hm.put("001", 1);
        hm.put("010", 2);
        hm.put("011", 3);
        hm.put("100", 4);
        hm.put("101", 5);
        hm.put("110", 6);
        hm.put("111", 7);

        // Creating and declaring a string array
        String[] part = new String[3];
        int t = 0;

        // Iterating over the binary number digits
        for (int i = 0; i < s.length(); i = i + 3) {

            // Checking for substring in an binary number
            // digit array
            String bypart = s.substring(i, i + 3);
            part[t] = bypart;

            // If found
            if (hm.containsKey(part[t])) {

                // Getting the part to be matched for
                // its corresponding octal numbers
                System.out.print(hm.get(part[t]));
            }

            // Incrementing the counter
            t++;
        }
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {

        // Display message
        System.out.print("Enter the binary number to be converted : ");
        // Binary number to be converted
        // Custom entry
        String s = "num";

        // Calling the method1 octal() over the
        // above input entered number
        octal(s);

        // Display message
        System.out.print("Octal equivalent : ");
    }}