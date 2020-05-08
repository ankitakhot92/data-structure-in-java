/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
* */
public class Solution {
	public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head,int i,int j){
        
        int count1 = 1;
        int count2 = 1;
        
        if(head == null){
            return head;
        }
        if(i == j){
            return null;
        }
        if(i > j){
            int temp1 = i;
            i = j;
            j = temp1;
        }
        
        LinkedListNode<Integer> p1 = head;
        LinkedListNode<Integer> c1 = head;
        LinkedListNode<Integer> p2 = head;
        LinkedListNode<Integer> c2 = head;
        LinkedListNode<Integer> temp;
        
        if(i == 0){
            c1 = head;
        }else{
            while(count1 != i){
            p1 = p1.next;
            count1++;
        	}
        	c1 = p1.next;
            
        }
        
        
        
        while(count2 != j){
            p2 = p2.next;
            count2++;
        }
        c2 = p2.next;
        
        if(c1 == head){
            if(c1 == p2){
                p1.next = c2.next;
                c2.next = p1;
                return c2;
            }
            temp = c2.next;
            c2.next = c1.next;
     	    p2.next = c1;
      		c1.next = temp;
            return c2;
        }
        
        if(c2 == p1){
            p2.next = c1;
            temp = c1.next;
            c1.next = c2;
            c2.next = temp;
            return head;
        }
        if(c1 == p2){
            p1.next = c2;
            temp = c2.next;
            c2.next = c1;
            c1.next = temp;
            return head;
        }
        
        p1.next = c2;
        temp = c2.next;
        c2.next = c1.next;
        p2.next = c1;
        c1.next = temp;
        
       
        
        return head;
		
	}
}