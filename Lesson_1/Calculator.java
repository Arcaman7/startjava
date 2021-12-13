public class Calculator {

    public static void main(String[] args){

        int firstNumber=20;
        int secondNumber=4;
        int i;
        int result=0;
        String operation="^";
        boolean ifOperationPlus=operation=="+";
        boolean ifOperationMinus=operation=="-";
        boolean ifOperationMultypli=operation=="*";
        boolean ifOperationDivision=operation=="/";
        boolean ifOperationDegree=operation=="^";
        boolean ifOperationRemainder=operation=="%";

         if(ifOperationPlus==true){
                    result=firstNumber+secondNumber;
                    System.out.println("summa chisel "+firstNumber+" i "+secondNumber+" ravna "+result);
                }else if(ifOperationMinus==true) {
                    result=firstNumber-secondNumber;
                    System.out.println("raznost chisel "+firstNumber+" i "+secondNumber+" ravna "+result);
                }else if(ifOperationMultypli==true){
                    result=firstNumber*secondNumber;
                    System.out.println("proizvedenie chisel "+firstNumber+" i "+secondNumber+" ravna "+result);
                }else if(ifOperationDivision==true){
                    result=firstNumber/secondNumber;
                    System.out.println("delenie chisla "+firstNumber+" na chislo "+secondNumber+" ravno "+result);
                }else if(ifOperationDegree==true){
                    result=firstNumber;
                    for(i=1; i<secondNumber; i++){
                        result=result*firstNumber;
                    }
                    System.out.println("stepen  "+secondNumber+" chisla "+firstNumber+" ravna "+result);
                }else if(ifOperationRemainder==true){
                    result=firstNumber%secondNumber;
                    System.out.println("ostatol ot deleniya "+firstNumber+" na "+secondNumber+" ravno "+result);
                }

    }
}
