 /* sumOfSquares() is a function that takes a POSITIVE integer value and returns the sum of all the
    *  positive integers smaller than n. The first if statement checks that the num passed through
    *  is positive. If it is not, it will prompt for new input until a positive integer is entered and
    *  return that (returns newSum)
    */
    public static int sumOfSquares(int num) {
        int sum = 0; // Holds the sum total of squares of num-1.
        int newNum; // Holds the new integer input that user is prompted for if a negative integer value was passed through.
        int newSum; // Holds the sum value that will be returned from newSum.

        /* If integer passed through is a negative number this if clause will let the user know and will get
         * new input to pass through sumOfSquares().*/
        if(num < 0) {
            Scanner s = new Scanner(System.in); // creates new Scanner object.
            System.out.println("The value is not a positive integer. Reenter a " +
                        "positive integer.");
            try {
                newNum = s.nextInt();
                newSum = sumOfSquares(newNum); // recursive call to get sum of square of new input.
                return newSum; // returns new sum value
            } catch (InputMismatchException e) { // Catches exception for input that is not an integer.
                System.out.println("You did not enter a number. Try again. ");
                newNum = s.nextInt();
                newSum = sumOfSquares(newNum); // recursive call to get sum of square of new input.
                return newSum;
            }
        }else{
            while(num>0) {
                /* Need to start by subtracting one or the sum will include the square of num and this program
                 * is the sum of all (positive) integers SMALLER THAN num. Then subtract one until num = zero. */
                num -= 1;
                sum += num * num; // adds square of num as num goes through while loop.
            }
        }
        return sum; // returns value of sum of squares of all integers smaller than num.
    }
