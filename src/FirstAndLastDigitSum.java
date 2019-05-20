public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number){

        if (number < 0){
            return -1;
        }

        int first = 0;
        int last = 0;

        int parameter = number;

        last = parameter % 10;
        first = parameter;

        while (first >= 10){
            first /= 10;
            // first = first / 10;
        }

        return first + last;

    }
}
