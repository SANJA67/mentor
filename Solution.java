package com.javarush.task.pro.task13.task1313;

/* 
StringsLinkedList
*/

public class Solution {

    public static void main(String[] args) {
        StringsLinkedList stringsLinkedList = new StringsLinkedList(); // 1 шаг. создали объект
        stringsLinkedList.add("1"); // 9 шаг. Вызвали метод add кдасса StringsLinkedList
        stringsLinkedList.add("2"); // и т. д .
        stringsLinkedList.add("3");
        stringsLinkedList.add("4");
        stringsLinkedList.add("5");
        stringsLinkedList.add("6");
        stringsLinkedList.add("7");
        stringsLinkedList.add("8");
        stringsLinkedList.add("9");
        stringsLinkedList.printAll();
    }
}
  /*
  1 шаг. Создали объект
  2 шаг. Создался объект класса Node
  3 шаг. Создался объект класса Node c сылкой first, c выше указанными переменами которые равны null.
  4 шаг. Создался объект класса Node
  5 шаг. Создался объект класса Node c сылкой last, c выше указанными переменами которые равны null.
  6 шаг. При создании объекта вызволся конструктор где полю next класса Node присвоили ссылку на объект NodeB
  7 шаг. При создании объекта вызволся конструктор где полю next класса Node присвоили ссылку на объект NodeA
  8 шаг. Вызвали метод add класса StringsLinkedList
  9 шаг. Создали объет СУЛЕР
  10 шаг. Присволи значение
  11 шаг. Покутили повертел ПОЛУЧИЛИ: |NodeA| <-> |СУПЕР| <-> |NodeB|
  12 шаг. и т. д.
 ****************************************************************************************
                      null          1           2           3                    null
  13 шаг. РЕЗУЛЬТАТ: |NodeA| <-> |СУПЕР| <-> |СУПЕР1|<-> |СУПЕР2|... и т.д. <-> |NodeB|
  ****************************************************************************************
  15 шаг. переменной currentElement...   Здесь каг бы обвал программы в моей голове
  Я еще обрубился в вопросе понимания работы конструктора класса StringsLinkedList,
  но откинув этот момент я вроде дочитал код до конца...
  Был создан один объект StringsLinkedList (вроде как LinkedList)
  в нем создались Node (каг бы числа), как они там сохранились? (может вопрос не корректный, но лучше не придумал)
  Объекты вроде создаются при вызове метода add() но как меняется next в методе printAll() это за гранью
  моего понимания. Прочитать книгу это не значит понять что там написано.
  Решение нашел в интернете...
   */