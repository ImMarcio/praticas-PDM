
open class Funcionario(val nome: String, val idade: Int){
    init {
        println("Novo funcionário cadastrado! Bem-vindo ${this.nome} e seus ${this.idade} de experiência de vida")
    }

    fun apresentar(){
        println("Olá meu nome é ${this.nome} e tenho ${this.idade}")
    }
}

// Classe Gerente herda de Funcionario e adiciona a propriedade setor
class Gerente(nome: String, idade: Int, val setor: String) : Funcionario(nome, idade)

// Classe Desenvolvedor herda de Funcionario e adiciona a propriedade linguagem
class Desenvolvedor(nome: String, idade: Int, val linguagem: String) : Funcionario(nome, idade)

// Classe Analista herda de Funcionario e adiciona a propriedade area
class Analista(nome: String, idade: Int, val area: String) : Funcionario(nome, idade)

fun main() {
    val listaDeFuncionarios: MutableList<Funcionario> = mutableListOf<Funcionario>()
    val gerente = Gerente("Márcio",21,"Gerência")
    val desenvolvedor = Desenvolvedor("Caio",23, "Java")
    val analista = Analista("Allan", 19, "Desenvolvimento")
    listaDeFuncionarios.add(gerente)
    listaDeFuncionarios.add(desenvolvedor)
    listaDeFuncionarios.add(analista)
    listaDeFuncionarios.forEach { println(it.nome) }

    listaDeFuncionarios.forEach{
        if (it is Gerente){
            it.apresentar()
            println(it.setor)
        }
        if (it is Desenvolvedor){
            it.apresentar()
            println(it.linguagem)
        }
        if (it is Analista){
            it.apresentar()
            println(it.area)
        }
    }

}