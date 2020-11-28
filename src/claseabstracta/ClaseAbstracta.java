package claseabstracta;

import java.io.*;
import java.util.*;

public class ClaseAbstracta {

    static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int opcion;
        boolean salida = false;
        while (!salida) {
            try {//inicia el bloque try
                System.out.println("\t\t\t\t...::MENU::...\n1.-Areas\n2.-Perimetros\n3.-Salida");
                opcion = scan.nextInt();
                switch (opcion) {
                    case 1:
                        opcion1();
                        salida = true;
                        break;
                    case 2:
                        opcion2();
                        salida = true;
                        break;
                    case 3:
                        salida = true;
                        System.out.println("Programa finalizado");
                        break;
                    default:
                        System.out.println("opcion invalida ");
                }
            } catch (InputMismatchException e) {//se termina el bloque try y empieza el cacth para la excepcion 
                scan.nextLine();
                System.out.println("Tipo de dato invalido");
            }
        }
    }

    public static void opcion1() throws IOException {
        int opcion1, dato1, dato2;
        String tipo;
        boolean salida1 = false;
        salida1 = false;
        while (!salida1) {
            try {//inicia bloque try para el menu 
                System.out.println("\t\t\t...::Menu Areas::...\n1.-circulo\n2.-cuadrado\n3.-rectangulo\n4.-triangulo\n5.-salir");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1:
                        try {//inica bloque try para la opcion 1
                            System.out.print("Inserte el radio: ");
                            dato1 = scan.nextInt();
                            System.out.println("Inserte el tipo de figura que es");
                            tipo = entrada.readLine();
                            try {//inicia bloque try para verificar el tipo
                                tipo = tipo.replace(" ", "");
                                tipo = tipo.replace("\t", "");//se quitan las tabulaciones y espacios de la variable tipo
                                int n = Integer.parseInt(tipo);//se realiza un casting 
                                if (n == n) {//se compara la nueva variable para ver si es un numero
                                    System.out.println("el tipo de figura no puede ser un numero");//mensaje de error 
                                }
                            } catch (NumberFormatException exD) {//se captura la excepcion para el casting
                                circulo cir = new circulo(dato1, tipo);
                                VerDatos(cir);
                            }
                        } catch (InputMismatchException e) {//fin del bloque try y captura excepcion para cuando el dato no es un numero
                            System.out.println("El dato que inserto no es un numero");
                        } catch (IllegalArgumentException e1) {//se capura la excepcion para cuando el dato es negativo o el tipo esta en blanco
                            System.out.println(e1.getMessage());
                        }
                        salida1 = true;
                        break;
                    case 2:
                        try {//try para opcion 2
                            System.out.print("Inserte la medida de un lada:");
                            dato1 = scan.nextInt();
                            System.out.println("Inserte el tipo de figura que es");
                            tipo = entrada.readLine();
                            try {//try para el tipo de dato
                                tipo = tipo.replace(" ", "");
                                tipo = tipo.replace("\t", "");
                                int n = Integer.parseInt(tipo);
                                if (n == n) {
                                    System.out.println("el tipo de figura no puede ser un numero");
                                }
                            } catch (NumberFormatException e) {//excepcion para el try del tipo
                                cuadrado cu = new cuadrado(dato1, tipo);
                                VerDatos(cu);
                            }
                        } catch (InputMismatchException e) {//excepcion cuando el se inserta una cadena en vez de un numero
                            System.out.println("El dato que inserto no es un numero");
                        } catch (IllegalArgumentException e1) {//excepcion propia para cuando es un numero negativo o el tipo es un espacio en blanco 
                            System.out.println(e1.getMessage());
                        }
                        salida1 = true;
                        break;
                    case 3:
                        try {//try opcion 3
                            System.out.print("Inserte la base: ");
                            dato1 = scan.nextInt();
                            System.out.print("Inserte la altura: ");
                            dato2 = scan.nextInt();
                            System.out.println("Inserte el tipo de figura que es");
                            tipo = entrada.readLine();
                            try {//try para el tipo 
                                tipo = tipo.replace(" ", "");
                                tipo = tipo.replace("\t", "");
                                int n = Integer.parseInt(tipo);
                                if (n == n) {
                                    System.out.println("el tipo de figura no puede ser un numero");
                                }
                            } catch (NumberFormatException e) {//captura de la Excepcion  para cuando no se permite el casting
                                rectangulo rec = new rectangulo(dato1, dato2, tipo);
                                VerDatos(rec);
                            }
                        } catch (InputMismatchException e) {//captura de Excepcionpara cuando es una letra en vez de un numero
                            System.out.println("El dato que inserto no es un numero");
                        } catch (IllegalArgumentException e1) {//captura de Excepcionpara propia
                            System.out.println(e1.getMessage());
                        }
                        salida1 = true;
                        break;
                    case 4:
                        try {
                            System.out.print("Inserte la base: ");
                            dato1 = scan.nextInt();
                            System.out.print("Inserte la altura: ");
                            dato2 = scan.nextInt();
                            System.out.println("Inserte el tipo de figura que es");
                            tipo = entrada.readLine();
                            try {//tri para verificar si el tipo no es un numero 
                                tipo = tipo.replace(" ", "");
                                tipo = tipo.replace("\t", "");
                                int n = Integer.parseInt(tipo);
                                if (n == n) {
                                    System.out.println("el tipo de figura no puede ser un numero");
                                }
                            } catch (NumberFormatException e) {
                                triangulo tri = new triangulo(dato1, dato2, 0, tipo);
                                VerDatos(tri);
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El dato que inserto no es un numero");
                        } catch (IllegalArgumentException e1) {
                            System.out.println(e1.getMessage());
                        }
                        salida1 = true;
                        break;
                    case 5:
                        salida1 = true;
                        System.out.println("Gracias por usar la opcion areas");
                        break;
                    default:
                        System.out.println("opcion invalida ");
                }
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Tipo de dato invalido");
            }

        }

    }

    public static void opcion2() throws IOException {
        int opcion1, dato1, dato2, dato3;
        boolean salida1 = false;
        String tipo;
        salida1 = false;
        while (!salida1) {
            try {//inicia bloque try para el menu 
                System.out.println("\t\t\t...::Menu Perimetros::...\n1.-circulo\n2.-cuadrado\n3.-rectangulo\n4.-triangulo\n5.-salir");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1:
                        try {//inica bloque try para la opcion 1
                            System.out.print("Inserte el radio: ");
                            dato1 = scan.nextInt();
                            System.out.println("Inserte el tipo de figura que es");
                            tipo = entrada.readLine();
                            try {//tri para verificar si el tipo no es un numero
                                tipo = tipo.replace(" ", "");
                                tipo = tipo.replace("\t", "");
                                int n = Integer.parseInt(tipo);
                                if (n == n) {
                                    System.out.println("el tipo de figura no puede ser un numero");
                                }
                            } catch (NumberFormatException e) {//se captura la excepcion para el casting
                                circulo cir = new circulo(dato1, tipo);
                                VerPerimetro(cir);
                            }
                        } catch (InputMismatchException e) {//fin del bloque try y captura excepcion para cuando el dato no es un numero
                            System.out.println("El dato que inserto no es un numero");
                        } catch (IllegalArgumentException e1) {//se capura la excepcion para cuando el dato es negativo o el tipo esta en blanco
                            System.out.println(e1.getMessage());
                        }
                        salida1 = true;
                        break;
                    case 2:
                        try {//inica bloque try para la opcion 2
                            System.out.print("Inserte la medida de un lada:");
                            dato1 = scan.nextInt();
                            System.out.println("Inserte el tipo de figura que es");
                            tipo = entrada.readLine();
                            try {//tri para verificar si el tipo no es un numero
                                tipo = tipo.replace(" ", "");
                                tipo = tipo.replace("\t", "");
                                int n = Integer.parseInt(tipo);
                                if (n == n) {
                                    System.out.println("el tipo de figura no puede ser un numero");
                                }
                            } catch (NumberFormatException e) {//se captura la excepcion para el casting
                                cuadrado cu = new cuadrado(dato1, tipo);
                                VerPerimetro(cu);
                            }
                        } catch (InputMismatchException e) {//fin del bloque try y captura excepcion para cuando el dato no es un numero
                            System.out.println("El dato que inserto no es un numero");
                        } catch (IllegalArgumentException e1) {//se capura la excepcion para cuando el dato es negativo o el tipo esta en blanco
                            System.out.println(e1.getMessage());
                        }
                        salida1 = true;
                        break;
                    case 3:
                        try {//inica bloque try para la opcion 3
                            System.out.print("Inserte la base: ");
                            dato1 = scan.nextInt();
                            System.out.print("Inserte la altura: ");
                            dato2 = scan.nextInt();
                            System.out.println("Inserte el tipo de figura que es");
                            tipo = entrada.readLine();
                            try {//tri para verificar si el tipo no es un numero
                                tipo = tipo.replace(" ", "");
                                tipo = tipo.replace("\t", "");
                                int n = Integer.parseInt(tipo);
                                if (n == n) {
                                    System.out.println("el tipo de figura no puede ser un numero");
                                }
                            } catch (NumberFormatException e) {//se captura la excepcion para el casting
                                rectangulo rec = new rectangulo(dato1, dato2, tipo);
                                VerPerimetro(rec);
                            }
                        } catch (InputMismatchException e) {//fin del bloque try y captura excepcion para cuando el dato no es un numero
                            System.out.println("El dato que inserto no es un numero");
                        } catch (IllegalArgumentException e1) {//se capura la excepcion para cuando el dato es negativo o el tipo esta en blanco
                            System.out.println(e1.getMessage());
                        }
                        salida1 = true;
                        break;
                    case 4:
                        try {//inica bloque try para la opcion 4
                            System.out.print("Inserte el primer lado: ");
                            dato1 = scan.nextInt();
                            System.out.print("Inserte el segundo lado: ");
                            dato2 = scan.nextInt();
                            System.out.print("Inserte el tercer lado: ");
                            dato3 = scan.nextInt();
                            System.out.println("Inserte el tipo de figura que es");
                            tipo = entrada.readLine();
                            try {//tri para verificar si el tipo no es un numero
                                tipo = tipo.replace(" ", "");
                                tipo = tipo.replace("\t", "");
                                int n = Integer.parseInt(tipo);
                                if (n == n) {
                                    System.out.println("el tipo de figura no puede ser un numero");
                                }
                            } catch (NumberFormatException e) {//se captura la excepcion para el casting
                                triangulo tri = new triangulo(dato1, dato2, dato3, tipo);
                                VerPerimetro(tri);
                            }
                        } catch (InputMismatchException e) {//fin del bloque try y captura excepcion para cuando el dato no es un numero
                            System.out.println("El dato que inserto no es un numero");
                        } catch (IllegalArgumentException e1) {//se capura la excepcion para cuando el dato es negativo o el tipo esta en blanco
                            System.out.println(e1.getMessage());
                        }
                        salida1 = true;
                        break;
                    case 5:
                        salida1 = true;
                        System.out.println("Gracias por usar la opcion Perimetro");
                        break;
                    default:
                        System.out.println("opcion invalida ");
                }
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Tipo de dato invalido");
            }
        }
    }

    private static void VerDatos(Figura fi) {
        System.out.println("es una figura: " + fi.getTipo());
        System.out.println("su area es: " + fi.area());
    }

    private static void VerPerimetro(Figura fi) {
        System.out.println("La figura es: " + fi.getTipo());
        System.out.println("El perimetro es: " + fi.perimetro());
    }
}
