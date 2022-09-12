 /*
 Kim Johnson
 CPSC-34000-004
 is_even(int k).java
 --------------
 * This function accepts an integer and returns TRUE if it is even, FALSE if odd.
*/  
   
    private static boolean is_even(int k) {
        /* This String holds all numbers that make an integer even by ending in 0,2,4,6,8.
        This will be used to compare the last number in the integer passed through to 
        determine whether or not it is EVEN or ODD. */
        String isEven = "02468";
        
		// Creates a String from the integer parameter k.
        String number = String.valueOf(k);
        
		/* Gets the last number in the string, i.e. the last number of the integer that
		is passed through. */
        char lastNum = number.charAt(number.length() - 1);
		/* If the lastNum character is found in the isEven String 02468,
		this will return true and the number is EVEN. If not found in the String, 
		this will return false and is ODD. */
        return isEven.contains(Character.toString(lastNum));
    }
    