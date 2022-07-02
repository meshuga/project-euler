public class Euler17 {
    static final String[] initialNumbers = {
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty",
    };
    static final String[] tens = {
            "ten",
            "twenty",
            "thirty",
            "forty",
            "fifty",
            "sixty",
            "seventy",
            "eighty",
            "ninety",
    };
    static final String hundred = "hundred";
    static final String and = "and";

    public static void main(String... args) {
        int numbersToGenerate = 1_000;

        int sumOfChars = 0;

        for(int i=1; i<=numbersToGenerate; i++) {
            String number = generateNumber(i);
            sumOfChars += number.length();
        }
        String number = generateNumber(900);

        System.out.println(sumOfChars);
    }

    private static String generateNumber(int numberToGenerate) {
        String number = "";
        if (numberToGenerate < 21) {
            number = initialNumbers[numberToGenerate -1];
        } else if (numberToGenerate %10 == 0) {
            if (numberToGenerate < 100) {
                number = tens[numberToGenerate/10-1];
            } else if (numberToGenerate == 100) {
                number = initialNumbers[0]+hundred;
            } else if (numberToGenerate %100 == 0) {
                number = initialNumbers[numberToGenerate/100-1]+hundred;
            } else if (numberToGenerate < 200) {
                number = initialNumbers[0]+hundred+and+tens[(numberToGenerate-100)/10-1];
            } else if (numberToGenerate > 200) {
                number = initialNumbers[(numberToGenerate/100)-1]+hundred+and+tens[(numberToGenerate-100*(numberToGenerate/100))/10-1];
            }
        } else if (numberToGenerate < 100) {
            number = tens[numberToGenerate/10-1]+initialNumbers[(numberToGenerate-(10*(numberToGenerate/10)))-1];
        } else if (numberToGenerate < 120) {
            number = initialNumbers[0]+hundred+and+initialNumbers[(numberToGenerate-(10*(numberToGenerate/10)))-1];
        } else {
            if ((numberToGenerate/10)%10 == 0) {
                number = initialNumbers[(numberToGenerate/100)-1]+hundred+and+initialNumbers[(numberToGenerate-(10*(numberToGenerate/10)))-1];
            } else {
                number = initialNumbers[(numberToGenerate/100)-1]+hundred+and+tens[(numberToGenerate/10)%10-1]+initialNumbers[(numberToGenerate-(10*(numberToGenerate/10)))-1];
            }
        }

        return number;
    }
}
