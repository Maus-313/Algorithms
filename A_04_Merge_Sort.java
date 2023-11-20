import edu.princeton.cs.algs4.Stopwatch;

// Didi's Code 
class MergeSort{
    // time complexity is O(nlog(n))

    // O(log(n))
    static void divide(int[] arr,int si,int ei){// si starting index and ei ending index
        if(si>=ei){// Base case
            return;
        }
        // mid=(si+ei)/2; cause space issue i.e if adding si and ei result in somthing bigger then the limit of int.
        int mid=si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,si,mid,ei);
    }

    // O(n)
    static void conquer(int[] arr,int si,int mid,int ei){
        int[] merged_arr=new int[ei-si+1];
        int index1=si;
        int index2=mid+1;
        int x=0;
        while(index1<=mid && index2<=ei){
            if(arr[index1]<=arr[index2]){
                merged_arr[x++]=arr[index1++];
                // x++;index1++;
            }else{
                merged_arr[x++]=arr[index2++];
            }
        }
        // this is for the remaing element in either of the two divided array when the other array become empty
        while(index1<=mid){ 
            merged_arr[x++]=arr[index1++];
        }
        while(index2<=ei){
            merged_arr[x++]=arr[index2++];
        }
        // now copying the merged array to the original array
        for(int i=0,j=si;i<merged_arr.length;i++,j++){
            arr[j]=merged_arr[i];
        }
    }
}

// deepak's code
class Merge_Sort {
    int[] array;
    int[] tempMergeArr;
    int length;

    

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

class A_04_Merge_Sort{
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        // int[] inputArr={48,36,13,52,19,94,21};
        // Adding a massive arr for test purpose 
        int[] inputArr = {0, -45, 32, -12, 7};
        // for(int i:inputArr){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // Merge_Sort m_s=new Merge_Sort();
        // m_s.sort(inputArr);
        // for(int i:inputArr){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // double time = stopwatch.elapsedTime();

        // calling didi's class
        MergeSort ms=new MergeSort();
        ms.divide(inputArr, 0, inputArr.length-1);
        for(int i=0;i<inputArr.length;i++){
            System.out.print(inputArr[i]+" ");
        }
        System.out.println();

        // System.out.println("Time taken: "+time);
    }
}