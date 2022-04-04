public class task1 {
    public static void main(String[] args) {
        int number = 500 ;
        while ( number < 650 ){
            System.out.println("число: "+ number);
            number += 10 ;
        }
        do {
            System.out.println("число: " + number);
            number += 10;
        }while (number < 650);
        for (; number < 650 ;number =+ 10){
            System.out.println("число: " + number);
        }
    }
}

