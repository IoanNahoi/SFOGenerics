import javax.security.auth.callback.CallbackHandler;

public class Main {
    public static void main(String[] args) {
        Integer[] integersArray = {3, 4, 5};
        Character[] charArray = {'a', 'b', 'c'};
        Double[] doubleArray = {2.15, 3.14, 9.99};
//        System.out.println("\nINTEGER:");
//        printArrayInteger(integersArray);
//        System.out.println("\nCHAR:");
//        printArrayChar(charArray);
//        System.out.println("\nDOUBLE:");
//        printArrayDouble(doubleArray);
        System.out.println("\nGeneric");
        genericMethod(integersArray);
        System.out.println();
        genericMethod(charArray);
        System.out.println();
        genericMethod(doubleArray);
        System.out.println("\nScimbare pozitii:");
        exchangePosition(integersArray, 0, integersArray.length - 1);
        for (Integer integer : integersArray) {
            System.out.println(integer);
        }
        System.out.println("\nNumere prime:");
        countPrimeNumber(integersArray);
    }

    public static void printArrayInteger(Integer[] array) {
        for (Integer integer : array) {
            System.out.println(integer);
        }
    }

    public static void printArrayChar(Character[] array) {
        for (Character character : array) {
            System.out.println(character);
        }
    }

    public static void printArrayDouble(Double[] array) {
        for (Double aDouble : array) {
            System.out.println(aDouble);
        }
    }

    static <E> void genericMethod(E[] array) {
        for (E e : array) {
            System.out.println(e);
        }
    }

    static <E> void exchangePosition(E[] array, int position1, int position2) {
        E aux = array[position1];
        array[position1] = array[position2];
        array[position2] = aux;
    }

    static boolean prim(int number) {
        for (int d = 2; d < number; d++) {
            if (number % d == 0) {
                return false;
            }
        }
        return true;
    }

    static <E> void countPrimeNumber(E[] array) {
        int nr = 0;
        for (E e : array) {
            try {
                int x = (int) e;
                if (prim(x)) {
                    nr++;
                }
            } catch (NumberFormatException exception) {
                throw new ArithmeticException(" Nu a fost introdus un numar intreg");
            }
        }
        System.out.println("In array exista " + nr + " numere prime.");
    }
}


