class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,4,6,66,34,32};
        int search=34;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                flag=1;
            }
        }
        if(flag>=1){
            System.out.println("Yes it is present!");
        }else{
            System.out.println("No it is nto present!");
        }
    }
}