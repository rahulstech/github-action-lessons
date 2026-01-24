import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class AppTest {

    @Test
    fun test_getGreetingMessage() {
        val actual = getGreeting("Mohan")
        assertEquals("Hello, Mohan!", actual)
    }

    // this test fails intentionally to see the test report artifact parsing works
    @Test
    fun test_sum() {
        val actual = sum(1, 2)
        assertEquals(4, actual) // intentionally wrong expected
    }
}