class Rational(n: Int, d: Int) 
{
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  // auxiliary constructer
  def this(n: Int) = this(n, 1)

  // public methods
  def + (that: Rational): Rational = 
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def + (i: Int): Rational =
    new Ration(numer + i * denom, denom)

  def - (that: Rational): Rational = 
    new Rational(numer * that.denom - that.numer * denom, denom * that.denom)

  def - (i: Int): Rational =
    new Rational(numer - i * denom, denom)

  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def * (i: Int): Rational =
    new Rational(numer * i, denom)

  def / (that: Rational): Rational =
    new Rational(number * that.denom, denom * that.numer)

  def / (i: Int): Rational =
    new Rational(numer, denom * i)
  
  def lessThan(that: Rational) = this.numer * that.denom < that.numer * this.denom
  def max(that: Rational) = if (this.lessThan(that)) that else this

  // public methods (overridden)
  override def toString = numer + "/" + denom

  // private methods
  private def gcd(a: Int, b:Int): Int = if (b == 0) a else gcd(b, a % b)
}

val one_half = new Rational(1,2)
val two_thirds = new Rational(2,3)
println (one_half + two_thirds).toString
