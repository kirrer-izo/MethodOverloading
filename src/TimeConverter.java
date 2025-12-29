public class TimeConverter {

    public static void main(String[] args) {
        getDurationString(60);
        getDurationString(20);
        getDurationString(-20);
        getDurationString(200);
        getDurationString(3700);
        getDurationString(20, 59);
        getDurationString(70, 48);
        getDurationString(70,60);
        getDurationString(-2,10);
        getDurationString(-2,-10);


    }

    public static void getDurationString(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            System.out.println("00h 00m " + seconds + "s");
        } else if (seconds < 0){
            System.out.println("Invalid Input");
        } else {
            boolean hasMinute = (seconds >= 60) && ( seconds < 3600);
            boolean hasHour = (seconds > 3600);

            if (hasMinute) {
                int minutes = seconds / 60;
                getDurationString(minutes, seconds % 60);
            } else if (hasHour) {
                int minutes = seconds / 60;
                getDurationString(minutes, seconds % 60);
            }
        }
    }

    public static void getDurationString(int minutes,int seconds) {
        if (minutes >= 0 && seconds <= 59 && seconds >= 0) {
            boolean hasHours = (minutes >= 60);
            if(hasHours) {
                System.out.println(minutes/60 + "h " + minutes%60 + "m " +seconds);
            }else {
                System.out.println("00h " + minutes + "m " + seconds + "s");
            }
        }else {
            System.out.println("Invalid Input");
        }
    }
}
