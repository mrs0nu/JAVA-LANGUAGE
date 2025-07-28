public class reverses{
    
 
    public static void main(String[] var0) {
       byte var2 = 3;
       boolean var3 = false;
       int var4 = 587;
       int var5 = 0;
 
       for(int var1 = 1; var1 <= var2; ++var1) {
          int var6 = var4 % 10;
          var4 /= 10;
          var5 = var5 * 10 + var6;
       }
 
       System.out.print(var5);
    }
 }