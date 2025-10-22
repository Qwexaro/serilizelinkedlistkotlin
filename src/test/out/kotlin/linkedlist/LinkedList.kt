package test.out.kotlin.linkedlist

import ru.topacademy.serilizelinkedlist.LinkedList

fun main() {

    val list = LinkedList()

    list.append("value 1")

    list.append("value 2")

    list.append("value 3")

    list.print()

    println(list.find("val 4"))

    println(list.find("value 2"))

    list.delete("value 2")

    println(list.find("value 2"))

    list.changeValue("value 3", "newVal 3")

    list.print()

}