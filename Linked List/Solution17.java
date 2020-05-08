
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
public class solution {
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
        

        LinkedListNode<Integer> t1 = head;
        LinkedListNode<Integer> t2;
        
        if(M == 0){
            return null;
        }
        if(N == 0){
            return head;
        }
        
        while(t1.next != null){
          int c1 = 1;
          int c2 = 1;
          while(c1 != M){
            if(t1.next == null){
                break;
            }
            t1 = t1.next;
            c1++;
        }
    
        t2 = t1.next;
        while(c2 != N){
            if(t2 == null){
                break;
            }
            t2 = t2.next;
            c2++;
        }
        if(t2 == null || t2.next == null){
            t1.next = null;
        }else{
           t2 = t2.next; 
           t1.next = t2;
           t1 = t2;
        }
        
          
        }
        return head;
        

	}
}
