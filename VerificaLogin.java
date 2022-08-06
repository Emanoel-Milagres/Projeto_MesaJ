public boolean VerificaLogin(String email, String senha){

    Connection con = Conexao.getConnection(); 
    PreparedStatement stmt = null;
    ResultSet rs = null;
    boolean check = false;


    try {
        stmt = con.prepareStatement("SELECT * FROM cadastro_user WHERE email = ?, and senha = ?");
        stmt.setString(1, email);
        stmt.setString(2, senha);
        rs = stmt.executeQuery();

        if (rs.next()){

          check = false;

        }

    } catch (SQLException ex) {
        //Logger.getLogger(UserDAO.class.getEmail()).log(Level.SEVERE, null, ex);
    }finally{
        Conexao.closeConnection(con, stmt, rs);
    }        
    return check;

}