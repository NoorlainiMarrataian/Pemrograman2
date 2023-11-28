package praktikum5.soal1;
/**
 *
 * @author ThinkPad L450 i5
 */
public abstract class Shape {
    protected String shapeName;
    public Shape(String name) {
        shapeName = name;
    }
    protected abstract double area();
    public String toString() {
        return shapeName;
    }
}
