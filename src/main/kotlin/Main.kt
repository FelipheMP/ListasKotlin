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

fun main() {
  var opcao: Int

  do {
    println("\n=== Escolha a Lista de Questões ===")
    println("1. Lista 01")
    println("0. Sair")
    print("Escolha uma opção: ")

    opcao = readln().toInt()

    if (opcao in 1..1) {
      when (opcao) {
        1 -> lista01()
        else -> println("Opção inválida.")
      }
    }
  } while (opcao != 0)

  println("Programa finalizado.")
}