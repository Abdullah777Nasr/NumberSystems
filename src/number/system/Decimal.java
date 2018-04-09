package number.system;

public class Decimal {

    protected double f, c;
    protected int i;
    protected String m;

    public Decimal() {
        m = "";
        f = 1;
        i = 0;
        c = 0;
    }
    
    public static String Add(String num){
        int j=num.indexOf('+');
        String num1="",num2="";
        for(int i=0;i<num.length();i++){
            if(i<j)
                num1+=num.charAt(i);
            else if(i>j) 
                num2+=num.charAt(i);
        }
        
        return num;
    }
    
    // convert decimalNumber to binaryNumber
    public String binaryNumber(double d) {
        m = "";
        c = 0;
        f = 1;
        double b = d - (long) d;
        long z = (long) (d - b);
        while (z != 0) {
            //25 ------- 11001
            c += ((z % 2) * f);
            f *= 10;
            z /= 2;
        }
        f = 10;
        for (byte k = 1; k <= 7; k++) {
            b *= 2;
            z = (long) b;
            c += ((double) z / f);
            f *= 10;
            b -= z;
        }
        m += c;
        if (c == (long) c) {
            m = m.replace(".0", "");
        }
        return m;
    }

    // convert decimalNumber to octalNumber
    public String octalNumber(double d) {
        m = "";
        c = 0;
        f = 1;
        double b = d - (long) d;
        System.out.println(b);
        long z = (long) (d - b);
        while (z != 0) {
            //25 ------- 11001
            c += ((z % 8) * f);
            f *= 10;
            z /= 8;
        }
        f = 10;
        for (byte k = 1; k <= 7; k++) {
            b *= 8;
            z = (long) b;
            c += ((double) z / f);
            f *= 10;
            b -= z;
        }

        m += c;
        if (c == (long) c) {
            m = m.replaceAll(".0", "");
        }
        return m;
    }

    // convert decimalNumber to hexadecimalNumber
    public String hexadecimalNumber(double d) {
        String num1 = "",num="";
        m = ".";
        f = 1;
        double b = d - (long) d;
        long z = (long) (d - b);
        while (z != 0) {
            //25 ------- 19
            switch ((int) z % 16) {
                case 10:
                    num1 += 'A';
                    break;
                case 11:
                    num1 += 'B';
                    break;
                case 12:
                    num1 += 'C';
                    break;
                case 13:
                    num1 += 'D';
                    break;
                case 14:
                    num1 += 'E';
                    break;
                case 15:
                    num1 += 'F';
                    break;
                default:
                    num1 += (z%16);
                    break;
            }
            z /= 16;
        }
        for (byte k = 1; k <= 4; k++) {
            b *= 16;
            z = (long) b;
            switch ((int) z % 16) {
                case 10:
                    m += 'A';
                    break;
                case 11:
                    m += 'B';
                    break;
                case 12:
                    m += 'C';
                    break;
                case 13:
                    m += 'D';
                    break;
                case 14:
                    m += 'E';
                    break;
                case 15:
                    m += 'F';
                    break;
                default: {
                    m += z;
                    break;
                }
            }
        }
        for (i = num1.length() - 1; i >= 0; i--) {
            num +=num1.charAt(i);
        }
        num += m;
        return num;
    }
}
