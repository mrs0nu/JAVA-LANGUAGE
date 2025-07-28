public class linklists{
    public static class node{
        int data;
        node next;
        public node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public static node size;
    public  void addfirst(int data){
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(int data){
        node newnode =new node(data);
       
        if(head==null){
            head=tail=newnode;
            return;
        }
        
        tail.next=newnode;
        tail=newnode;
    }
    public void print(){
        node temp=head;
        if(head==null){
            System.out.print("Empty list");
        }
        else{
            while(temp.next!=null){
                System.out.print("->"+temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main (String []args){
      linklists ll=new linklists();
       ll.addfirst(11);
       ll.addfirst(22);
       ll.addfirst(33);
       ll.addfirst(44);
       ll.addfirst(55);
       ll.print();
    }
}