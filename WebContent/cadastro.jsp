<%@page import="DAO.AlunoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de alunos</title>
    </head>
    <body>
        <script>
            function conf(id){
                var resp=confirm('Deseja remover o id '+id+'?');
                if(resp){
                    window.location.href=
                            "exec_excluir.jsp?id="+id;
                }
                       
            }
        </script>
        <table class="table">
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Idade</th>
                <th>Telefone</th>
                <th>Alterar</th>
                <th>Excluir</th>
            </tr>
            <%
                AlunoDAO dao= new AlunoDAO();
                ArrayList<Aluno> lista=dao.buscarTodos();
                for(int i=0;i<lista.size();i++){
                    out.print("<tr><td>");
                    out.print(lista.get(i).getId());
                    out.print("</td><td>");
                    out.print(lista.get(i).getNome());
                    out.print("</td><td>");
                    out.print(lista.get(i).getIdade());
                    out.print("</td><td>");
                    out.print(lista.get(i).getTelefone());
                    out.print("</td><td><a href='alterar.jsp?");
                    out.print("id="+lista.get(i).getId());
                    out.print("&nome="+lista.get(i).getNome());
                    out.print("&idade="+lista.get(i).getIdade());
                    out.print("&telefone="+lista.get(i).getTelefone());
                    out.print("'>Alterar</a>");
                    out.print("</td><td><a href='javascript:func()' ");
                    out.print("onclick='conf("+lista.get(i).getId()
                                +")'>Excluir</a>");
                    out.print("</td></tr>");
                }
            %>    
        </table>
        <a href="inserir.jsp"><button class="btn btn-success">Inserir</button></a>
    </body>
</html>