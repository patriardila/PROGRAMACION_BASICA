public class Nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // la variable Scanner permite interprtar lo que el usuario ingresa
        var scanner = new Scanner(System.in);
        // permite mostrar informacion en la consola
        System.out.println("Dame tu nombre: ");
        // La variable n guarda la informacion que el usuario ingreso y scnner.nextLine pasa esa informacion a String
        var n = scanner.nextLine();
        System.out.println("El nombre del jugador es: "+n );
        
        
    }
    
}
