import kotlin.random.Random

fun main() {
    val array = List(10) { Random.nextInt(0, 1000) }
    val collection = mutableListOf<Int>()

    for (i in array.indices) {
        if (collection.isEmpty())
            collection.add(array[i])
        else {
            val index = collection.indexOfLast { it <= array[i] }
            collection.add(index + 1,array[i])
        }
    }
    println(collection)
}