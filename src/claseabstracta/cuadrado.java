package claseabstracta;

public class cuadrado extends Figura{
    private double lado;
    
    public cuadrado(double lado, String tipo){
        super(tipo);
        if (lado < 0.0) {//verifica que el lado sea mayor a 0
            throw new IllegalArgumentException("El dato ingresado no puede ser negativo");//manda el mensaje de la excepcion propia 
        }
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    @Override
    public double perimetro() {
       return 4*lado;
    }

}
