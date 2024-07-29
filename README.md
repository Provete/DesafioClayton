# DesafioClayton<br/>O Código está na branch master

Feito por Gustavo Provete e Ruan Vieira
<br/><br/>
Fornece um módulo para data binding utilizando observables
tambem vem com um exemplo de aplicação em MVP Passive View
<br/><br/>
Componentes:
  DataBinding<br/>
  exemples.login<br/>
  observable<br/>

para utilizar:<br/>
  1-crie uma classe modelo e uma classe viewer, ambas implementam a interface observer em observable<br/>
  2-crie uma classe presenter e herde a classe Presenter em DataBinding<br/>
  3-configure a opção de data binding na hora de instanciar a sua classe de presenter<br/>
  4-implemente o método update na classe viewer e implementer<br/>
