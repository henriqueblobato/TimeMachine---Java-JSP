package DAO;
import util.Conexao;
import model.Curriculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CurriculoDAO {
    private final Connection conn;
    public CurriculoDAO(){
       conn=new Conexao().retornaConexao();
    }
    public void inserir(Curriculo a){
        PreparedStatement stmt;
        try{
            stmt = conn.prepareStatement(
              "insert into curriculos(nome,dataNascimento,email,telefone) values(?,?,?,?)");
            stmt.setString(1,a.getNome());
            stmt.setString(2,a.getDataNascimento());
            stmt.setString(3,a.getEmail());
            stmt.setString(4,a.getTelefone());
            stmt.execute();
            stmt.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void alterar(Curriculo a){
        PreparedStatement stmt;
        try{
            stmt=conn.prepareStatement(
              "update curriculos set nome=? dataNascimento=? email=? telefone=? where id=?");
            stmt.setString(1,a.getNome());
            stmt.setString(2,a.getDataNascimento());
            stmt.setString(3,a.getEmail());
            stmt.setString(4,a.getTelefone());
            stmt.setInt(5,a.getId());
            stmt.execute();
            stmt.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void excluir(Curriculo a){
        PreparedStatement stmt;
        try{
            stmt=conn.prepareStatement("delete from curriculos where id=?");
            stmt.setInt(1,a.getId());
            stmt.execute();
            stmt.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public ArrayList<Curriculo> buscarTodos(){
        ArrayList<Curriculo> lista = new ArrayList<>();
        ResultSet rs;
        Statement st;
        try{
           st = conn.createStatement();
           rs = st.executeQuery("select * from curriculos");
           while(rs.next()){
        	   Curriculo a = new Curriculo();
               a.setId(rs.getInt("id"));
               a.setNome(rs.getString("nome"));
               a.setDataNascimento(rs.getString("dataNascimento"));
               a.setEmail(rs.getString("email"));
               a.setTelefone(rs.getString("telefone"));
               
               lista.add(a);
           }
        }catch(Exception e){
           System.out.println(e.getMessage());
        }
        return lista;
    }
    public Curriculo buscarId(Curriculo a){
        ResultSet rs;
        Statement st;
        try{
           st = conn.createStatement();
           rs = st.executeQuery("select * from curriculos where id=" + a.getId());
           rs.next();
           a.setId(rs.getInt("id"));
           a.setNome(rs.getString("nome"));
           a.setDataNascimento(rs.getString("dataNascimento"));
           a.setEmail(rs.getString("email"));
           a.setTelefone(rs.getString("telefone"));
        }catch(Exception e){
           System.out.println(e.getMessage());
        }
        return a;
    }
}