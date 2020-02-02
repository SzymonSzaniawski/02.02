package szymon.february.firstweek.secoondday;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.regex.Pattern;


public class Connector {

    public static final String NOT_FOUND = "NOT FOUND";
    private static final String URL_TEMPLATE = "https://horoskopy.gazeta.pl/horoskop/[placeholder]/dzienny";

    public static String getPage(String zodiacSign) {
        String fullUrl = URL_TEMPLATE.replace("[placeholder]", zodiacSign);
        String requestResult;
        try {
            requestResult = Jsoup.connect(fullUrl).get().html();
        } catch (IOException e) {
            requestResult = NOT_FOUND;
            e.printStackTrace();
        }
        return requestResult;
    }

//    public static void getHoroscopeText(String pageAsText){
//        Pattern pattern = Pattern.compile()
//    }

}