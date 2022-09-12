    // vowelCount(String s) counts the # of vowels in a String and prints that number.
    public static void vowelCount(String s) {
        String vowels = "aeiouAEIOU"; // Stores vowels for comparison. Upper and lower case required.
        int count = 0; // keeps track of the number of vowels in s.
        // For loop used to loop through String s
        for(int i=0; i<s.length();i++) {
            char c = s.charAt(i); // stores each index as a character as loop goes through String s.
            // if character exists in vowels, 1 will be added to the count.
            if(vowels.contains(Character.toString(c))){ 
                count += 1;
            }
        }
        // Print the count. count = total number of vowels found in String s.
        System.out.println("The number of vowels in the line is: " + count);
    }