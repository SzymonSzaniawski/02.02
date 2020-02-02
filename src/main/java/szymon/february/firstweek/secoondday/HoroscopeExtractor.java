package szymon.february.firstweek.secoondday;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HoroscopeExtractor {

    private static final String PATTERN = "<p class=\"lead\">.+";

    public static String getHoroscopeText(String pageAsText){
        Pattern horoscopePattern = Pattern.compile(PATTERN);
        Matcher horoscopeMatcher = horoscopePattern.matcher(pageAsText);
        String  foundText = "";
        if (horoscopeMatcher.find()) {
            foundText = horoscopeMatcher.group();
        }
        return foundText;
    }


}
