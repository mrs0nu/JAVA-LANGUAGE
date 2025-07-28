public class recursion {
    public static void  tofh (int ndisk,char source,char temp, char dest)
  {
        if (ndisk>0)
        {
            tofh(ndisk-1,source,dest,temp);
            System.out.print("Move Disk "+ndisk+source+"-->"+dest+"\n");
            tofh(ndisk-1,temp,source,dest);
        }
    }
       

    public static void main(String []agrs){
        

    char source='S',temp='T',dest='D';
 
    int ndisk=4;
    // printf("Enter the Number of disk : ");
    // scanf("%d",&ndisk);
    System.out.print("squence is:\n");
    tofh(ndisk,source,temp,dest);

}

    
}
