//1.Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc(2 points)
//2.Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height(2 points)
//3.Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age   (2 points)
//4.Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)
//5.Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.(3 points)
fun main() {
    var y =names(listOf("John","Joy","Joan","Jude","Joice","Jane","Joseph","Julius","prude","Neverce"))
    println(y)
    var b=height(listOf(24,61,75,100,27))
    println(b)
    var d = Car("AY45",23.9)
    println(d.registration)
    println(d.milage)


}
fun names(name:List<String>):List<String> {
    var newList = mutableListOf<String>()
    name.forEachIndexed { index, i ->
        if (index % 2 == 0)
            newList.add(i)
    }

    return newList
}
fun height(height:List<Int>):String {
    var x = height.average()
    var z = height.sum()
    var y = "Average is $x meters and the sum is $z metres"
    return y

data class People(var name:String,var age:Int,var height: Double,var weight:Int)
    fun sort(people:List<People>){
        var sortedlist=people.sortedBy { person-> person.age }
        println(sortedlist)
  }


} data class Car(var registration:String,var milage:Double)
fun all(car:List<Car>):Double{
    var add=0.0
    var num=car.count()
    var c=car.forEach{cr->
        add+=cr.milage

    }
    return add/num
}


