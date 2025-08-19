package edu.ifal

fun lista01() {
  var opcao: Int

  do {
    println("\n=== Questões - Lista 01 ===")
    println("1. Calcular Idade")
    println("2. Par ou Ímpar")
    println("3. Calcular Altura Média")
    println("4. Maior Número")
    println("5. Calcular Área e Perímetro do Retângulo")
    println("6. Calcular IMC")
    println("7. Calculadora")
    println("0. Sair")
    print("Escolha uma opção: ")

    opcao = readln().toInt()

    if (opcao in 1..7) {
      when (opcao) {
        1 -> Lista01.calcularIdade()
        2 -> Lista01.parOuImpar()
        3 -> Lista01.calcularAlturaMedia()
        4 -> Lista01.maiorNumero()
        5 -> Lista01.calcularAPRetangulo()
        6 -> Lista01.calcularIMC()
        7 -> Lista01.calculadora()
        else -> println("Opção inválida.")
      }
    }
  } while (opcao != 0)
}

fun lista02() {
  var opcao: Int

  do {
    println("\n=== Questões - Lista 02 ===")
    println("1. Zero a Cem")
    println("2. Números Pares de Zero a Cem")
    println("3. Calcular Altura Média")
    println("4. Maior Número")
    println("5. Menor Número")
    println("6. Calcular Idade Média")
    println("7. Calcular Maior e Menor Número")
    println("8. Números Pares Interativo")
    println("0. Sair")
    print("Escolha uma opção: ")

    opcao = readln().toInt()

    if (opcao in 1..8) {
      when (opcao) {
        1 -> Lista02.zeroACem()
        2 -> Lista02.numerosParesZeroACem()
        3 -> Lista02.calcularAlturaMedia()
        4 -> Lista02.maiorNumero()
        5 -> Lista02.menorNumero()
        6 -> Lista02.calcularIdadeMedia()
        7 -> Lista02.calcularMaiorMenorNumero()
        8 -> Lista02.numerosParesInterativo()
        else -> println("Opção inválida.")
      }
    }
  } while (opcao != 0)
}

fun main() {
  var opcao: Int

  do {
    println("\n=== Escolha a Lista de Questões ===")
    println("1. Lista 01")
    println("2. Lista 02")
    println("0. Sair")
    print("Escolha uma opção: ")

    opcao = readln().toInt()

    if (opcao in 1..2) {
      when (opcao) {
        1 -> lista01()
        2 -> lista02()
        else -> println("Opção inválida.")
      }
    }
  } while (opcao != 0)

  println("Programa finalizado.")
}