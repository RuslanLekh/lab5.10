public class task5 {
    public static void main(String[] args) {
        int numb = 0 ;
        for (int time = 0 ; time < 24 ; time++ ){
            int timetens = time / 10;
            int timeones = time % 10 ;
            for (int minute = 0 ; minute < 60; minute++) {
                int minutetens = minute / 10;
                int minuteones = minute % 10;
            if (timetens == minuteones && timeones == minutetens ){
                System.out.println(timetens + "" + timeones + ":" + minutetens + "" + minuteones + "");
                numb++;
            }
            }
        }
        System.out.println("Кількість дзеркальних чисел: " +numb );
    }
}
