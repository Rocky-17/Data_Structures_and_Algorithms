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

<table border="0" cellpadding="0" cellspacing="0" width="1945" style="border-collapse: 
 collapse;table-layout:fixed;width:1458pt">
 <colgroup><col width="130" style="mso-width-source:userset;width:97.5pt">
 <col width="334" style="mso-width-source:userset;width:250.5pt">
 <col width="393" style="mso-width-source:userset;width:294.75pt">
 <col width="380" style="mso-width-source:userset;width:285pt">
 <col width="708" style="mso-width-source:userset;width:531pt">
 </colgroup><tbody><tr height="21" style="mso-height-source:userset;height:15.75pt" id="r0">
<td height="21" width="130" style="height:15.75pt;width:97.5pt;"></td>
<td class="x31" width="334" style="width:250.5pt;">方法</td>
<td class="x21" width="393" style="width:294.75pt;">功能</td>
<td class="x21" width="380" style="width:285pt;">代码示例</td>
<td class="x26" width="708" style="width:531pt;">备注</td>
 </tr>
 <tr height="20" style="mso-height-source:userset;height:15pt" id="r1">
<td rowspan="5" height="94" class="x24" style="border-right:3px solid windowtext;border-bottom:3px solid windowtext;height:70.5pt;">增</td>
<td class="x22">add(E e)</td>
<td class="x22">在尾部插入</td>
<td class="x22"></td>
<td class="x27">由于removeRange(int,int) 在 java.util.ArrayList 中是 protected 访问控制，并未暴露给用户，可以使用subList(start, end).clear()来达成相同效果</td>
 </tr>
 <tr height="19" style="mso-height-source:userset;height:14.25pt" id="r2">
<td class="x22">add(int index, E element)&nbsp;</td>
<td class="x22">在指定位置插入指定值</td>
<td class="x22"></td>
<td class="x27"></td>
 </tr>
 <tr height="19" style="mso-height-source:userset;height:14.25pt" id="r3">
<td class="x22">addAll(Collection&lt;? extends E&gt; c)</td>
<td class="x22">将指定集合按顺序插入到 ArrayList 尾部</td>
<td class="x22"></td>
<td class="x27"></td>
 </tr>
 <tr height="19" style="mso-height-source:userset;height:14.25pt" id="r4">
<td class="x22">clone()</td>
<td class="x28">ArrayList的浅拷贝</td>
<td class="x28">ArrayList cloneList = (ArrayList) arrli.clone();</td>
<td class="x27"></td>
 </tr>
 <tr height="20" style="mso-height-source:userset;height:15pt" id="r5">
<td class="x29">addAll(int index, Collection&lt;? extends E&gt; c)</td>
<td class="x29">将指定集合按顺序插入到 ArrayList 指定位置</td>
<td class="x29"></td>
<td class="x30"></td>
 </tr>
 <tr height="20" style="mso-height-source:userset;height:15pt" id="r6">
<td rowspan="5" height="94" class="x24" style="border-right:3px solid windowtext;border-bottom:3px solid windowtext;height:70.5pt;">删</td>
<td class="x22">remove(Object o)</td>
<td class="x22">删除指定元素</td>
<td class="x22"></td>
<td class="x27"></td>
 </tr>
 <tr height="19" style="mso-height-source:userset;height:14.25pt" id="r7">
<td class="x22">remove(int index)</td>
<td class="x22">删除指定位置的元素</td>
<td class="x22"></td>
<td class="x27"></td>
 </tr>
 <tr height="19" style="mso-height-source:userset;height:14.25pt" id="r8">
<td class="x22">removeAll(Collection&lt;?&gt; c)</td>
<td class="x22">删除 ArrayList 中 指定集合里存在的元素</td>
<td class="x22"></td>
<td class="x27"></td>
 </tr>
 <tr height="19" style="mso-height-source:userset;height:14.25pt" id="r9">
<td class="x22">removeRange(int fromIndex, int toIndex)</td>
<td class="x22">删除 ArrayList 指定范围内的元素</td>
<td class="x22"></td>
<td class="x27"></td>
 </tr>
 <tr height="20" style="mso-height-source:userset;height:15pt" id="r10">
