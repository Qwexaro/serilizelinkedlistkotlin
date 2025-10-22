package ru.topacademy.serilizelinkedlist

import ru.topacademy.serilizelinkedlist.node.Node

class LinkedList {
    var head: Node?

    constructor() {
        this.head = null
    }

    fun append(value: String) {
        val node: Node = Node(value)
        if(head == null) {
            head = node
            return
        }
        var current = head
        while (current?.next != null) {
            current = current.next
        }
        current?.next = node
    }

    fun print() {
        var current = head
        while (current != null) {
            println(current.value)
            current = current.next
        }
    }

    fun find(search: String): Boolean {
        var temp = head
        while (temp != null) {
            if(search == temp.value) {
                return true
            }
            temp = temp.next
        }
        return false
    }

    fun delete(search: String) {
        val temp = head
        while (temp != null) {
            if(search == temp.next?.value) {
                temp.next = temp.next?.next
                return
            }
        }
    }

    fun changeValue(oldValue: String, newValue: String) {
        val temp = head
        while (temp != null) {
            if(oldValue == temp.next?.value) {
                temp.next?.value = newValue
                return
            }
        }
    }
}