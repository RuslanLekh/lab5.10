public class task4 {
    public static void main(String[] args) {
        int number = 1, n = 1 ;
        for ( ; n <= 10; n++){
            number *= n ;
        }
        System.out.println("Факторіал через оператор for "+ number);
        System.out.println();
        while (n <= 10) {
            number *= n;
            n++;
        }
        System.out.println("Факторіал через оператор while "+number);
    }
}
