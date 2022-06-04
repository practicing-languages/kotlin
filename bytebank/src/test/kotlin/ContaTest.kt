import junit.framework.TestCase
import org.junit.Test

class ContaTest : TestCase()

var conta = Conta("Rafael", 2000)
var conta2 = Conta("Jennifer", 1600)

@Test
fun testDeposita(){
    conta.deposita(10.0)
    conta.saca(10.0)
    conta.transfere(conta2, 10.0)
//    expect(20.0, )
}
