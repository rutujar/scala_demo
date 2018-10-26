import scala.io.Source
val lines=Source.fromFile("335982.csv").getLines().toList

print(lines)
var times=lines.filter(x=>x.contains("info,team")).map(x=>x.split(",")(2))

var s="1:2:3:4"
s.split(":").foreach(x=>println(x))
