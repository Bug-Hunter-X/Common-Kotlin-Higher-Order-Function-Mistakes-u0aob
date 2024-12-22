```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    // Incorrect use of filter, it should be used to filter out elements that do not satisfy the condition
    val filteredList = list.filter { it > 2 }
    println(filteredList) // Output: [3, 4, 5]
    
    //Common mistake is trying to modify the list inside a lambda expression used with map,filter, or other functional operations
    val modifiedList = list.map{ it + 1}
    println(modifiedList)//Output: [2,3,4,5,6]

    // another common mistake is using mutable variables inside lambda expression, when using immutable variables would be safer and more efficient
    var mutableCounter = 0
    val listWithCounter = list.map{
        mutableCounter++
        it + mutableCounter
    }
    println(listWithCounter) //Output: [2, 4, 7, 11, 16]
    
    val anotherList = list.map { it + 1}
    val sum = anotherList.sum()
    println("The sum of elements in anotherList is:" + sum) //Output: 20

    val result = list.fold(0){acc,i-> acc + i}
    println(result) //Output: 15
}
```