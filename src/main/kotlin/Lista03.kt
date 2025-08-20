package edu.ifal

object Lista03 {
  /*Questão 01: Escreva um programa que leia 10 números e armazene em um vetor. Em
  seguida, mostre a soma desses números.*/
  fun vetorNumerosSoma() {
    val vetorNumeros = IntArray(10)

    for (i in 0 .. 9) {
      println("Digite o ${i + 1}º número inteiro: ")
      val numero : Int = readln().toInt()
      vetorNumeros[i] = numero
    }

    println("A soma dos números do vetor é: ${vetorNumeros.sum()}")
  }

  /*Questão 02: Escreva um programa que leia 10 números e armazene em um vetor. Em
  seguida, mostre as seguintes informações:
  a) Menor valor digitado
  b) Maior valor digitado
  c) Média dos valores digitados*/
  fun vetorNumerosMaiorMenorMedia() {
    val vetorNumeros = IntArray(10)

    for (i in 0 .. 9) {
      println("Digite o ${i + 1}º número inteiro: ")
      val numero : Int = readln().toInt()
      vetorNumeros[i] = numero
    }

    println("Menor número: ${vetorNumeros.min()}, maior: ${vetorNumeros.max()}, média: ${vetorNumeros.sum() / 10}")
  }

  /*Questão 03: Leia as notas de 10 alunos e armazene em um vetor. Em seguida, mostre
  na tela quantos estudantes foram aprovados e quantos foram reprovados. Além disso,
  mostre a média calculada a partir das notas informadas. Obs.: Para ser considerado
  aprovado, o estudante deve ter nota maior ou igual a 6,0.*/
  fun vetorAlunosAprovadosReprovadosMedia() {
    val vetorNotas = DoubleArray(10)
    var aprovados : Int = 0
    var reprovados : Int = 0

    for (i in 0 .. 9) {
      println("Digite a ${i + 1}ª nota: ")
      val nota : Double = readln().toDouble()
      vetorNotas[i] = nota

      if (nota >= 6) {
        aprovados++
      }
      else {
        reprovados++
      }
    }

    println("Aprovados: $aprovados alunos.\nReprovados: $reprovados alunos.\nMédia das notas: %.2f".format(vetorNotas.sum() / 10))
  }

  /*Questão 04: Escreva um programa que leia 10 números e, em seguida, mostre-os na
  ordem inversa.*/
  fun inverterVetor() {
    val vetorNumeros = IntArray(10)

    for (i in 0 .. 9) {
      println("Digite o ${i + 1}º número inteiro: ")
      val numero : Int = readln().toInt()
      vetorNumeros[i] = numero
    }

    val vetorNumerosReverso = vetorNumeros.reversed()

    for (j in 0 .. 9) {
      println(vetorNumerosReverso[j])
    }
  }

  /*Questão 05: Escreva um programa que leia dois vetores de 05 elementos cada. Após ler
  todos os elementos, verifique se os vetores são iguais e mostre essa informação na tela.*/
  fun compararVetores() {
    val vetor1 = Array(5) {""}
    val vetor2 = Array(5) {""}

    for (i in 0 .. 4) {
      println("Vetor1 - Digite a ${i + 1}ª palavra: ")
      val palavra : String = readln()
      vetor1[i] = palavra
    }

    for (i in 0 .. 4) {
      println("Vetor2 - Digite a ${i + 1}ª palavra: ")
      val palavra : String = readln()
      vetor2[i] = palavra
    }

    if (vetor1.contentEquals(vetor2)) {
      println("Os vetores são iguais.")
    }
    else {
      println("Os vetores são diferentes.")
    }
  }

  /*Questão 06: Escreva um programa que leia o nome de X pessoas. Em seguida, pergunte
  ao usuário o nome que ele deseja consultar e verifique se este nome consta na lista.
  Obs.: O número de pessoas deve ser determinado pelo usuário.*/
  fun consultarListaDePessoas() {
    val nomesPessoas = mutableListOf<String>()

    println("ADICIONANDO PESSOAS À LISTA DE NOMES")
    do {
      println("\nDigite um nome ou s para sair: ")
      val nome : String = readln()
      if (nome.lowercase() != "s") {
        nomesPessoas.add(nome)
      }
    } while (nome.lowercase() != "s")

    println("\nCONSULTANDO NOMES NA LISTA")
    do {
      println("\nDigite um nome ou s para sair: ")
      val nome : String = readln()

      if (nomesPessoas.contains(nome)) {
          println("$nome foi encontrado na lista!")
        }
        else {
          println("Nome não encontrado na lista.")
        }
    } while (nome.lowercase() != "s")
  }
}