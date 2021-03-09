
# backup
_____________________________________________________________________________

_Modificadores de acesso:_

**public:** Uma declaração com modificador public pode ser acessada de qualquer lugar e por qualquer entidade
que possa visualizar a classe a que ela pertence. <br/> 

**private:** Uma declaração com modificador private não pode ser acessada ou usada por nenhuma outra classe. 
Não se aplica às classes, somente para seus métodos e atributos. Esses atributos não podem ser visualizados pelas classes herdadas. <br/> 

**protected:** Torna o membro acessível às classes do mesmo pacote ou através de herança, seus membros herdados não são acessíveis a outras classes fora 
do pacote em que foram declarados. <br/> 

**default:** São acessíveis somente por classes do mesmo pacote, na sua declaração não é definido nenhum tipo 
de modificador, sendo este identificado pelo compilador. <br/> 

**final:** Quando aplicado na classe, não permite estende-la, nos métodos impede que seja sobrescrito na subclasse, 
e nos valores de variáveis não pode ser alterado depois que já tenha sido atribuído um valor. <br/> 

**abstract:** Não é aplicado nas variáveis, apenas nas classes. Uma classe abstrata não pode ser instanciada, 
logo, não pode ser chamada pelos seus construtores. <br/> 

**static:** É usado para a criação de uma variável que poderá ser acessada por todas as instâncias de objetos
dessa classe como uma variável comum, ou seja, a variável criada será a mesma em todas as instâncias, 
a modificação ocorre no acesso direto à classe. Por isso, é necessário instanciar um objeto para acessar 
o método. <br/> 


**Polimorfismo** <br/> 
 Os mesmos atributos e objetos podem ser utilizados em objetos distintos, mas com lógicas diferentes. 
 Técnica da qual escolhemos as funcionalidades utilizadas de forma dinâmica por um programa no decorrer 
 da sua execução.<br/> 
 
 **Herança**<br/> 
Quando criamos classes que herdam atributos e métodos de outras classes.<br/> 
 
 Palavra reservada para uso: **extends**
 
 **Interface**  <br/> 
 É um contrato que quando assumido por uma classe, deve ser implementado. <br/> 
 
 Palavra reservada para uso: **implements**
 
