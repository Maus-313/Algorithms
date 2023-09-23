class BinarySearch{
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,8,9};
        int LI=0;// Lower Limit
        int HI=arr.length-1; // Higher Limit
        int m=(LI+HI)/2; // Middle

        int item=33;// item to search
        while(LI<=HI){
            if(arr[m]==item){
                System.out.println("Item is at "+m+" index position");
                break;
            }else if(arr[m]<item){
                LI=m+1;
            }else{
                HI=m-1;
            }
            m=(HI+LI)/2;
        }
        if(LI>HI){
            System.out.println("Element not found!");
        }
    }
}