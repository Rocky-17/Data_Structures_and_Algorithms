import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.ListIterator;

class ArrayListExample {
    public static void main(String[] args) {

//        创建一个ArrayList
        ArrayList<Integer> arrli = new ArrayList<Integer>(10);

//        在ArratList中插入元素
//        add(Element) 在尾部插入
//        add(Index,Element) 在指定下标处插入
        for (int i = 1; i <= 9; i++) {
            arrli.add(i);
        }

//        返回ArrayList中元素的数量
//        size()
        System.out.println(arrli.size());

//        判断ArrayList是否为空
//        bool isEmpty()
        System.out.println(arrli.isEmpty());

//        判断ArrayList是否包含某元素
//        bool contains()
        System.out.println(arrli.contains(2));

//        返回ArrayList指定元素的第一个匹配项的下标，如果不包含该元素则返回-1
//        indexOf()
        System.out.println(arrli.indexOf(1));

//        返回ArrayList指定元素的最后一个匹配项的下标，如果不包含该元素则返回-1
//        lastIndexOf()
        System.out.println(arrli.lastIndexOf(1));

//        ArrayList的浅拷贝
//        clone()
        ArrayList cloneList = (ArrayList) arrli.clone();

//        返回一个包含此ArrayList中所有元素的数组。
//        toArray()
        Object array[] = arrli.toArray();

//        返回ArrayLIst中指定下标的元素。
//        get()
        System.out.println(arrli.get(2));

//        将ArrayList中指定下标的元素替换为指定的元素。
//        set()
        arrli.set(2,2);

//        将ArrayList_1中所有元素按顺序插入ArrayList_2中
//        addAll(Collection<? extends E> c)
        arrli.addAll(cloneList);

//        将ArrayList_1中所有元素按顺序插入ArrayList_2指定位置
//        addAll(int index, Collection<? extends E> c)
        arrli.addAll(3,cloneList);

//        按顺序返回ArrayList从指定位置开始的的元素
//        listIterator(int index) 默认为0
        ListIterator arr =  arrli.listIterator(1);
        while(arr.hasNext()) {
            System.out.print(arr.next() + " ");
        }


//        移除ArrayList的某元素
//        remove(int index) 移除指定下标处的元素
//        bool remove(Object o)  移除指定元素的第一个匹配
        arrli.remove(2);
        arrli.remove((Object)2);

//        移除ArrayList指定范围内的元素
//        removeRange(int fromIndex, int toIndex)
//        由于removeRange(int,int) 在 java.util.ArrayList 中是 protected 访问控制
//        可以使用subList(start, end).clear()来达成相同效果
        arrli.subList(9, 18).clear();

//        移除ArrayList_1中所有ArrayList_2包含的元素
        arrli.removeAll(cloneList);

//        移除ArrayList_1中ArrayList_2中不包含的元素
//        retainAll(Collection<?> c)
        arrli.retainAll(cloneList);

//        移除ArrayList的所有元素
//        clear()
        arrli.clear();

    }
}