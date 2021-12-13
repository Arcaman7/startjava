public class MyFirstGame {

    public static void main(String[] args) {

        int number;
        int userNumber=28;

        System.out.println("ugadaite chislo ot 0 do 100");
        number=(int)(Math.random()*100);
        
        if(userNumber<number) {
            do{
                System.out.println("vashe chislo "+userNumber+" menshe zagadannogo");
                userNumber=userNumber+1;
            } while(userNumber!=number);
            System.out.println("vi ugadali chislo "+number);
        } else if(userNumber>number){
            do{
                System.out.println("vashe chislo "+userNumber+" bolshe zagadannogo");
                userNumber=userNumber-1;
            } while(userNumber!=number);
            System.out.println("vi ugadali chislo "+number);
        } else{
            System.out.println("vi ugadali chislo "+number);
        }

    }
}