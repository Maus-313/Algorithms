class Merge_Sort {
    int[] array;
    int[] tempMergeArr;
    int length;

    public static void main(String[] args) {
        int[] inputArr={48,36,13,52,19,94,21};
        for(int i:inputArr){
            System.out.print(i+" ");
        }
        System.out.println();
        Merge_Sort ms=new Merge_Sort();
        ms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i+" ");
        }
    }

    public void sort(int[] inputArr){
        this.array=inputArr;
        this.length=inputArr.length;
        this.tempMergeArr=new int[length];
        divideArray(0,length-1);
    }

    public void divideArray(int lowerIndex,int higherIndex){
        if(lowerIndex<higherIndex){
            int middle=lowerIndex+(higherIndex-lowerIndex)/2; // Important formula to get mid. It helps prevent integer overflow

            // this will sort the left side of an array
            divideArray(lowerIndex, middle);

            // this will sort the ride side of an array
            divideArray(middle+1, higherIndex);
            
            mergeArray(lowerIndex, middle, higherIndex);
        }
    }

    public void mergeArray(int lowerIndex,int middle,int higherIndex){
        for(int i=lowerIndex;i<=higherIndex;i++){
            tempMergeArr[i]=array[i];
        }

        int i=lowerIndex;
        int j=middle+1;
        int k=lowerIndex;
        while(i<=middle && j<=higherIndex){
            if(tempMergeArr[i]<=tempMergeArr[j]){
                array[k]=tempMergeArr[i];
                i++;
            }else{
                array[k]=tempMergeArr[j];
                j++;
            }
            k++;
        }
        while(i<=middle){
            array[k]=tempMergeArr[i];
            k++;
            i++;
        }

    }
}