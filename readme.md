# Java Servlet - branch [servlet] 

Sobre o Tomcat: 
* Sabe gerar HTML 
* Entende o protocolo HTTP (Uma servlet deve 
estender a classe HttpServlet e sobrescrever um determinado
método --- doPost, doGet, service)
* É um servidor web 
* A anotação @WebServlet marca a classe como 
servlet e além disso, registra a URL. Substituindo
o mapeamento no web.xml. 

Servlet 
* É mapeado para uma URL 
* É um objeto 
* Pode ser chamado através do protocolo HTTP.

* Tomcat entende o protocolo HTTP e roda por padrão
http://localhost:8080/gerenciador(Context root) 
* Um servlet é um objeto Java que podemos chamar
a partir de uma requisição HTTP 

