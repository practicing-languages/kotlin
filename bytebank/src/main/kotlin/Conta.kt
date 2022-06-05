class Conta(
    val titular: String,
    val numeroConta: Int,
    val digitoConta: Int = 9
) {
    var saldo = 0.0
        private set

    fun deposita(quantia: Double) {
        when {
            quantia > 0.0 -> this.saldo += quantia
            else -> println("O valor tem que ser maior que zero!")
        }
    }

    fun saca(quantia: Double) {
        when {
            quantia > 0.0 && this.saldo >= quantia -> this.saldo -= quantia
            else -> println("Erro ao efetuar a transação!")
        }
    }

    fun transfere(contaDestino: Conta, quantia: Double) {
        if (this.hashCode() == contaDestino.hashCode()) {
            println("Não é possivel transferir para a mesma conta de origem!")
            return
        }
        when {
            quantia > 0.0 && this.saldo >= quantia -> {
                this.saca(quantia)
                contaDestino.deposita(quantia)
            }
            else -> println("Erro ao efetuar a transação!")
        }
    }


//    fun getSaldo(): Double{
//        return saldo
//    }
//
//    fun setSaldo(valor: Double){
//        if (valor > 0){
//            saldo = valor
//        }
//    }

    override fun toString(): String {
        return """
        O titular é '$titular' 
        O numero da conta é $numeroConta
        O saldo da conta é R$$saldo
    """
    }
}