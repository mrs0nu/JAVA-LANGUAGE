public class linlist1{
    public static class  node{
        int data;
        node next ;
        public  node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;
    public void addfirst(int data){
        node newnode=new node(data);
        size++;
        if (head==null){
            head=tail=newnode;
            return ;
        }
        newnode.next=head;
        head=newnode;
    }
    public void print (){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int removelast(){
       if(size==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
       } 
       else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;   
    }
    node prev=head;
    for(int i=0;i<size-2;i++){
        prev=prev.next;
    }
    int val=prev.next.data;
    prev.next=null;
    tail=prev;
    size--;
     return val;   
    }
}
