/*1-Use stack*/
/*这个程序多看下，学习链表和栈的建立和操作，以及ArrayList的操作*/
/*栈，需要导入java.util.Stack,ArrayList导入java.util.Arraylist.*/
/*调用链表的值为listNode.val,listNode.next为下一个元素。*/
/*栈的压入为：stack.push,栈的弹出为stack.pop*/
import java.util.Stack;
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while(listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
}