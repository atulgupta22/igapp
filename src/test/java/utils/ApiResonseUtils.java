package utils;
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.net.HttpURLConnection;
 import java.net.URL;
 import java.text.DecimalFormat;
 import java.text.NumberFormat;
 import java.util.Locale;

 import org.json.JSONException;
 import org.json.JSONObject;


public class ApiResonseUtils {
    public static String goldRate;
    public static String goldRateInGram;
    public static String  yesterdayRateChange;
    public static Double goldRate1;
    public static Double exclusiveGoldRate; //buyPrice

    public static void MyGETRequest() throws IOException {

        URL urlForGetRequest = new URL("https://dev.indiagiftsgold.com:3001/asset/price?assetName=GOLD&partnerName=AUGMONT");
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        //conection.setRequestProperty("userId", "a1bcdef"); // set userId its a sample here
        int responseCode = conection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conection.getInputStream()));
            StringBuffer response = new StringBuffer();
            while ((readLine = in.readLine()) != null) {
                response.append(readLine);
            }
            in.close();
            System.out.println("JSON String Result " + response.toString());
            JSONObject jObject = new JSONObject(response.toString());
            JSONObject geoObject = jObject.getJSONObject("result");
            goldRate1 = geoObject.getDouble("gstInclusivePrice");
            exclusiveGoldRate = geoObject.getDouble("buyPrice");
            String rateChange = geoObject.getString("displayRateChange");
            System.out.println(rateChange);
            DecimalFormat priceFormat = new DecimalFormat("##,##,##,##0.00");
            goldRate = priceFormat.format(goldRate1);
            goldRateInGram = "₹"+goldRate+"/gm";
            yesterdayRateChange = rateChange.substring(22, 29);
            System.out.println(goldRateInGram);
            System.out.println(yesterdayRateChange);
        } else {
            System.out.println("GET NOT WORKED");
        }



    }



}