<td class="x29">retainAll(Collection&lt;?&gt; c)</td>
<td class="x29">只保留 ArrayList 中指定集合中包含的元素。</td>
<td class="x29"></td>
<td class="x30"></td>
 </tr>
 <tr height="20" style="mso-height-source:userset;height:15pt" id="r11">
<td rowspan="9" height="170" class="x24" style="border-right:3px solid windowtext;border-bottom:3px solid windowtext;height:127.5pt;">查</td>
<td class="x22">get(int index)</td>
<td class="x22">返回指定位置的元素</td>
<td class="x22"></td>
<td class="x27"></td>
 </tr>
 <tr height="19" style="mso-height-source:userset;height:14.25pt" id="r12">
<td class="x22">indexOf(Object o)</td>
<td class="x22">返回指定元素的第一个匹配项的位置</td>
<td class="x22"></td>
<td class="x27"></td>
 </tr>
 <tr height="19" style="mso-height-source:userset;height:14.25pt" id="r13">
<td class="x22">lastIndexOf(Object o)</td>
<td class="x22">返回指定元素最后一个匹配项的位置</td>
<td class="x22"></td>
<td class="x27"></td>
 </tr>
 <tr height="19" style="mso-height-source:userset;height:14.25pt" id="r14">
<td class="x22">isEmpty()</td>
<td class="x22">判断 ArrayList 是否为空</td>
<td class="x22"></td>
<td class="x27"></td>
 </tr>
 <tr height="19" style="mso-height-source:userset;height:14.25pt" id="r15">
<td class="x22">listIterator()</td>
<td class="x22">按顺序返回 ArrayList 中的元素</td>
<td class="x22"></td>
<td class="x27"></td>
 </tr>
 <tr height="19" style="mso-height-source:userset;height:14.25pt" id="r16">
<td class="x22">listIterator(int index)</td>
<td class="x22">按顺序返回 ArrayList 从指定位置开始的的元素</td>
<td class="x22"></td>
<td class="x27"></td>
 </tr>
 <tr height="19" style="mso-height-source:userset;height:14.25pt" id="r17">
<td class="x22">toArray()</td>
<td class="x22">返回一个包含此ArrayList中所有元素的数组。</td>
<td class="x28">Object array[] = arrli.toArray();</td>
<td class="x27"></td>
 </tr>
 <tr height="19" style="mso-height-source:userset;height:14.25pt" id="r18">
<td class="x22">subList(int fromIndex, int toIndex)</td>
<td class="x22">返回 ArrayList 指定范围内的视图</td>
<td class="x22"></td>
<td class="x27"></td>
 </tr>
 <tr height="20" style="mso-height-source:userset;height:15pt" id="r19">
<td class="x29">size()</td>
<td class="x29">返回 ArrayList 里元素的个数</td>
<td class="x29"></td>
<td class="x30"></td>
 </tr>
 <tr height="20" style="mso-height-source:userset;height:15pt" id="r20">
<td rowspan="2" height="37" class="x24" style="border-right:3px solid windowtext;border-bottom:3px solid windowtext;height:27.75pt;">改</td>
<td class="x22">set(int index, E element)</td>
<td class="x22">将 ArrayList 指定位置的值修改为指定值</td>
<td class="x22"></td>
<td class="x27"></td>
 </tr>
 <tr height="20" style="mso-height-source:userset;height:15pt" id="r21">
<td class="x29">trimToSize()</td>
<td class="x29">将 ArrayList 容量调整为 ArrayList 的当前大小。</td>
<td class="x29"></td>
<td class="x30"></td>
 </tr>
<!--[if supportMisalignedColumns]-->
 <tr height="0" style="display:none">
  <td width="130" style="width:97.5pt"></td>
  <td width="334" style="width:250.5pt"></td>
  <td width="393" style="width:294.75pt"></td>
  <td width="380" style="width:285pt"></td>
  <td width="708" style="width:531pt"></td>
 </tr>
 <!--[endif]-->
</tbody></table>



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

