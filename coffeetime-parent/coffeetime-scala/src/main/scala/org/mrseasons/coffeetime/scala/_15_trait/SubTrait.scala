package org.mrseasons.coffeetime.scala._15_trait

/**
 * Created by mrseasons on 2015/05/03.
 */
class SubTrait extends ATrait {
  def test = {
    a
    echo()
  }
}

class SubTrait2 extends B with ATrait {
  def test = {
    a
    echo()
    b
  }
}
