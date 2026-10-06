public class Tiposdedatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var datos= new Scanner(System.in);
        System.out.println("Dame tu edad: ");
        var edad= datos.nextInt();
        
        System.out.println("Dame tu estatura: ");
        var estatura = datos.nextDouble();
        datos.nextLine();
        System.out.println("dame tu nombre:");
        var nombre = datos.nextLine();
        
        System.out.println("tu edad es "+edad
                
        );
        System.out.println("tu estarura es "+ estatura);
        System.out.println("Nombre del jugador es "+ nombre);
        
        
        
        
    }
 
