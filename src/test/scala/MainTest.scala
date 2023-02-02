import org.scalatest.funsuite.AnyFunSuite

import scala.io.Source




class MainTest extends AnyFunSuite {
  val TEXT_FILE_PATH = "testResources/text.txt"


  test("Main.addTwoNumbers") {
    assert(Main.addTwoNumbers(5, 1) == 6)
  }

  test("Main.addTwoNumbersFailing") {
    //assert(Main.addTwoNumbers(5, 1) == 100)
  }

  test("Main.openFile") {
    val bufferedSource = Source.fromFile(TEXT_FILE_PATH)
    val textString = bufferedSource.getLines.mkString
    bufferedSource.close
    assert(textString.toLowerCase.filterNot(_ == ' ').toSet == ('a' to 'z').toSet)
  }


}
