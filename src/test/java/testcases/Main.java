package testcases;

import org.apache.commons.lang3.StringUtils;

import java.text.DecimalFormat;

public class Main {
    public static void main(String args[]){
        String rateChange ="<font color='#80121212'>▼ 0.25% since yesterday</font>";
        String goldRate;
        double goldRate1 = 3456.90;
        //DecimalFormat priceFormat = new DecimalFormat("##,##,##,##0.00");
        DecimalFormat priceFormat = new DecimalFormat("##,##,##,##0.##");
        goldRate = priceFormat.format(goldRate1);
        System.out.println(goldRate);
//        String yesterdayRateChange = StringUtils.substringBetween(rateChange, "'>", "</");
//        System.out.println(yesterdayRateChange);


    }
}
