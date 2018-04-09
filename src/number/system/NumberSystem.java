package number.system;

import java.util.Scanner;

public class NumberSystem {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String str, num;
        double x = 0;
        Decimal d1 = new Decimal();
        Binary d2 = new Binary();
        Octal d3 = new Octal();
        Hexadecimal d4 = new Hexadecimal();
        System.out.println("Enter your convert");
        str = in.nextLine();
        System.out.print("Enter number : ");
        num = in.next();
        if (str.toLowerCase() != "hexadecimal to decimal" || str.toLowerCase() != "hexadecimal to binary"
                || str.toLowerCase() != "hexadecimal to octal" || str.toLowerCase() != "add") {
            x = Double.valueOf(num);
        }
        switch (str.toLowerCase()) {
            case "decimal to binary":
                System.out.println(d1.binaryNumber(x));
                break;
            case "decimal to octal":
                System.out.println(d1.octalNumber(x));
                break;
            case "decimal to hexadecimal":
                System.out.println(d1.hexadecimalNumber(x));
                break;
            case "binary to decimal":
                System.out.println(d2.decimalNumberBin(x));
                break;
            case "binary to octal":
                System.out.println(d2.octalNumber(x));
                break;
            case "binary to hexadecimal":
                System.out.println(d2.hexadecimalNumber(x));
                break;
            case "octal to decimal":
                System.out.println(d3.decimalNumberOct(x));
                break;
            case "octal to binary":
                System.out.println(d3.binaryNumber(x));
                break;
            case "octal to hexadecimal":
                System.out.println(d3.hexadecimalNumber(x));
                break;
            case "hexadecimal to decimal":
                System.out.println(d4.decimalNumberHex(num));
                break;
            case "hexadecimal to binary":
                System.out.println(d4.binaryNumber(num));
                break;
            case "hexadecimal to octal":
                System.out.println(d4.octalNumber(num));
                break;
            case "add":
                System.out.println(Decimal.Add(num));
        }
    }
}
