import java.util.ArrayList;
public class ArryList{
    public static void main(String args[]){

        ArrayList<Integer>list=new ArrayList<>();
        list.add(51);
        list.add(33);
        list.add(38);
        list.add(48);
        list.add(50);
        System.out.println("Number of Element"+list.size());
        for(int i=0;i<=list.size()-1;i++){
            System.out.println(i+"=Element of value="+list.get(i));
        }int max=Integer.MIN_VALUE;
        for(int i=0;i<=list.size()-1;i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
           
        }
        System.out.println("Max Element="+max);
    }

}