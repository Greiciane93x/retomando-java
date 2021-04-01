Java 5 (Tiger) de 2004 <br/> 
- Trouxe grandes funcionalidades usadas até hoje na linguagem: <br/> 
* Anotações <br/>  
* Generics <br/> 
* ForEach <br/> 
* Autoboxing <br/> 
* Melhorias para JVM, como 64 bits, multicore, e etc <br/> 

Java 7 (Dolphin) <br/> 
* try with resources <br/> 
* Fork join e nova biblioteca de concorrência <br/> 
* E para JVM o G1, o garbage collector padrão <br/> 

Java 8 de 2014 <br/> 
* Lambda Expressions <br/> 
* Functional Interfaces <br/> 
* Method references <br/> 
* Default methods <br/> 
* Optionals <br/> 
* Datetime API <br/> 
* Streams API <br/> 

# Vantagens 
* Se conecta e integra com diversos sistemas e aplicações. <br/> 
* Totalmente gratuita 
* Por ser altamente integrada, permite diversos usos e complementações, o que garante alta performace <br/> 
* Pode ser utilizada na criação de aplicativos diversos, como por exemplo, smartphone e tablet <br/> 
* É excelente para sites que demandan alto índice de segurança e usabilidade

# Desvantagens 
* Carregamento é mais lento devido ao seu processamento numérico <br/> 
* É mais demorada a produção de aplicações e sistemas em java 
<img src="https://static.wixstatic.com/media/463745_45dbc046204341feb1fde53fcbf99fa2~mv2.gif" width="30%" />  


# JAR FILE(*J*ava *AR*chive) <br/> 
* Através de jars podemos facilitar o compatilhamento do nosso código entre equipes. <br/> 
* Ao exportarmos um projeto, e selecionar a opção JAR FIle, desmarcamos os arquivos .classpath e .project. <br/>
* É necessário que a opção _"Export generated class files and resources"_ esteja marcada. <br/> 
Em "Jar File", utilizando uma pasta de fácil acesso, no qual sertá gravado o arquivo jar que <br/> 
será criado. <br/> 

* Para testar o arquivo jar recém criado, crie um novo projeto java, feche os demais projetos para<br/> 
que seja mais fácil focar o novo projeto. <br/> 

* Esse jar precisa estar no class path. Clicando com o botão direito dentro da pasta libs, escolha<br/> 
a opção _add to build path_

# Maven <br/> 
* O Maven organiza os JARs(código compilado, código fonte e documentação) em um repositório central que é público.<br/> 

# java.lang.String 
* Todos os métodos funcionam nessa linha: devolvem uma nova String, respeitando o conceito de imutabilidade.<br/>
Isso significa que, uma vez criado, não pode ser alterado, por isso qualquer <br/> 
alteração cria um novo objeto String. <br/> 
 
Exemplos: <br/>  

>>String nome = "Alura" <br/> 
>>String outra = new String("Alura"); <br/> 
>>String outra = nome.toUpperCase(); <br/> 
>>System.out.println(nome); <br/> 
>>System.out.println(outra); <br/>  

# Cast <br/> 
* Transforma uma referência genérica em uma referência específica <br/> 

_Cast explícito e implícito de primitivos_ <br/> 
**Type Cast**  uma conversão de um tipo para outro. <br/> 

**CAST IMPLÍCITO** <br/> 
>>int numero = 3; <br/> 
>>double valor = numero <br/> 

**CAST EXPLÍCITO** <br/> 
>>int numero = 3; <br/> 
>>double valor = (double) numero; <br/> 

_Cast implícito e explícito de referências_ <br/> 
>> ContaCorrente cc1 = new ContaCorrente(22, 33); <br/> 
>> Conta conta = cc1; <br/> 
>> ContaCorrente cc1 = new ContaCorrente(22,33); <br/> 
>> Conta conta = (Conta) cc1; <br/> 

__ClassCast Exception__
* É do pacote java.lang <br/> 
* É lançada quando o type Cast falha. 

# Array do tipo Object <br/> 
* Pode guardar qualquer tipo de referência <br/> 
* Para converter uma referência genérica para uma mais específica usamos um type cast.  <br/> 
* para receber valores ao chamar o programa Java na linha de comando, podemos usar o array String[] no método main <br/> 


# Generics <br/> 
Entraram na versão 1.5 da plataforma Java e foram levemente melhorados no Java 1.7 <br/> 
Seus principais benefícios são: <br/> 
* O código mais legível, já que fica explícito o tipo dos elementos <br/> 
* Evita casts excessivos <br/> 
* Antecipa problemas de casts no momento da compilação <br/> 
Ex: <br/> 
>> ArrayList<String> lista = new ArrayList<>(); 
>> lista.add("Ane"); 

