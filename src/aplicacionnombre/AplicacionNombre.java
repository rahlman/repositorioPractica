package aplicacionnombre;

import java.io.IOException;

/**
 *
 * @author dam125
 */
public class AplicacionNombre {

   public static void main(String[] args) throws IOException {
       
       //primeira parte sin clase nombre
//       
        String nombre, ape1, ape2;
//        char c;
//       
//       System.out.println("Introduzca nombre");
//       nombre = Input.leerCadena();
//       
//       for (int i = 0; i < nombre.length(); i++) {
//           if (Character.isLetter(nombre.charAt(0))) {
//           }else{
//               System.out.println("No todo son letras");
//           }
//       }
//       
//       System.out.println("Introduzca primer apellido");
//       ape1 = Input.leerCadena();
//       
//       for (int i = 0; i < ape1.length(); i++) {
//           if (Character.isLetter(ape1.charAt(0))) {
//               
//           }
//       }
//       
//       System.out.println("Introduzca segundo apellido");
//       ape2 = Input.leerCadena();
//       
//       for (int i = 0; i < ape2.length(); i++) {
//           if (Character.isLetter(ape2.charAt(0))) {
//           }
//       }
//       
//       if (nombre.isEmpty() || ape1.isEmpty() || ape2.isEmpty()) {
//           System.out.println("Nombre o apellidos vacíos");
//       }
//       
//       
//       System.out.println("Nombre: "+nombre+" "+ape1+" "+ape2);
//       
//       nombre = nombre.toUpperCase();
//       
//       ape1 = ape1.toUpperCase();
//       
//       ape2 = ape2.toUpperCase();
//       
//       System.out.println("Iniciales: "+nombre.charAt(0)+"."+ape1.charAt(0)+"."+ape2.charAt(0)+".");
//       
//       nombre = nombre.charAt(0)+nombre.substring(1,nombre.length()).toLowerCase();
//       
//       ape1 = ape1.charAt(0)+ape1.substring(1,ape1.length()).toLowerCase();
//       
//       ape2 = ape2.charAt(0)+ape2.substring(1,ape2.length()).toLowerCase();
//       
//       System.out.println("Nombre con inciales en mayúscula: "+nombre+" "+ape1+" "+ape2);

        
        
        
        
        

        //segunda parte con clase nombre
       
       
       
       try {
       
       System.out.println("Nombre");
       nombre=Input.leerCadena();
       System.out.println("Apellido1");
       ape1=Input.leerCadena();
       System.out.println("Apellido2");
       ape2=Input.leerCadena();
       
       Nombre persona1=new Nombre(nombre, ape1, ape2);
       
       System.out.println("Nombre y apellidos: "+ persona1.nombreYApellidos());
       
       System.out.println("Iniciales: "+ persona1.inicialesNombre());
       
       System.out.println("Nombre en minusculas e iniciales mayusculas: " + persona1.nombreMinusculas());
       
       } catch (ErrorNombresVaciosException e) {
           
           System.out.println(e.getMessage());
       
       } catch (ErrorNombreNoLetrasException e) {
       
           System.out.println(e.getMessage());
           
       } catch (ErrorApe1NoLetrasException e) {
       
           System.out.println(e.getMessage());
       
       } catch (ErrorApe2NoLetrasException e) {
       
           System.out.println(e.getMessage());
       
       } catch (Exception e) {
           
           System.out.println(e.getMessage());
           
       }
       
        
       
    }
    
}
