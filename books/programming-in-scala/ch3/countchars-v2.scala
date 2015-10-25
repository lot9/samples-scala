import scala.io.Source

// Functions
def widthOfLength(s: String) = s.length.toString.length

// Script
if (args.length > 0)
{
  // get input from command line
  val lines = Source.fromFile(args(0)).getLines().toList

  // calculate maximum width of count of characters in line
  val longestLine = lines.reduceLeft( (a,b) => if (a.length > b.length) a else b )
  val maxWidth = widthOfLength(longestLine)

  // print output
  for (line <- lines)
  {
    val numSpaces = maxWidth - widthOfLength(line)
    val padding = " " * numSpaces
    println(padding + line.length + " | " + line)
  }
}

else
{
  Console.err.println("Please enter filename")
}