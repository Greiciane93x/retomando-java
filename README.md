# Java 5 (Tiger) de 2004 <br/> 
Trouxe grandes funcionalidades usadas até hoje na linguagem: <br/> 
* Anotações <br/>  
* Generics <br/> 
* ForEach <br/> 
* Autoboxing <br/> 
* Melhorias para JVM, como 64 bits, multicore, e etc <br/> 

# Java 7 (Dolphin) <br/> 
* try with resources <br/> 
* Fork join e nova biblioteca de concorrência <br/> 
* E para JVM o G1, o garbage collector padrão <br/> 

# Java 8 de 2014 <br/> 
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

# JDK <br/> 
* É o kit de desenvolvimento Java responsável por compilar código-fonte(.java) em bytecode(.class) <br/> 
* Disponibiliza as ferramentas para o desenvolvimento dos programas java. <br/> 
* Contém um compilador, depurador e o próprio JRE para a execução dos programas. <br/> 

# JVM <br/> 
* É a máquina virtual do java responsável por executar o bytecode <br/> 
* É responsável por fornecer a capacidade de multi-plataforma <br/> 
* É capaz de interpretar e executar o programa compilado em formato bytecode em qualquer SO(windows, linux, mac, etc).<br/> 
# JRE <br/> 
* É o ambiente de execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar <br/> 
o seu código e para a JVM  executar o seu programa<br/> 
* Disponibiliza os requisitos mínimos para a execução de um programa java. <br/> 
* Contém uma JVM, os pacote básicos do Java(API core), exemplo disso é o pacote lang, citado logo abaixo. <br/> 
<hr> 
<img src="https://dicasdejava.com.br/images/jdk_jre_jvm.png" width="40%" /> 
<hr> 
# JAR FILE(Java ARchive) <br/> 
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
 
>> public class OlaMundo{ <br/> 
>> public static void main(String[] args){<br/> 
>> System.out.println("Olá mundo em Java"); <br/> 
>>   }<br/> 
>> } <br/> 
 
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
>> ArrayList<String> lista = new ArrayList<>(); <br/> 
>> lista.add("Ane");  <br/> 

**Lista com capacidade definida** <br/> 
 Um arrayList é um array dinâmico, ou seja, por "baixo dos panos" <br/> 
 é usado um array, mas sem se preocupar com as limitações <br/> 
 de um array normal; <br/> 
 Para criar uma lista com a quantidade de itens pré definidos, <br/> 
 basta fazer como na linha abaixo: <br/> 
 >> ArrayList lista = new ArrayList(*); <br/> 
 Onde (*) é a capacidade desejada do array. 
 
 
 <hr> 
 
>> ArrayList<Conta> lista = new ArrayList<Conta>(); <br/> 

>> Conta cc = new ContaCorrente(22,11); <br/> 
>> lista.add(cc); <br/> 

>> Conta cc2 = new ContaCorrente(22,22); <br/> 
>> lista.add(cc2); <br/> 

// outra referência <br/> 
>> Conta cc3 = new ContaCorrente(22, 22); <br/> 

// devolve true ou false <br/> 
>> boolean existe = lista.contains(cc3); <br/> 

>> System.out.println("Já existe?" + existe); <br/> 

>> for(Conta conta : lista){ <br/> 
 // == sempre compara as referências 	<br/> 
>> //if(conta == cc2){
>> //	System.out.println("Já tenho outra conta!"); <br/> 
>> //}	<br/> 
>> if(conta.ehIgual(cc3)){ <br/> 
>>  		System.out.println("Já tenho essa conta!"); 	<br/> 
>>}<br/> 
>>} <br/> 

>> public boolean ehIgual(Conta outra){<br/> 
>> if(this.agencia != outra.agencia){<br/> 
>>	return false; 	<br/> 
>>	}<br/> 
>>	if(this.numero != outra.numero){ <br/> 
>>	return false; 	<br/> 
>>}<br/> 
>>return true; <br/> 
>> } <br/> 
>> 


>> public static void main(String[] args){ <br/> 
	
>> Conta cc1 = new ContaCorrente(22, 11); <br/>  
>> Conta cc2 = new ContaCorrente(22, 22); <br/> 
>> boolean igual = cc1.ehIgual(cc2); <br/> 
>> System.out.println(igual); <br/> 

>> } <br/> 


>> @Override <br/> 
>> public boolean equals(Object ref){<br/> 
//cast de um referencia mais genérica para um mais específica <br/> 
>> 	Conta outra = (Conta) ref; <br/> 

>> if(this.agencia != outra.agencia){<br/> 
>>	return false; <br/> 
>>} <br/> 
	
>> if(this.numero != outra.numero){ <br/> 
>>	return false; <br/> 
>> } <br/> 
>> return true;  <br/> 
>> } <br/> 

# Equals <br/> 
* Devemos sobrescrever para definir o critério de igualdade  <br/> 
* A implementação padrão compara as referências <br/> 
* É definido na classe Object <br/> 

# ArrayList <br /> 
* Acesso fácil e performático pelo índice <br/> 
* elementos precisam ser copiados quando não há mais capacidade <br/> 

# LinkedList <br/> 
* Inserção e remoção performática em qualquer posição, também no início <br/> 
* Acesso mais demorado pelo índice, é preciso pesquisar os elementos
