# DesafioClayton\nO Código está na branch master

Feito por Gustavo Provete e Ruan Vieira

Fornece um módulo para data binding utilizando observables
tambem vem com um exemplo de aplicação em MVP Passive View

Componentes:
  DataBinding
  exemples.login
  observable

para utilizar:
  1-crie uma classe modelo e uma classe viewer, ambas implementam a interface observer em observable
  2-crie uma classe presenter e herde a classe Presenter em DataBinding
  3-configure a opção de data binding na hora de instanciar a sua classe de presenter
  4-implemente o método update na classe viewer e implementer
