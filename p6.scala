object Demo {



  def main(args: Array[String]) {



     println( "Returned Value : " + addInt(30,10) );

println( "Returned Value : " + multiplyint(30,10) );
println( "Returned Value : " + devideint(30,10) );


  } ;



  def addInt( a:Int, b:Int ) : Int = {



     var sum:Int = 0



     sum = a + b  ;    return sum



  }





  def multiplyint( a:Int, b:Int ) : Int = {



     var mul:Int = 0



     mul = a * b  ;    return mul



  }




 def devideint( a:Int, b:Int ) : Int = {



     var devide:Int = 0



     devide = a / b  ;    return devide



  }





}


