import junit.framework.TestCase
import org.junit.Test

class AppTest {

    @Test
    fun test_getGreetingMessage() {
        val actual = getGreeting("Mohan")
        TestCase.assertEquals("Hello, Mohan!", actual)
    }
}