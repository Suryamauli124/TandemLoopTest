public class Program4 {
    public static void main(String args[]) {
     int []arr = new int[10];
     int []values = {1,2,8,9,12,46,76,82,15,20,30};
     int count = 0;
    
     
     for(int i = 1;i < 10;i++){
         for(int j = 0;j < values.length;j++){
             if(values[j] % i == 0){
                 count++;
             }
             
         }
         
         arr[i] = count;
    }
     for(int i = 1;i < 10;i++){
         System.out.print(i + ":" + (arr[i]-arr[i-1])  + "," + "");
     }
    }
}