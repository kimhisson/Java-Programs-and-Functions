    public static int[] arrayProduct(int[] a, int[] b, int length) {
        /* This function gets 2 arrays of length n and multiplies corresponding indices, placing
         * the value into a new array, c. */
        int[] c = new int[length]; // length determined by passed through value.
        /* Loops through array a. Only need to loop through one array because index will update equally
         * for existing arrays a and b and new array c ([i++]). */
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * b[i]; // [i] starts at 0 and increases by 1 during for loop
        }
        // prints each product of new array c.
        for (int element : c) {
            System.out.println(element);
        }
        // returns new array c.
        return c;
    }