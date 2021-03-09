
# backup
_____________________________________________________________________________

**Modificadores de acesso:**

**public:** Uma declaração com modificador public pode ser <br/> 
acessada de qualquer lugar e por qualquer entidade <br/> 
que possa visualizar a classe a que ela pertence. <br/> 

**private:** Uma declaração com modificador private não pode ser<br/> 
acessada ou usada por nenhuma outra classe. <br/> 
Não se aplica às classes, somente para seus métodos e atributos. <br/> 
Esses atributos não podem ser visualizados pelas classes herdadas. <br/> 

**protected:** Torna o membro acessível às classes do mesmo pacote ou através de herança, <br/> 
seus membros herdados não são acessíveis a outras classes fora do pacote em que foram declarados. <br/> 

**default:** São acessíveis somente por classes do mesmo pacote, na sua <br/> 
declaração não é definido nenhum tipo <br/> 
de modificador, sendo este identificado pelo compilador. <br/> 

**final:** Quando aplicado na classe, não permite estende-la, <br/> 
nos métodos impede que seja sobrescrito na subclasse, <br /> 
e nos valores de variáveis não pode ser alterado depois que já tenha sido atribuído um valor. <br/> 

**abstract:** Não é aplicado nas variáveis, apenas nas classes. Uma classe abstrata não pode ser instanciada, 
logo, não pode ser chamada pelos seus construtores. <br/> 

**static:** É usado para a criação de uma variável que poderá ser acessada por todas as instâncias de objetos <br/> 
dessa classe como uma variável comum, ou seja, a variável criada será a mesma em todas as instâncias, <br/> 
a modificação ocorre no acesso direto à classe. Por isso, é necessário instanciar um objeto para acessar <br/> 
o método. <br/> 


**Polimorfismo** <br/> 
 Os mesmos atributos e objetos podem ser utilizados em objetos distintos, mas com lógicas diferentes. <br/> 
 Técnica da qual escolhemos as funcionalidades utilizadas de forma dinâmica por um programa no decorrer <br/> 
 da sua execução.<br/> 
 
 **Herança**<br/> 
Quando criamos classes que herdam atributos e métodos de outras classes.<br/> 
 
 Palavra reservada para uso: **extends**
 
 **Interface**  <br/> 
 É um contrato que quando assumido por uma classe, deve ser implementado. <br/> 
 
 Palavra reservada para uso: **implements**
 
