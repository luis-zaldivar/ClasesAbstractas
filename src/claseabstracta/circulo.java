package claseabstracta;
public class circulo extends Figura{
    private double radio;

    public circulo(double radio, String tipo)throws RuntimeException {
        super(tipo);
        if (radio < 0.0) {//compara para ver si el radio es menor a 0
            throw new IllegalArgumentException("El dato ingresado no puede ser negativo");//manda el manesaje de la excepcion propia
        }
        this.radio = radio;//si el radio es mayor a 0 se ejecuta normal 
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double area(){
        return Math.PI*radio*radio;
    }

    @Override
    public double perimetro() {
        return Math.PI*2*radio;
    }
}
