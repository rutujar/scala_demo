def factorial(n:Int):Int={
def fact(n:Int,acc:Int):Int=if(n==1)acc else fact(n-1,acc*n)
fact(n,1)
}

output:
//factorial(5)
//Int: 120
