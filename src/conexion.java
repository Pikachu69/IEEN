
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo
 */
public class conexion {
    private static final String url = "jdbc:mysql://localhost:3306/inventario?"+"user=root&password=lalitro19";
    Statement stmt;
    Connection conectar;
    String fila[];
    ResultSet Datos,Datos1;
    
    public conexion() throws SQLException{
        conectar = null;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conectar = DriverManager.getConnection(url);
            stmt= conectar.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
    
    public void agregarProducto(String modelo, String Numeral, String Sub_cat, String Nombre, String Color, String Descripcion, 
                                String Fecha_compra, String No_Factura, String importe, String marca, String no_serie, 
                                String cantidad, String observaciones, String cantidad_min, String placa, String km, 
                                String motor, String km_max, int status, int clasificacion) throws SQLException{
        if(conectar != null){
            System.out.println("Se ha establecido la conexión a la base de datos "+ url);
            String query = "INSERT INTO productos VALUES('"+Numeral+ "','" +Sub_cat+"','"+Nombre+"','"+Descripcion+"','"+marca+
                    "','"+modelo+"','"+no_serie+"','"+Color+"','"+placa+"','"+motor+"','"+Fecha_compra+"','"+No_Factura+
                    "','"+importe+"','"+observaciones+"','"+cantidad+"','"+cantidad_min+"','"+km+"','"+km_max+"','"+status+
                    "','"+clasificacion+"')";
            stmt = conectar.createStatement();
            stmt.executeUpdate(query);
        }
        conectar = null;
    }
    
    
    
    public ResultSet primerCarga() throws SQLException{
        Datos1= stmt.executeQuery("select idproductos, concat(fol_clas,con_pro,subcat_pro) as clave, nom_pro, mar_pro, ser_pro, col_pro, pla_pro as placas, stock_pro from productos inner join clasificacion on productos.clasificacion_id_clas = clasificacion.id_clas;");
        return Datos1;
    }
    
    ResultSet ConsultarNuevoID() {
        try {
            Datos= stmt.executeQuery("select max(idproductos) as id, max(con_pro) as numeral from productos;");
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Datos;
    }

    public ResultSet Consultar1(String tabla, String campo,String valor){
        try {
            Datos= stmt.executeQuery("SELECT idproductos, concat(fol_clas,con_pro,subcat_pro) as clave, nom_pro, mar_pro, ser_pro, col_pro, pla_pro as placas, stock_pro from productos inner join clasificacion on productos.clasificacion_id_clas = clasificacion.id_clas WHERE "+campo+" LIKE '"+valor+"%'");//'R%'
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Datos;
    }
    
    ResultSet Consultar2(String tabla, String campo1, String campo2) {
        try {
            Datos= stmt.executeQuery("SELECT * FROM "+ tabla +" WHERE "+campo1+"='"+campo2+"'");
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Datos;
    }
    
    public void Eliminar(String tabla, String campo1,String campo2){
        try {            
            stmt.execute("DELETE FROM "+ tabla +" WHERE "+campo1+ "='"+campo2+"'");
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
