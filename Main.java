package com.company;

/**
 * @author Junaid Atta 05/Sep/2019
 */
public class Main {
    /**
     * Its Application entry point
     *
     * @param args {@link String[]} it passes configurations to program
     */
    public static void main(String[] args) {
        if (args[0].contains("test1")) {
            int amount = 9; //test case 1
        } else if (args[1].contains("test2")) {
            int amount = 13; //test case 2
        }

        int[] array = new int[80];

        //It invokes the CoinsComb function from CoinsComb Class
        CoinsComb.CoinsComb(array, 9, 0);

    }
}
