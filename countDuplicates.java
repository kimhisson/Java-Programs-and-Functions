  /* countDuplicates() checks for duplicate array values in a given array and outputs if there is at least one
    *  duplicate value or if all values are distinct from each other. 
    *  A Set is used in because we can easily determine if there is a duplicate using the setName-.add(a) function.
    *  JAVA DOES NOT ALLOW FOR DUPLICATES IN A SET STRUCT.
    *  If set.add(value) == FALSE then we know there are duplicates. Boolean used to save and output this value. */

    public static void countDuplicates(int[] a) {
        Set<Integer> setFromArray = new HashSet<>();// Creates set that array will get put into.
        boolean duplicates = false; // FALSE = no duplicates exist. TRUE = duplicates exist.

        for (int value : a) { // for each value in array a  do this...
            /* A Set struct in Java does not allow for duplicates. If we try to add an element from the array 
             * into our Set and we already added it, setFromArray.add will be false so we know duplicates exist.*/
            if (setFromArray.add(value) == false) { 
                duplicates = true; // Set boolean duplicates to true because duplicates exist.(Default == FALSE)
            }
        }
        // Output result. duplicates == TRUE oor default, duplicates == FALSE.
        if(duplicates) {
            System.out.println("Duplicate values exist in the array.");
        }else{
            System.out.println("No duplicates exist in the array.");
        }
    }