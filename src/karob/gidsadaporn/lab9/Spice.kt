package karob.gidsadaporn.lab9

class Spice (val name: String,
             val spiciness: String = "mild") {
    val heat: Int
        get(){
            return when(spiciness){
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                else -> 10
            }
        }
    init {
        println("spice ${this.name} has spicy level as ${this.spiciness}")
    }
}

fun main(args: Array<String>){
    var spicies = listOf(Spice("green curry"),
        Spice("red curry", "medium" ),
        Spice("pepper", "spicy" ),
        Spice("red pepper", "very spicy" ))

    val spicies2 = getSpicyOrLess(spicies)
    println("=== Printing only spicy or less than spicy ===")

    for(s2 in spicies2)
        println("${s2.name} has spicy level as ${s2.spiciness}")

    println("=== MakeSalt ===")
    makeSalt()
}

fun getSpicyOrLess(spicies: List<Spice>): List<Spice> {
    return spicies.filter {
        it.heat <=5
    }
}

fun makeSalt(): Spice = Spice("salt", "mild")


