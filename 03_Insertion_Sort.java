class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr={23,12,22,1,14,87};
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;    
                }
            }

        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}