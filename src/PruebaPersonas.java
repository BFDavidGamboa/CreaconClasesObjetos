public class PruebaPersonas {
    public static void main(String[] args) {
        //Creacion de un objeto de tipo persona

        //Definicion de la variable de tipo persona
        Persona persona1;

        //Instanciando (creano) un objeto de la clase Persona
        persona1 = new Persona();

        //Accedemos al objeto persona, y llamamos al metodo desplegarNombres
        persona1.deployName();

        //Modificamos los valores de los atributos del objeto perosna
        persona1.name = "Juan";
        persona1.lastName = "Gamboa";

        //volvemos a imprimir los valores
        System.out.println("");
        persona1.deployName();

        //Creacion de un segundo objeto de tipo persona
        Persona persona2 = new Persona();
        persona2.name = "Karla";
        persona2.lastName = "Gomez";

        System.out.println("");
        persona2.deployName();

    }
}