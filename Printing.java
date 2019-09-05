package com.company;
/**
 * @author Junaid Atta 05/Sep/2019
 *
 */

public class Printing {

    /**
     *This Function prints possible combinations of given value.
     */
    static void printing(int arr[], int m)
    {
        for (int i = 0; i < m; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
