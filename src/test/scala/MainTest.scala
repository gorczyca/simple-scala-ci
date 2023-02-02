import org.scalatest.funsuite.AnyFunSuite

class MainTest extends AnyFunSuite {
  test("Main.addTwoNumbers") {
    assert(Main.addTwoNumbers(5, 1) == 6)
  }
}
