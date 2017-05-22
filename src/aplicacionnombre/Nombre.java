package aplicacionnombre;

/**
 *
 * @author dam125
 */
public class Nombre {
    
    private String nombre, ape1, ape2;
    
    public Nombre(String nombre, String ape1,String ape2) throws ErrorNombresVaciosException, ErrorNombreNoLetrasException, ErrorApe1NoLetrasException, ErrorApe2NoLetrasException{
    
        if (comprobardatos(nombre,ape1,ape2)) {
            
            this.nombre=nombre;
            this.ape1=ape1;
            this.ape2=ape2;
            
        } else {
            System.out.println("Error de datos");
        }
    }
    
    private boolean comprobardatos(String nombre,String ape1, String ape2) throws ErrorNombresVaciosException, ErrorNombreNoLetrasException, ErrorApe1NoLetrasException, ErrorApe2NoLetrasException{
        boolean valido=true;
        if (nombre.isEmpty() || ape1.isEmpty() || ape2.isEmpty()) {
            throw new ErrorNombresVaciosException("Error, Nombre o Apellidos vacios");
//            System.out.println("No se pueden introducir nombres vacios");
//            valido = false;
        }else{
            valido = sonLetras(nombre,ape1,ape2);
        }
        
    
    return valido;
    }
    
    private boolean sonLetras(String nombre,String ape1, String ape2) throws ErrorNombreNoLetrasException, ErrorApe1NoLetrasException, ErrorApe2NoLetrasException{
        boolean valido=true;
        
        for (int i = 0; i < nombre.length(); i++) {
           if (!(Character.isLetter(nombre.charAt(0)))) {
               throw new ErrorNombreNoLetrasException("Error, el nombre debe estar formado solo por letras");
//               valido=false;
           }
           
        }
        
        for (int i = 0; i < ape1.length(); i++) {
           if (!(Character.isLetter(ape1.charAt(0)))) {
               throw new ErrorApe1NoLetrasException("Error, el primer apellido debe estar formado solo por letras");
//               valido=false;
           }
           
        }
        
        for (int i = 0; i < ape2.length(); i++) {
           if (!(Character.isLetter(ape2.charAt(0)))) {
                throw new ErrorApe2NoLetrasException("Error, el segundo apellido debe estar formado solo por letras");
//               valido=false;
           }
           
        }
        
    return valido;
    }
    
    public String nombreYApellidos(){
    
        String cadena= (this.nombre+this.ape1+this.ape2);
        
        return cadena;
        
    }
    
    public String inicialesNombre(){
        
        
       this.nombre=this.nombre.toUpperCase();
       
       this.ape1=this.ape1.toUpperCase();
       
       this.ape2=this.ape2.toUpperCase();
        
       String cadena= (Character.toString(this.nombre.charAt(0))+Character.toString(this.ape1.charAt(0))+Character.toString(this.ape2.charAt(0)));
        
       return cadena;
    
    }
    
    public String nombreMinusculas(){
    
       this.nombre=this.nombre.toUpperCase();
       
       this.ape1=this.ape1.toUpperCase();
       
       this.ape2=this.ape2.toUpperCase();
       
       this.nombre = this.nombre.charAt(0)+this.nombre.substring(1,this.nombre.length()).toLowerCase();
       
       this.ape1 = this.ape1.charAt(0)+this.ape1.substring(1,this.ape1.length()).toLowerCase();
       
       this.ape2 = this.ape2.charAt(0)+this.ape2.substring(1,this.ape2.length()).toLowerCase();
       
       String cadena= (this.nombre + this.ape1 + this.ape2);
       
        return cadena;
    
    }
    
    
    
    
}
