import alunos.Cursos

fun main(args: Array<String>) {



    val pedro = Aluno("Sheila", "Oliveira", 22557, 65.0, 7)
    val rafael = Aluno("Ana", "Julia", 224658, 80.0, 7)
    val maria = Aluno("Maria", "Sato", 22700, 50.0, 7)
    val gabriel = Aluno("João", "Carvalho", 22560, 89.0, 7)





    val cursoIngles = Cursos("Inglês",1, "Genivaldo")

    cursoIngles.cadastrar(pedro)
    cursoIngles.cadastrar(maria)

    cursoIngles.contAluno()



    val aluno: Array<Aluno?> = arrayOf(pedro, maria)

    cursoIngles.cadastrar(aluno)

    cursoIngles.contAluno()

    cursoIngles.melhorNota()



    try {
        cursoIngles.verificaAluno(gabriel)
        println("O Aluno foi removido com sucesso!")
    }catch (e: Exception){
        println(e.message)
    }







