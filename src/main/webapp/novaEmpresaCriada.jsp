<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <body>
        <c:if test= "${not empty empresa}">
            Empresa <b> ${ empresa } </b> cadastrada com sucesso!
        </c:if>
        
         <c:if test= "${empty empresa}">
            <b>Nenhuma </b> empresa cadastrada!
        </c:if>
        
        <br/><br/>
        
        
        <a href="/gerenciador/listaEmpresas">Lista das Empresas cadastradas no Sistema</a>
    </body>
</html>
