package szymon.february.firstweek.secoondday;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Siema byczku jak cię zwą ");
        String UserName = scan.nextLine();
        System.out.println("Którego dnia się urodziłeś ");
        Integer day =  scan.nextInt();
        scan.nextLine();
        System.out.println("Którego miesiąca się urodziłeś");
        Integer month = scan.nextInt();
        scan.nextLine();

        String requestResult = Connector.getPage("zodiacSign");
        String horoscopeMessage = "";
        if (!requestResult.equals(Connector.NOT_FOUND)) {
            horoscopeMessage = HoroscopeExtractor.getHoroscopeText(requestResult);
        }
        System.out.println(horoscopeMessage);
    }
}