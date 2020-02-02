package szymon.february.firstweek.secoondday;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("podaj zank zodiaku małymi literami polskiego alfabetu");
        String zodiacSign = scan.nextLine();
        String requestResult = Connector.getPage(zodiacSign);
        String horoscopeMessage = "";
        if (!requestResult.equals(Connector.NOT_FOUND)) {
            horoscopeMessage = HoroscopeExtractor.getHoroscopeText(requestResult);
        }
        System.out.println(horoscopeMessage);
    }
}