
/**
 *
 * @author Camilo Silva
 */

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmpleadoBD {
    
    private String url="jdbc:mysql://localhost:3306/";
    private String bd="inventario";
    private String user="root";
    private String password="";
    private String driver="com.mysql.cj.jdbc.Driver";
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    
    
    public EmpleadoBD () {
        
        try {
            
            Class.forName(driver);
            con=DriverManager.getConnection(url+bd, user, password );
            st=con.createStatement();
            
                    
        }catch(ClassNotFoundException | SQLException ex){
        }
    
    
    
    }
    
//      METODO CONSULTAR
            
     public void consultar (){
         try {
            
            String query="SELECT * FROM empleado";
            rs=st.executeQuery(query);
            while(rs.next()){
               int Cod_Empleado = rs.getInt("Cod_Empleado");
               String Nombre = rs.getString("Nombre");
               String Apellido = rs.getString("Apellido");
               int ID = rs.getInt("ID");
               System.out.println("-----------------\nCod_Empleado: "+ Cod_Empleado +"\nNombre: "+ Nombre + "\nApellido: "+ Apellido + "\nID: "+ ID);
            }
                
            rs.close();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
     
     }       
      
////      METODO INSERTAR
//     
     public void insertar (){
         try {
            
            String query="INSERT INTO empleado VALUES (2,'Julian', 'Ortega', '52361')";
            
            st.executeUpdate(query);
           
            
               System.out.println("-----------------\nEl empleado se ha ingresado correctamente ");
            
                    
        }catch(Exception ex){
            ex.printStackTrace();
        }
            
     }
     
     //      METODO ACTUALIZAR

         public void actualizar (){
            try {

               String query="UPDATE `empleado` SET `Nombre` = 'Sergio', `Apellido` = 'Moreno', `ID` = '62936' WHERE `empleado`.`Cod_Empleado` = 4";

               st.executeUpdate(query);
              
                  System.out.println("-----------------\nEl empleado se ha actualizado correctamente");
                 

           }catch(Exception ex){
               ex.printStackTrace();
           }
     
        } 
     
//      METODO ELIMINAR
       
       public void eliminar (){
            try {

               String query="DELETE FROM `empleado` WHERE `empleado`.`Cod_Empleado` = 5";
               
               
               st.executeUpdate(query);
                    
                    
                
                  System.out.println("-----------------\nEl empleado se ha eliminado correctamente");
                  
               
                          
                  
           }catch(Exception ex){
               ex.printStackTrace();
           }
     
        }   
         
       
       
}


