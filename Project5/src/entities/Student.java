package entities;

public class Student {
    public double n1;
    public double n2;
    public double n3;

    public double media() {
        return n1+n2+n3;
    }
    public String condicion(){
        if ((n1+n2+n3) < 60) {
            double missing = (60 - (n1 + n2 + n3));
            return "FAILED\nMISSING "+missing+" POINTS";
        }
        return "PASS";
    }
}
