public class ConditionalStatement {

    public static void main(String[] args) {

        int age=21;
        int height=183;
        boolean isSex="M"=="M";
        char firstnameletter='A';
        boolean isFirstNameLetterA = firstnameletter == 'A';
        boolean isFirstNameLetterI = firstnameletter == 'I';

            if(age > 20) {
                System.out.println("Old");
            }else{
                System.out.println("yung");
            }
            if(isSex = true){
                System.out.println("Male");
            }else if(isSex = false){
                System.out.print("Female");
            }
            if(height > 180){
                System.out.println("Tall");
            }else{
                System.out.println("Short");
            }
            if(isFirstNameLetterA = true){
                System.out.println("First name letter A");
            }else if(isFirstNameLetterI = true){
                System.out.println("First name letter I");
            }else
                System.out.println("Your first name letter not A or I");

    }
}


