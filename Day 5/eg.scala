var l=List(1,2,3,4,5)

l.foreach(x=>println(x))

l.foreach(println(_))

l.map(x=>x+x)

l.map(x=>x+20)

l.map(_+20)

"120".toInt

"120".toString

"res".toString

var ball=lines.filter(x=>x.contains("ball,1"))
print(ball)

var runs=ball.map(x=>x.split(",")(7).toInt)
print(runs)

var runsofbat=0
runs.foreach(x=>runsofbat=runsofbat+x)

print(runsofbat)


//

var runs1=ball.map(x=>x.split(",")(8).toInt)
print(runs1)

var runsofbat1=0
runs.foreach(x=>runsofbat1=runsofbat1+x)

print(runsofbat1)

var total=runsofbat1+runsofbat
print(total)



