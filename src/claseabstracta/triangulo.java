package claseabstracta;

public class triangulo extends Figura {

    private double lado1, lado2, lado3;

    public triangulo(double lado1, double lado2, double lado3, String tipo) {
        super(tipo);
        if (lado1 < 0.0||lado2<0.0||lado3<0.0) {//verifica que los 3 lados sean mayores a 0
            throw new IllegalArgumentException("El dato ingresado no puede ser negativo");//mensaje de la excepcion si los 3 lados son menor a 0
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double area() {
        return (lado1 * lado2) / 2;
    }

    @Override
    public double perimetro() {
        return (lado1+lado2+lado3);
    }
}
