package number.system;

public class Binary extends Decimal {

    // convert binaryNumber to decimalNumber
    public String decimalNumberBin(double d) {
        m = "";
        c = 0;
        i = 0;
        long z=(long)d;
        while (z != 0) {
            //11001 ------- 25
            c += ((z % 10) * (Math.pow(2, i)));
            z /= 10;
            i++;
        }
        i=-1;
        m += d;
        if ((long)d!=d) {
            f = m.indexOf('.') + 1;
            f = m.length() - f;
            f = -f;
            double a = d - (long) d;
            while (i >= f) {
                //11001 ------- 25
                a *= 10;
                c += (long) a * ((Math.pow(2, i)));
                i--;
                a -= (long) a;
            }
        }
        m = "";
        m += c;
        return m;
    }

    @Override
    public String octalNumber(double d) {
        //String n="";
        m = "";
        m = decimalNumberBin(d);
        m = super.octalNumber(Double.valueOf(m));
        return m;
    }

    @Override
    public String hexadecimalNumber(double d) {
        m = "";
        m += d;
        m = decimalNumberBin(d);
        m = super.hexadecimalNumber(Double.valueOf(m));
        return m;
    }
}
