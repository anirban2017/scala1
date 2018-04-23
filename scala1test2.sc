object scala1test2 {
  
  val t = List((1, "alpha"), (2, "beta"), (3, "gamma"), (4, "zeta"), (5, "omega"))
                                                  //> t  : List[(Int, String)] = List((1,alpha), (2,beta), (3,gamma), (4,zeta), (5
                                                  //| ,omega))


//For the above list, print the numbers where the corresponding string length is 4.
t.filter(_._2.length == 4).foreach(x => println(x._2))
                                                  //> beta
                                                  //| zeta

t.filter(_._2.length == 4).foreach(x => println(x._1))
                                                  //> 2
                                                  //| 4
                                                  
                                                  
 
 
 //It will find the average of all numbers, where the corresponding string contains alphabet ‘m’ or alphabet ‘z’.
  t.filter(_._2.matches(".*[m,z].*")).foreach(x => println(x._2))
                                                  //> gamma
                                                  //| zeta
                                                  //| omega
  
 
 t.filter(_._2.matches(".*[m,z].*")).foreach(x => println(x._1))
                                                  //> 3
                                                  //| 4
                                                  //| 5
                                                  
   var a=0                                        //> a  : Int = 0
   var b=0                                        //> b  : Int = 0
   for(x <- t.filter(_._2.matches(".*[m,z].*")))
{
a+=x._1
b=b+1
}
println(a/b)                                      //> 4
}