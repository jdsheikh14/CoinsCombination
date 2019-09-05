
/**
 * @author Junaid Atta 05/Sep/2019
 *
 */
package com.company;
import java.util.ArrayList;
import java.util.List;
public class CoinsComb {
    /**
     *This Function Iterate recursively to create possible combinations of given value.
     */
    static void CoinsComb(int coinsArray[], int n, int index)
    {
        ArrayList<Integer> currency = new ArrayList<Integer>(); //arraylist containing currency values
        currency.add(1);
        currency.add(2);
        currency.add(5);
        currency.add(10);

        //condition check if value not equals 0
        if (n > 0) {
            for (int j = 1; j <= n; j++) //loop to create possible combinations
            {
                if(currency.contains(j))  //checking value if lies in loop
                {
                    coinsArray[index]= j;  //storing into array
                    CoinsComb(coinsArray, n-j, index+1); //directly recursiving the function
                }
                continue;

            }

            }
        // else condition check if value equals 0
        else if(n==0)
        {
            Printing.printing(coinsArray, index); //if value of n equals to 0 then permutations to be printed using printing funtion of Printing class.


        }
    }



}
