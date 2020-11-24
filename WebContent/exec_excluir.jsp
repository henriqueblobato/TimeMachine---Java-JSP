<%@page import="DAO.AlunoDAO"%>
<%@page import="model.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try{
                Aluno a = new Aluno();
                AlunoDAO dao=new AlunoDAO();
                if(request.getParameter("id").equals("")){
                    response.sendRedirect("cadastro.jsp");
                }else{
                    a.setId(Integer.parseInt(
                            request.getParameter("id")));
                    dao.excluir(a);
                    response.sendRedirect("cadastro.jsp");
                }
            }catch(Exception e){
                out.print("Erro ao inserir!");
            }
        %>
    </body>
</html>
