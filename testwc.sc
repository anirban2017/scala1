object testwc {
  
     val list1=List[String]("alpha","gamma","omega","zeta","beta")
                                                  //> list1  : List[String] = List(alpha, gamma, omega, zeta, beta)
 
 //Find count of all strings with length 4
 println(list1.count(s=>s.length==4))             //> 2
 
 
 //Convert the list of string to a list of integers, where each string is mapped to its corresponding length.
 val countlist1 = list1.map( (clist: String) => {clist.length})
                                                  //> countlist1  : List[Int] = List(5, 5, 5, 4, 4)
                                                   
 for (clist <- countlist1) {println(clist)}       //> 5
                                                  //| 5
                                                  //| 5
                                                  //| 4
                                                  //| 4
 
 //Find count of all strings which contain alphabet ‘m’.
  val list2=list1.filterNot
 {
 pair =>
  val xss = pair.split("m")
  list1.containsSlice(xss)
 }                                                //> list2  : List[String] = List(gamma, omega)
var a=0                                           //> a  : Int = 0
for(pair <- list2)
{
a=a+1
}
println(a)                                        //> 2
 
 //Find the count of all strings which start with the alphabet ‘a’.
  list1.count(s=>s.startsWith("a"))               //> res0: Int = 1

}