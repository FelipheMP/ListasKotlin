package edu.ifal

import kotlin.math.max
import kotlin.math.min

// Um object em Kotlin já é um singleton (não precisa instanciar).
object Lista01 {
  /*Questão 01: Escreva um programa que calcule a idade do usuário. Para isso, o programa
  deve ler o ano de nascimento, o ano atual e depois mostrar na tela a idade. Obs.: O ano
  deve ser informado no formato AAAA (ex.: 1980).*/
  fun calcularIdade() {
    println("Digite o ano de nascimento: ")
    val anoNasc = readln().toInt()
    println("Digite o ano atual: ")
    val anoAtual = readln().toInt()

    println("${anoAtual - anoNasc} anos.")
  }

  /*Questão 02: Escreva um programa que leia um número e determine se ele é par ou
  ímpar.*/
  fun parOuImpar() {
    println("Digite um número inteiro: ")
    val numero = readln().toInt()

    if (numero % 2 == 0) {
      println("$numero é par!")
    }
    else {
      println("$numero é ímpar!")
    }
  }

  /*Questão 03: Escreva um programa que leia a altura de 03 pessoas e calcule a média.*/
  fun calcularAlturaMedia() {
    var somaDasAlturas = 0.0
    for (i in 1 .. 3) {
      println("Digite a $i ª altura: ")
      val altura = readln().toDouble()
      somaDasAlturas += altura
    }

    println("A altura média é %.2f".format(somaDasAlturas / 3))
  }

  /*Questão 04: Escreva um programa que leia 02 números e determine qual o maior
  número digitado.*/
  fun maiorNumero() {
    println("Digite um número inteiro: ")
    val numero1 = readln().toInt()
    println("Digite outro: ")
    val numero2 = readln().toInt()

    println("${max(numero1, numero2)} é maior que ${min(numero1, numero2)}")
  }

  /*Questão 05: Escreva um programa que leia a base e a altura de um retângulo e retorne a
  sua área (b * h) e o seu perímetro (2b + 2h).*/
  fun calcularAPRetangulo() {
    println("Digite a base do retângulo: ")
    val base = readln().toDouble()
    println("Digite a altura do retângulo: ")
    val altura = readln().toDouble()

    println("Área = %.2f".format(base * altura))
    println("Perímetro = %.2f".format((2 * base) + (2 * altura)))
  }

  /*Questão 06: Escreva um programa que receba o peso e a altura de uma pessoa e
  retorne o valor do IMC, o qual é calculado pela seguinte fórmula: IMC = peso / (altura * altura)*/
  fun calcularIMC() {
    println("Digite o peso: ")
    val peso = readln().toDouble()
    println("Digite a altura: ")
    val altura = readln().toDouble()
    val imc = peso / (altura * altura)

    println("IMC = %.2f".format(imc))
  }

  /*Questão 07: Escreva um programa que leia dois números e realize a operação aritmética
  desejada pelo usuário com base nas seguintes opções:
  1. Retornar a soma entre dois números;
  2. Retornar a subtração entre dois números;
  3. Retornar a multiplicação entre dois números;
  4. Retornar a divisão entre dois números;*/
  fun calculadora() {
    // Funções locais (só existem dentro de calculadora)
    fun somar(n1: Double, n2: Double) = n1 + n2
    fun subtrair(n1: Double, n2: Double) = n1 - n2
    fun multiplicar(n1: Double, n2: Double) = n1 * n2
    fun dividir(n1: Double, n2: Double) = n1 / n2

    var opcao: Int

    do {
      println("\n=== Calculadora ===")
      println("1. Soma")
      println("2. Subtração")
      println("3. Multiplicação")
      println("4. Divisão")
      println("0. Sair")
      print("Escolha uma opção: ")

      opcao = readln().toInt()

      if (opcao in 1..4) {
        print("Digite o primeiro número: ")
        val n1 = readln().toDouble()
        print("Digite o segundo número: ")
        val n2 = readln().toDouble()

        val resultado = when (opcao) {
          1 -> somar(n1, n2)
          2 -> subtrair(n1, n2)
          3 -> multiplicar(n1, n2)
          4 -> dividir(n1, n2)
          else -> 0.0
        }

        println("Resultado: $resultado")
      } else if (opcao != 0) {
        println("Opção inválida.")
      }

    } while (opcao != 0)
  }
}
