class String_sorting {
    public static void main(String[] args) {
        String[] arr={"bablu","amit","jack","tony","amul"};
        for(String i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=1+i;j<arr.length;j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        for(String i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
