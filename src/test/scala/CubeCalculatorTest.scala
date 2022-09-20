class CubeCalculatorTest extends org.scalatest.funsuite.AnyFunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }
  test("CubeCalculator.cube 0 should be 0") {
	   assert(CubeCalculator.cube(0) === 0)
  }
}
