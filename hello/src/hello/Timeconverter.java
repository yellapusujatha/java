package hello;

public class Timeconverter {
    public static String convertMinutesToHours(int minutes) {
        int hours = minutes / 60;  
        int remainingMinutes = minutes % 60;  
        String result = hours + " hours " + remainingMinutes + " minutes";
        return result;
    }

    public static void main(String[] args) {
        int minutes = 125;  
        String durationInHours = convertMinutesToHours(minutes);
        System.out.println("Duration in hours: " + durationInHours);
    }



}
