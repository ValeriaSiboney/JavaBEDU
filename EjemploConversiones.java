public class EjemploConversiones {
    public static void main(String[] args) {
        int edad = 25;
        double salario = 18499.50;
        boolean activo = true;
        char inicial = 'V';
        var ciudad = "Querétaro";

        // Imprimir los valores almacenados en las variables
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
        System.out.println("Activo: " + activo);
        System.out.println("Inicial: " + inicial);
        System.out.println("Ciudad: " + ciudad);

        // Conversiónes
        int salarioRedondeado = (int) salario;
        System.out.println("Salario bruto: " + salario);
        System.out.println("Salario redondeado: " + salarioRedondeado);
    }
}