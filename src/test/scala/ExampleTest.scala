import org.scalatest.flatspec.AnyFlatSpec

class ExampleTest extends AnyFlatSpec {
  "Method returnTest" should "return test" in {
    assert(Example.returnTest() == "test")
  }
  "Method returnOne" should "return 1" in {
    assert(Example.returnOne() == 1)
  }
}
