
# Projetos utilizando conceitos de _herança_, _polimorfismo_, explorando conceitos de _protected_ interface e métodos abstratos. 

# JAR FILE(*J*ava *AR*chive) <br/> 
* Através de jars podemos facilitar o compatilhamento do nosso código entre equipes. <br/> 
A exportarmos um projeto, e selecionar a opção JAR FIle, desmarcamos os arquivos <br/> 
.classpath e .project. <br/>
* É necessário que a opção **"Export generated class files and resources"** esteja marcada. <br/> 
Em "Jar File", utilizando uma pasta de fácil acesso, no qual sertá gravado o arquivo jar que <br/> 
será criado. <br/> 

* Para testar o arquivo jar recém criado, crie um novo projeto java, feche os demais projetos para<br/> 
que seja mais fácil focar o novo projeto. <br/> 

* Esse jar precisa estar no class path. Clicando com o botão direito dentro da pasta libs, escolha<br/> 
a opção _add to build path_

# Maven <br/> 
* O Maven organiza os JARs(código compilado, código fonte e documentação) em um repositório central<br/> 
que é público.<br/> 


# java.lang.String 
* Todos os métodos funcionam nessa linha: devolvem uma nova String, respeitando o conceito <br/> 
de imutabilidade. Isso significa que, uma vez criado, não pode ser alterado, por isso qualquer <br/> 
alteração cria um novo objeto String. 
 
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

