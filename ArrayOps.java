public class ArrayOps {
    public static void main(String[] args) {
    int[] array1 = {2,8,3,7,8};
    int result = secondMaxValue (array1);
    System.out.println(result);
    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        int missingInt = 0 ;
        int n = array.length ;
        int sum1 = 0 ;
        int sum2 = (n * (n + 1) / 2) ;
        for (int i = 0 ; i < n ; i ++) {
            sum1 = sum1 + array [i] ;
        }
        missingInt = sum2 - sum1 ;
        return missingInt ;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int max = array [0] ;
        int secondMax = array [0] ;
        for (int i = 0 ; i < array.length ; i ++) {
            if (array [i] >= max) {
                max = array [i] ;
            }
        }
        for (int i = 0; i < array.length; i ++) {
            if (array [i] > secondMax && array [i] <= max) {
                secondMax = array [i] ;
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        int exist1 = 0 ;
        int exist2 = 0 ;
        for (int i = 0 ; i < array1.length ; i ++) {
            for (int j = 0 ; j < array2.length ; j ++) {
                if (array1 [i] == array2 [j]) {
                    exist1 ++ ;
                    break ;
                }
            }
        }
        for (int i = 0 ; i < array2.length ; i ++) {
            for (int j = 0 ; j < array1.length ; j ++) {
                if (array2 [i] == array1 [j]) {
                    exist2 ++ ;
                    break ;
                }
            }
        }
        if (exist1 == array1.length && exist2 == array2.length) {
            return true ;
        }
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        int i = 1 ;
        while (i < array.length && array [i] <= array [i-1]) {
            i ++ ;
        }
        if (i == array.length) {
            return true ;
        }
        i = 1 ;
        while (i < array.length && array [i] >= array [i-1]) {
            i ++ ;
        }
        if (i == array.length) {
            return true ;
        }
        return false ;  
    }    
}
