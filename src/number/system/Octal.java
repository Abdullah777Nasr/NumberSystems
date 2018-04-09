package number.system;

public class Octal extends Decimal {

    // convert octalNumber to decimalNumber
    public String decimalNumberOct(double d) {
        m = "";
        c = 0;
        i = 0;
        long z = (long) d;
        while (z != 0) {
            //11001 ------- 25
            c += ((z % 10) * (Math.pow(8, i)));
            z /= 10;
            i++;
        }
        if ((long) d != d) {
            i = -1;
            m += d;
            f = m.indexOf('.') + 1;
            f = m.length() - f;
            f = -f;
            double a = d - (long) d;
            while (i >= f) {
                //11001 ------- 25
                a *= 10;
                c += (long) a * ((Math.pow(8, i)));
                i--;
                a -= (long) a;
            }
        }
        m = "";
        m += c;
        return m;
    }

    @Override
    public String binaryNumber(double d) {
        m = "";
        m = decimalNumberOct(d);
        m = super.binaryNumber(Double.valueOf(m));
        return m;
    }

    @Override
    public String hexadecimalNumber(double d) {
        m = "";
        m += d;
        m = decimalNumberOct(d);
        m = super.hexadecimalNumber(Double.valueOf(m));
        return m;
    }
}
