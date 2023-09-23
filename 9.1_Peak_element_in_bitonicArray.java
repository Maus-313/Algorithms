class Peak_element_in_bitonicArray {
    public static void main(String[] args) {
        int[] bit_arr={1,3,5,131,234,32,14,9,2};
        int ll=0;// lower Limit 
        int hl=bit_arr.length-1;// Higher limit
        while(ll<=hl){
            int m=ll+(hl-ll)/2; // Using this methods to calculate middle element to prevent integer overflow!
            if(m>0 && m<bit_arr.length-1){
                if(bit_arr[m]>bit_arr[m-1] && bit_arr[m]>bit_arr[m+1]){
                    System.out.println(m);
                    return; // Use return instead of break because break ends loop while return ends main method
                }else if(bit_arr[m-1]>bit_arr[m]){
                    hl=m-1;
                }else{
                    ll=m+1;
                }
            }else if(m==0){
                if(bit_arr[m]>bit_arr[m+1]){
                    System.out.println(m);
                    return;
                }else{
                    System.out.println(m+1);
                    return;
                }
            }else if(m==bit_arr.length-1){
                if(bit_arr[m]>bit_arr[m-1]){
                    System.out.println(m);
                    return;
                }else{
                    System.out.println(m-1);
                    return;
                }
            }
        }
    }
}