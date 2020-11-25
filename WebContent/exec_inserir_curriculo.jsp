<%@page import="DAO.AlunoDAO"%>
<%@page import="DAO.CurriculoDAO"%>
<%@page import="model.Aluno"%>
<%@page import="model.Curriculo"%>
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
            	
            	Curriculo c = new Curriculo();
            	CurriculoDAO cDao = new CurriculoDAO();
            	
            	if(request.getParameter("nome").equals("")){
                    response.sendRedirect("cadastro.jsp");
                }else{
                	c.setNome(request.getParameter("nome"));
                	c.setDataNascimento(request.getParameter("dataNascimento"));
                	c.setEmail(request.getParameter("email"));
                	c.setTelefone(request.getParameter("telefone"));
                	c.setLinguagens(request.getParameter("linguagens"));
                	c.setDiferenciais(request.getParameter("diferenciais"));
                	c.setLinkGit(request.getParameter("linkGit"));
                	c.setExperiencia(request.getParameter("experiencia"));
                	
                    cDao.inserir(c);
                    
                    response.sendRedirect("cadastro2.jsp");
                }
            }catch(Exception e){
                out.print("Erro ao inserir!" + e.getMessage());
            }
        %>
    </body>
</html>