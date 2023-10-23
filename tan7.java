public class ConvertingBinaryToDecimal {
    // function for converting binary to decimal number
    public static int getDecimalNumber(int binaryNumber){
        int decimalNumber = 0;
        int power = 0;
        while(binaryNumber > 0){
            //taking the rightmost digit from binaryNumber
            int temp = binaryNumber%10;
            //now multiplying the digit and adding it to decimalNumber variable
            decimalNumber += temp*Math.pow(2, power);
            //removing the rightmost digit from binaryNumber variable
            binaryNumber = binaryNumber/10;
            //incrementing the power variable by 1 to be used as power for 2
            power++;
        }
        return decimalNumber;
    }

    public static void main(String args[]){
        System.out.println("Decimal value is: "+getDecimalNumber(111010));
        System.out.println("Decimal value is: "+getDecimalNumber(001010));
    }
}
