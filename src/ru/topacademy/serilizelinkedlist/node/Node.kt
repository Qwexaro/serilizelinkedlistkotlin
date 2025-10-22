package ru.topacademy.serilizelinkedlist.node

class Node {
    var next: Node?

    var value: String

    constructor(value: String) {
        this.value = value
        this.next = null
    }
}