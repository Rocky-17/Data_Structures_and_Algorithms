# List  

&emsp;&emsp;Java 集合框架(JCF)定义了一个 List 接口，提供了 ArrayList 和 LinkedList 实现。  


## ArrayList  
  
&emsp;&emsp;[JDK1.8 ArrayList 源码](https://github.com/Rocky-17/Data_Structures_and_Algorithms/blob/master/src/ArrayList.java)  

&emsp;&emsp;在 Java 中，ArrayList 主要是基于 Object[] elementData 实现的，在存储基本数据类型时只能存储其相应的包装类。  
 
>&emsp;&emsp;实际上java.util.ArrayList是个固定大小的对象，自身并不直接存储元素内容，而是持有一个引用指向一个数组 Object[]，真正负责存储元素内容的正是这个数组。  
>&emsp;&emsp;当需要扩容时，扩容的是这个数组，而不是ArrayList对象自身。  
>&emsp;&emsp;在 ArrayList 中 Object[] 存储的并不是相应的数据，而是指向这些数据的引用。  
>  
>  
>
>&emsp;&emsp;总结摘自 RednaxelaFX 知乎回答：  
&emsp;&emsp;[Java 中 ArrayList 自动扩容的内存上的具体过程是怎样的？](https://www.zhihu.com/question/48872729/answer/113146864)  
&emsp;&emsp;[arraylist和array在内存分配和调用、编译上有什么本质区别？](https://www.zhihu.com/question/41169504/answer/89941026)  

  
&emsp;&emsp;优点：查询效率高。  
&emsp;&emsp;缺点：增删改效率低。  

&emsp;&emsp;[ArrayList 方法使用实例](https://github.com/Rocky-17/Data_Structures_and_Algorithms/blob/master/CODE/ArrayList_Methods_Example.java)  

## LinkedList  

&emsp;&emsp;[JDK1.8 LinkedList 源码](https://github.com/Rocky-17/Data_Structures_and_Algorithms/blob/master/src/LinkedList.java)  

&emsp;&emsp;LinkedList 是一种线性数据结构，它不需要开辟一块连续的内存空间来存储，每个元素都是具有数据部分和地址部分的单独对象。元素使用指针和地址链接,每个元素称为一个节点。  
```
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
```
&emsp;&emsp;可以看到，每个节点除了值，还有前后指针，说明 LinkedList 是一个双向链表结构。