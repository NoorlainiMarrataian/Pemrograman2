package praktikum5.soal1;
/**
 *
 * @author ThinkPad L450 i5
 */
public class Paint {
    private double coverage;
    public Paint(double c){
        coverage = c;
    }
    public double amount(Shape s){
        System.out.println ("Computing amount for " + s);
        return s.area() / coverage;
    }
}
