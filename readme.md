# Java Servlet - branch [servlet] 

Sobre o Tomcat: 
* Sabe gerar HTML 
* Entende o protocolo HTTP (Uma servlet deve 
estender a classe HttpServlet e sobrescrever um determinado
m�todo --- doPost, doGet, service)
* � um servidor web 
* A anota��o @WebServlet marca a classe como 
servlet e al�m disso, registra a URL. Substituindo
o mapeamento no web.xml. 

Servlet 
* � mapeado para uma URL 
* � um objeto 
* Pode ser chamado atrav�s do protocolo HTTP.

* Tomcat entende o protocolo HTTP e roda por padr�o
http://localhost:8080/gerenciador(Context root) 
* Um servlet � um objeto Java que podemos chamar
a partir de uma requisi��o HTTP 

