import edu.princeton.cs.algs4.Stopwatch;

class Selection_Sort {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        int[] arr={23,12,22,1,14,87};
        
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){ // for String Array use compareTo()
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        double time = stopwatch.elapsedTime();
        System.out.println("Time taken: "+time);
    }
}
