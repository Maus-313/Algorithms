import edu.princeton.cs.algs4.Stopwatch;

class A_01_Bubble_Sort{
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        int[] arr={23,12,22,1,14,87};
        

        // Array ends here
        
        String[] arrStrings={"apple","banana","mango","govava","grapes"};
        for(int i=0;i<arr.length;i++){
            int flag=0;
            for(int j=0;j<arr.length-i-1;j++){  // for String comparison use compareTo()<0
                                                // This will make algo more efficient+1 
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){ // adding flag to check if the array is sorted early to stop further proceeding efficiency+1
                break;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        double time = stopwatch.elapsedTime();
        System.out.println("Time taken: "+time);
    }
}