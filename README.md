<h1>Dynamic structure data "Linked List"</h1>

<h2>example use:</h2>

```kotlin
fun main() {

    val list = LinkedList() // create list

    // add elements in list
    list.append("value 1") 

    list.append("value 2")

    list.append("value 3")

    // out elements from list
    list.print()

    // check exists value in list 
    println(list.find("val 4"))

    println(list.find("value 2"))

    // delete value from list
    list.delete("value 2")

    println(list.find("value 2"))

    // set value in list 
    list.changeValue("value 3", "newVal 3")

    list.print()

}
```

<h2>Out:</h2>

```console
value 1
value 2
value 3
false
true
false
value 1
newVal 3
```