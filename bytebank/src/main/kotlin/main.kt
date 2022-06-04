fun main() {
    println("Bem vindo ao bytebank! ${System.lineSeparator()}")

    val conta = Conta("Rafael", 1000)
    val conta2 = Conta("Jeje", 2000)
    conta.deposita(200.0)

    println(conta)
    println(conta2)

//    conta2.transfere(conta, 10.0)
//    conta.saca(10.0)
//    conta.deposita(10.0)


    println(conta.saldo)
    println(conta2.saldo)
}

fun secundaryMain(saldo: Double) {
    println("hello world")

    val titular = "Rafael"
    val numeroConta = 1000
    var saldo = 0.0

    val conta = Conta("Rafael", 1000)
//    conta.titular = "Rafael"
//    conta.numeroConta = 1000
//    conta.saldo = 10.0

    println(conta)

    saldo = 100 + 2.0
    saldo += 200
    saldo = 0.0
    saldo -= 1000

    println("O titular é $titular")
    println("O número da conta é $numeroConta")
    println("O saldo da conta é $saldo")
    println()

    exIf(saldo)
    exWhen(saldo)
    exwhenOutraForma(saldo)

    exFor()
    exForDown()

    exForDownStep()
    exForDownStepWithContinue()

    exWhile()

    doWhile()

    exMap()
}

fun exWhen(saldo: Double) {
    when {
        saldo > 0.0 -> {
            println("Conta é positiva!")
        }
        saldo == 0.0 -> {
            println("Conta é neutra!")
        }
        else -> {
            println("Conta é negativa!")
        }
    }
}

fun exwhenOutraForma(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva!")
        saldo == 0.0 -> println("Conta é neutra!")
        else -> println("Conta é negativa!")
    }
}

fun exIf(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta é positiva!")
    } else if (saldo == 0.0) {
        println("Conta é neutra!")
    } else {
        println("Conta é negativa!")
    }
}

fun exFor() {
    for (i in 1..3) {
        println(i)
    }
}

fun exForDown() {
    for (i in 5 downTo 1) {
        println(i)
    }
}

fun exForDownStep() {
    for (i in 10 downTo 1 step 2) {
        if (i == 4) break

        println(i)
    }
}

fun exForDownStepWithContinue() {
    for (i in 10 downTo 1 step 2) {
        if (i == 4) continue

        println(i)
    }
}

fun exWhile() {
    var i: Int = 0

    while (i < 5) {
        println(i)
        i++
    }
}

fun doWhile() {
    var i: Int = 0

    do {
        println(i)
        i++;
    } while (i < 5)
}

fun exMap() {
    val nomes = listOf("rafael", "ricardinho", "giovanna", "binao", "fernandinho")
    nomes
        .filter { it.startsWith("r") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}