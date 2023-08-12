public class PruebaPersonas {
    public static void main(String[] args) {
        //Creacion de un objeto de tipo persona

        //Definicion de la variable de tipo persona
        Persona persona1;

        //Instanciando (creando) un objeto de la clase Persona
        persona1 = new Persona();


        // We define and instance and object Person and name it!
        //It means we create an object from this specific class and
        //Also we call it's method

        Persona persona3 = new Persona();

        //Llamamos el método enviando argumentos si se requieren
        //If methods return a value we can receive it given a type
        //In this case the object persona3 in its class can use get
        //age as a method an return an string value, which is
        //Declared at the start of the line

        // Type varName = object.method(    parameter  );
        String resultado = persona3.getAge("juan");
        persona3.deployName();



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