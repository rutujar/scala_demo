def totalruns(listofball:List[String]):Int={
var runslist=ball.map(x=>x.split(",")(7).toInt + x.split(",")(8).toInt)
var runs:Int=0
runslist.foreach(x=>runs+=x)
runs
}
