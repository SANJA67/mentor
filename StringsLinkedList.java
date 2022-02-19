package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node(); // 2 шаг. создался объект класса Node
    private Node last = new Node();  // 4 шаг. создался объект класса Node

    public StringsLinkedList() {
//++++++++++++++++++++++++++++++++++++++++++++++++++++
        first.next = last;
        // 6 шаг. При создании объекта вызволся конструктор
        // где полю next класса Node присвоили ссылку на объект NodeB
        // |NodeA| -> |NodeB|
//++++++++++++++++++++++++++++++++++++++++++++++++++++
        last.prev = first;
        // 7 шаг. При создании объекта вызволся конструктор
        // где полю next класса Node присвоили ссылку на объект NodeA
        // |NodeB| -> |NodeA|
    }
    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {              // 15 шаг. переменной currentElement
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {

        Node node = new Node(); // 10 шаг. Создали объет СУЛЕР
        node.value = value;     // 11 шаг. присволи значение полю value объета СУЛЕР
//*******************************************************************
        Node lastNode = last.prev;
        lastNode.next = node;    // 12 шаг. покрутили повертели ПОЛУЧИЛИ: |NodeA| <-> |СУПЕР| <-> |NodeB|
        node.prev = lastNode;    // и т. д .
        last.prev = node;
//******************************************************************
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;

        //      3 шаг. создался объект класса Node c сылкой first,
        // c выше указанными переменнами которые равны null.
        //************************************************************************
        //      5 шаг. создался объект класса Node c сылкой last,
        // c выше указанными переменнами которые равны null.

    }
}
