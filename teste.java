import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class teste {
    /**
     * @return
     */
    public Connection Conexao(){
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

}
