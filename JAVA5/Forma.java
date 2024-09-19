public class Forma {
    private double area;
    private double perimetro;

    public Forma(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}
