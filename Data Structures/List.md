# List  

&emsp;&emsp;Java 集合框架(JCF)定义了一个 List 接口，提供了 ArrayList 和 LinkedList 实现。  


## ArrayList  
  
&emsp;&emsp;[JDK1.8 源码地址](http://hg.openjdk.java.net/jdk8u/jdk8u/jdk/file/tip/src/share/classes/java/util/ArrayList.java)  

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

&emsp;&emsp;[ArrayList 方法使用实例](https://github.com/Rocky-17/Data_Structures_and_Algorithms/blob/master/CODE/ArrayList_API_Example.java)  

|方法|功能|
|-|-|
|add(int index, Object element)|在ArrayList中的特定位置索引处插入特定元素。|
|add(Object o)|将特定元素追加到ArrayList的末尾。|
|addAll(Collection C)|将集合C中的所有元素附加到ArrayList的末尾，其顺序为值由集合C的​​迭代器返回|
|addAll(int index, Collection C)|将集合C中从指定位置开始的所有元素插入ArrayList中|
|clear()|移除ArrayList的所有元素|
|clone()|返回返回ArrayList的浅拷贝|