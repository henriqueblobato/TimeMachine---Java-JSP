package DAO;
import util.Conexao;
import model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AlunoDAO {
    private final Connection conn;
    public AlunoDAO(){
       conn=new Conexao().retornaConexao();
    }
    public void inserir(Aluno a){
        PreparedStatement stmt;
        try{
            stmt=conn.prepareStatement(
              "insert into alunos(nome,idade,telefone) values(?,?,?)");
            stmt.setString(1,a.getNome());
            stmt.setInt(2,a.getIdade());
            stmt.setString(3,a.getTelefone());
            stmt.execute();
            stmt.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void alterar(Aluno a){
        PreparedStatement stmt;
        try{
            stmt=conn.prepareStatement(
              "update alunos set nome=?,idade=?,telefone=? where id=?");
            stmt.setString(1,a.getNome());
            stmt.setInt(2,a.getIdade());
            stmt.setString(3,a.getTelefone());
            stmt.setInt(4,a.getId());
            stmt.execute();
            stmt.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void excluir(Aluno a){
        PreparedStatement stmt;
        try{
            stmt=conn.prepareStatement("delete from alunos where id=?");
            stmt.setInt(1,a.getId());
            stmt.execute();
            stmt.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public ArrayList<Aluno> buscarTodos(){
        ArrayList<Aluno> lista = new ArrayList<>();
        ResultSet rs;
        Statement st;
        try{
           st=conn.createStatement();
           rs=st.executeQuery("select * from alunos");
           while(rs.next()){
               Aluno a = new Aluno();
               a.setId(rs.getInt("id"));
               a.setNome(rs.getString("nome"));
               a.setIdade(rs.getInt("idade"));
               a.setTelefone(rs.getString("telefone"));
               lista.add(a);
           }
        }catch(Exception e){
           System.out.println(e.getMessage());
        }
        return lista;
    }
    public Aluno buscarId(Aluno a){
        ResultSet rs;
        Statement st;
        try{
           st=conn.createStatement();
           rs=st.executeQuery("select * from alunos where id="+a.getId());
           rs.next();
           a.setId(rs.getInt("id"));
           a.setNome(rs.getString("nome"));
           a.setIdade(rs.getInt("idade"));
           a.setTelefone(rs.getString("telefone"));
        }catch(Exception e){
           System.out.println(e.getMessage());
        }
        return a;
    }
}