public class Cycle {

    public static void main(String[] args) {

        for(int i = 0; i<=20; i++) {
            System.out.println("i = "+i);
        }
        int j = 6;
        while(j >= -6){
            System.out.println("j = "+j);
        j = j-2;
        }
        int x = 10;
        int sum = 0;
        do{
        if(x % 2 == 0) {
            System.out.println("chislo " + x + " chetnoe, ne summiruem");
        } else {
            System.out.println("chislo " + x + " nechetnoe,  summiruem");
        sum = sum + x;
        }
        x++;
        } while(x <= 20);
            System.out.println("sum = " + sum);

}
}
