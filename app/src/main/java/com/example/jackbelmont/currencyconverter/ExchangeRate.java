package com.example.jackbelmont.currencyconverter;

/**
 * Created by Thuc Nguyen on 12/10/2017.
 */

public class ExchangeRate {
    public static double getSpecificRate(String base, String target) {
        String rates[][] = new String[11][2];
        double rate;
        rates[0][0] = "US Dollar";
        rates[1][0] = "British Pound";
        rates[2][0] = "Japanese Yen";
        rates[3][0] = "Australian Dollar";
        rates[4][0] = "Swiss Franc";
        rates[5][0] = "Canadian Dollar";
        rates[6][0] = "Chinese Yuan";
        rates[7][0] = "Hong Kong Dollar";
        rates[8][0] = "Mexican Peso";
        rates[9][0] = "Brazilian Real";
        rates[10][0] = "Euro";

        rates[0][1] = "0.8499";
        rates[1][1] = "1.1377";
        rates[2][1] = "0.0075";
        rates[3][1] = "0.6381";
        rates[4][1] = "0.8560";
        rates[5][1] = "0.6616";
        rates[6][1] = "0.1284";
        rates[7][1] = "0.1089";
        rates[8][1] = "0.0449";
        rates[9][1] = "0.2584";
        rates[10][1] = "1.0000";
        rate = (Double.parseDouble(rates[get_Index(base, rates)][1]))/(Double.parseDouble(rates[get_Index(target, rates)][1]));
        return rate;
    }
    private static int get_Index(String str, String[][] array)
    {
        int index =0;
        for(int i = 0; i <= array[0][0].length() - 1; i++) {
            if (array[i][0].equals(str))
            {
                index = i;
            }
        }
        return index;
    }


}
