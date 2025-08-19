package edu.ifal

object Lista02 {
  /*Questão 01: Escreva um programa que imprima na tela todos os números entre 0 e 100.*/
  fun zeroACem() {
    println("0 a 100:")
    for (i in 0 .. 100) {
      println(i)
    }
  }

  /*Questão 02: Escreva um programa que imprima na tela os números pares entre 0 e 100.*/
  fun numerosParesZeroACem() {
    println("Números pares de 0 a 100:")
    for (i in 0 .. 100 step 2) {
      println(i)
    }
  }

  /*Questão 03: Escreva um programa que leia a altura de 10 pessoas e calcule a média das
  alturas informadas.*/
  fun calcularAlturaMedia() {
    var somaDasAlturas : Double = 0.0

    for (i in 1 .. 10) {
      println("Digite a $i ª altura: ")
      val altura = readln().toDouble()
      somaDasAlturas += altura
    }

    println("A altura média é: %.2fcm".format(somaDasAlturas / 10))
  }

  /*Questão 04: Escreva um programa que leia 10 números e determine qual o maior
  número digitado.*/
  fun maiorNumero() {
    var maiorNumero : Int = 0

    for (i in 1 .. 10) {
      println("Digite o $i º número inteiro: ")
      val numero = readln().toInt()
      if (numero > maiorNumero) {
        maiorNumero = numero
      }
    }

    println("O maior número digitado foi: $maiorNumero")
  }

  /*Questão 05: Escreva um programa que leia 10 números e determine qual o menor
  número digitado.*/
  fun menorNumero() {
    var menorNumero : Int = 0

    for (i in 1 .. 10) {
      println("Digite o $i º número inteiro: ")
      val numero = readln().toInt()
      if (numero < menorNumero) {
        menorNumero = numero
      }
    }

    println("O menor número digitado foi: $menorNumero")
  }

  /*Questão 06: Escreva um programa que leia um conjunto de idades e calcule a média. O
  programa deve ler valores até que o usuário digite -1.*/
  fun calcularIdadeMedia() {
    var i : Int = 0
    var j : Int = 0
    var somaDasIdades : Int = 0

    do {
      println("Digite a próxima idade ou -1 para sair: ")
      val idade : Int = readln().toInt()
      if (idade <= -1) {
        i = -1
      }
      else {
        somaDasIdades += idade
        j++
      }
    } while (i != -1)

    if (j > 0) {
      val media : Double = (somaDasIdades / j).toDouble()
      println("Idade média = %.2f anos".format(media))
    }
    else {
      println("Nenhuma idade digitada.")
    }
  }

  /*Questão 07: Escreva um programa que leia um conjunto de números e determine qual o
  maior e qual o menor número digitado. O programa deve ler valores até que o usuário
  digite -1.*/
  fun calcularMaiorMenorNumero() {
    var i : Int = 0
    var maiorNumero : Int = 0
    var menorNumero : Int = 0

    do {
      println("Digite o próximo número ou -1 para sair: ")
      val numero : Int = readln().toInt()
      if (numero == -1) {
        break
      }

      if (i == 0) {
        maiorNumero = numero; menorNumero = numero
        i++
      }
      else if (numero > maiorNumero) {
        maiorNumero = numero
        i++
      }
      else if (numero < menorNumero) {
        menorNumero = numero
        i++
      }
    } while (i != -1)

    println("Maior número: $maiorNumero. Menor número: $menorNumero")
  }

  /*Questão 08: Escreva um programa que leia um conjunto de números e determine
  quantos números pares foram digitados. O programa deve ler valores até que o usuário
  digite 0.*/
  fun numerosParesInterativo() {
    var i : Int = 1
    var contagemNumerosPares : Int = 0

    do {
      println("Digite o próximo número ou 0 para sair: ")
      val numero: Int = readln().toInt()
      if (numero == 0) {
        break
      }
      else if (numero % 2 == 0) {
        contagemNumerosPares++
      }
    } while (i != 0)

    println("$contagemNumerosPares números pares digitados.")
  }
}