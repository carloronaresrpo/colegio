

package Co.Edu.Semillero.Colegiouipux.validacion;


public class LoginValidacion {
    
    public boolean login(String usuario, String clave) {
        
        if (usuario.equals("")){
            System.out.println ("no ingreso usuario");
            return false; 
      
    }
       if (clave.equals("")){
            System.out.println("no ingreso clave");
            return false; 
       }
       return true; 
    }
       
}
