class Aluno( var nome: String, private var sobrenome: String){
    private var ra = 0
    var nota = 0.0
    private var ano = 0
    private val aprovado : Boolean
        get(){
            return nota >= 60
        }
    constructor(nome: String, sobrenome: String, ra: Int) :
            this(nome, sobrenome){
        this.ra = ra
    }

    constructor(nome: String, sobrenome: String, ra: Int, nota: Double, ano: Int):
            this(nome, sobrenome, ra){
        this.nota = nota
        this.ano = ano
    }

    fun nomeCompleto(){
        println("Nome completo do aluno: $nome $sobrenome")
    }

    fun passouAno(){
        if (aprovado){
            ano += 1
            println("Parabéns, você passou de ano")
        }else{
            println("Infelizmente você não passou de ano")
        }

    }
    fun infAluno(){
        println("Nome: $nome $sobrenome")
        println("Ra: $ra")
        println("Nota: $nota")
        println("Ano: $ano")
        println("Foi aprovado: $aprovado")
    }
}
