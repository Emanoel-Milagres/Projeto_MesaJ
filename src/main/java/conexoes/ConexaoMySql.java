/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexoes;

/**
 *
 * @author emano
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.text.html.HTML.Tag.SELECT;

public class ConexaoMySql {
    private boolean status = false;
    private String mensagem = "";
    private Connection con = null;
    private Statement statement;
    private ResultSet resultSet;
    
    private String servidor = "localhost";
    private String nomeDoBanco = "dbmesaj";
    private String usuario = "root";
    private String senha = "";
    
    public ConexaoMySql(){}
    
    public ConexaoMySql(String pServidor, String pNomedoBanco, String pUsuario, String pSenha){
        this.servidor = pServidor;
        this.nomeDoBanco = pNomedoBanco;
        this.usuario = pUsuario;
        this.senha = pSenha;
    }
    //Inicia Conexão
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            String url = "jdbc:mysql://" + servidor + "/" + nomeDoBanco;
            this.setCon((Connection) DriverManager.getConnection(url, usuario, senha));

            this.status = true;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
        return this.getCon();
    }
    //Executa SQL
    public boolean executarSQL(String pSQL){
        try {
            this.setStatement(getCon().createStatement());

            this.setResultSet(getStatement().executeQuery(pSQL));
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }
    //Update e Delete
    public boolean executarUpdateDeleteSQL(String pSQL){
        try {
            this.setStatement(getCon().createStatement());

            getStatement().executeUpdate(pSQL);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }

    //Insert
    public int insertSQL(String pSQL){
        int status = 0;
        try {
            this.setStatement(getCon().createStatement());

            this.getStatement().executeUpdate(pSQL);

            this.setResultSet(this.getStatemnet().executeQuery("SELECT last_insert_id();"));

            while(this.ResultSet.next()){
                status = this.ResultSet.getInt(I);
            }

            return status;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return status;
        }
    }

    //fechar conexão
    public boolean fecharConexao(){
        try {
            if((this.getResultSet() != null) && (this.statement != null)){
                this.getResultSet().close();
                this.statment.close();
            }
            this.getCon().close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    private void setCon(Connection connection) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setStatement(Statement createStatement) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object getStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object getStatemnet() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void last_insert_id() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object getResultSet() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    private class ResultSet {

        public ResultSet() {
        }
    }

}