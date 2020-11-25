<%@page import="DAO.AlunoDAO"%>
<%@page import="model.Aluno"%>
<%@page import="DAO.CurriculoDAO"%>
<%@page import="model.Curriculo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ALTERAR</title>
    </head>
    <body>
        <%
            try{
                if(request.getParameter("id").equals("")){
                    response.sendRedirect("cadastro.jsp");
                }else{
	                Curriculo a = new Curriculo();
	                CurriculoDAO dao = new CurriculoDAO();
                	// id,nome,dataNascimento,email,telefone,linguagens,diferenciais,linkGit,experiencia
                    a.setId(Integer.parseInt(request.getParameter("id")));
                    a.setNome(request.getParameter("nome"));
                    a.setDataNascimento(request.getParameter("dataNascimento"));
                    a.setEmail(request.getParameter("email"));
                    
                    dao.alterar(a);
                    response.sendRedirect("cadastro.jsp");
                }
            }catch(Exception e){
                out.print("Erro ao inserir!");
            }
        %>
    </body>
</html>