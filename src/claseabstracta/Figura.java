package claseabstracta;

public abstract class Figura {

    private String tipo;
    private int n;

    public Figura(String tipo) {
        if (tipo.isEmpty()){//verifica si es un espacio en blanco
            throw new IllegalArgumentException("No se puede insertar un espacio en blanco");//mensaje de la excepcion si el tipo esta en blanco 
        }
        
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract double area();
    
    public abstract double perimetro();
        
    

}
