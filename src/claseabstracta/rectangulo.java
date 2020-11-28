package claseabstracta;

public class rectangulo extends Figura {

    private double base;
    private double altura;

    public rectangulo(double base, double altura, String tipo) {
        super(tipo);
        if (altura < 0.0) {//verifica que el lado sea menor a 0 
            throw new IllegalArgumentException("El dato ingresado no puede ser negativo");//mensaje de la excepcion si es menor a 0
        }
        this.altura = altura;
        if (base < 0.0) {//verifica que la base sea menor a 0 
            throw new IllegalArgumentException("El dato ingresado no puede ser negativo");//mensaje de la excepcion si es menor a 0
        }
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

}
