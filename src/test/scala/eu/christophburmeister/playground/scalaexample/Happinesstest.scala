package eu.christophburmeister.playground.scalaexample

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import eu.christophburmeister.playground.scalaexample.Happiness

class HappinessTest extends FunSuite with BeforeAndAfter {
  
  var happiness: Happiness = _

  before {
    happiness = new Happiness
  }

  test("init mood is not happy") {
    assert(happiness.isHappy == false)
  }

}
