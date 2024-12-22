```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    // Correct use of filter
    val filteredList = list.filter { it > 2 }
    println(filteredList) // Output: [3, 4, 5]

    // Avoid modifying the list inside map
    val modifiedList = list.map { it + 1 }
    println(modifiedList) //Output: [2, 3, 4, 5, 6]

    // Using immutable variable inside lambda for better safety and efficiency
    val listWithCounter = list.mapIndexed { index, element -> 
        element + index + 1
    }
    println(listWithCounter) //Output: [2, 4, 6, 8, 10]

    val anotherList = list.map{it + 1}
    val sum = anotherList.sum()
    println("The sum of elements in anotherList is: " + sum) //Output: 20

    val result = list.fold(0) { acc, i -> acc + i }
    println(result) // Output: 15
}
```