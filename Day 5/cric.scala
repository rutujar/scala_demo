import scala.io.Source
val lines = Source.fromFile("data.csv").getLines().toList
var teams = lines.filter(x => x.contains("info,team")).map(x => x.split(",")(2))
println("Match is between " + teams(0) + " V/S " +teams(1))

var umpires = lines.filter(x => x.contains("info,umpire")).map(x => x.split(",")(2))
println(umpires(0), umpires(1))

//var s = "1:2:3:4"
//
//s.split(":").foreach(x => println(x))

def getTotalRuns(listOfBalls :List[String]) :Int ={
    var runsList = listOfBalls.map(x => x.split(",")(7).toInt + x.split(",")(8).toInt)
    var runs :Int= 0
    runsList.foreach( x => runs += x)
    runs
}

def getTotalWickets(listOfBalls :List[String]) :Int ={
    var wickets = listOfBalls.filter(x => ! x.split(",")(9).equals("\"\""))
    wickets.length
}

var ball = lines.filter(x => x.contains("ball,1"))
println(getTotalRuns(ball), "/", getTotalWickets(ball))
var ball2 = lines.filter(x => x.contains("ball,2"))
println(getTotalRuns(ball2), "/", getTotalWickets(ball2))



//var wickets = lines.filter(x => x.contains("ball,1")).map(x =>x.split(",")(9))
//print(wickets)
//print(wickets.filter(x => ! x.equals("\"\"")).length)




//var runsOffBatList = ball.map(x => x.split(",")(7).toInt)
//var runsOffBat = 0
//runsOffBatList.foreach( x => runsOffBat = runsOffBat + x)
//println("Runs off Bat", runsOffBat)
//
//var runsOffExtrasList = ball.map(x => x.split(",")(8).toInt)
//var runsOffExtras = 0
//runsOffExtrasList.foreach( x => runsOffExtras = runsOffExtras + x)
//println("Runs off Extras", runsOffExtras)
//
//var totalFirstInnings = runsOffExtras + runsOffBat
//println("Total First innings", totalFirstInnings)
//
//println(getTotalRuns(ball))


