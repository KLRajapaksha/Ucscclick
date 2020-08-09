import scala.math.pow
object newObject {
    def main(args:Array[String]) {
          val point1 = Point(5,4)
          val point2 = Point(9,10)
          
          println(point1+point2)
          println(point1.move(4,5))
          println(point1.distance(point2))
          println(point1.invert())
  }  
  
}

case class Point(x:Int,y:Int){
  
  def +(p:Point) = Point(this.x+p.x,this.y+p.y)
  def move(dx:Int,dy:Int) = Point(this.x+dx,this.y+dy)
  def distance(p:Point) = {
    val disx = scala.math.pow(p.x-this.x,2.0)
    val disy = scala.math.pow(p.y-this.y,2.0)
    
    scala.math.pow(disx+disy,0.5)
  }
  def invert() = Point(this.y,this.x)
}