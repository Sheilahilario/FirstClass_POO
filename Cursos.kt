package alunos

import Aluno
import java.time.temporal.TemporalQuery

class Cursos( private val nomeCurso: String, private var serie: Int, private var prof: String){

    private val listaEstudateMatricula = mutableListOf<Aluno?>()

    fun mostraEstudante(){
        for (i in listaEstudateMatricula){
            println(i?.nome)
        }
    }

    fun cadastrar(aluno: Aluno?){
        listaEstudateMatricula.add(aluno)
    }
    fun cadastrar(aluno: Array<Aluno?>?){
        if (aluno != null){
            for (i in aluno){
                listaEstudateMatricula.add(i)
            }
        }
        println("Alunos cadastrados com sucesso!")
    }


    fun remover(aluno: Aluno?){
        if (listaEstudateMatricula.contains(aluno)){
            listaEstudateMatricula.remove(aluno)
            println("O Aluno foi removido com sucesso!")
        }else{
            println("Esse aluno não existe na lista")
        }
    }


    fun contAluno(): Int{
        println("O número de Alunos casdastrados no curso é" +
                "${listaEstudateMatricula}")
        return 0
    }
    fun melhorNota(){
        var melhorNota: Double? = listaEstudateMatricula[0]?.nota
        for (i in listaEstudateMatricula){
            if (i?. nota!! > melhorNota!!){
                melhorNota = i.nota
            }
        }
        println("A maior nota do curso é $melhorNota")
    }
    fun verificaAluno(aluno: Aluno?){
        if(listaEstudateMatricula.contains(aluno)){
            println("Esse estudante existe")
        }else{
            throw Exception("O aluno não existe na lista")
        }
    }

}
