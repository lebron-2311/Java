package exercise20240123;

public class Sort {

    public  static void insertSort(int [] array){
        for(int i=1;i<array.length;i++){
            int tmp=array[i];
            int j=i-1;
            for(;j>=0;j--){
                if(array[j]>tmp){
                    array[j+1]=array[j];
                }else {
                    break;
                }
            }
            array[j+1]=tmp;
        }

    }

    public static void shellSort(int[] array){
        int gap=array.length;
        while (gap>1){
            gap=gap/2;
            shell(array,gap);
        }

    }

    private static void shell(int[] array,int gap){
        for(int i=gap;i<array.length;i++){
            int tmp=array[i];
            int j=i-gap;
            for(;j>=0;j-=gap){
                if(array[j]>tmp){
                    array[j+gap]=array[j];
                }else {
                    break;
                }
            }
            array[j+gap]=tmp;
        }
    }

    public static void selectSort2(int []array){
        int left=0;
        int right=array.length-1;
        while (left<right){
            int minIndex=left;
            int maxIndex=right;
            for (int i=left+1;i<=right;i++){
                if(array[i]<minIndex){
                    i=minIndex;
                }
                if(array[i]>array[maxIndex]){
                    maxIndex=i;
                }
            }
            swap(array,minIndex,maxIndex);
            if(maxIndex == left) {
                maxIndex = minIndex;
            }
            swap(array,maxIndex,right);
            right--;
            left++;
        }
    }
    private static void swap(int []array,int i,int j){
        int tmp=array[j];
        array[j]=array[i];
        array[i]=tmp;
    }
    private static void siftDown(int []array,int parent,int len) {
        int child = (2 * parent) + 1;
        while (child < len) {
            if (child + 1 < len && array[child] < array[child + 1]) {
                child = child + 1;
            }
            if (array[child] > array[parent]) {
                swap(array, child, parent);
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
        }
    }
    private static void createHeap(int []array){
        for(int parent=(array.length-1-1)/2;parent>=0;parent--){
            siftDown(array,parent,array.length);
        }
    }
    public static void heapSort(int []array){
        createHeap(array);
        int end=array.length-1;
        while (end>0){
            swap(array,0,end);
            siftDown(array,0,end);
            end--;
        }
    }

    public static void display(int []array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void bubbleSort(int []array){
        for(int i=0;i<array.length-1;i++){
           boolean flag=false;
           for(int j=0;j<array.length-1-i;j++){
               if(array[j]>array[j+1]){
                   swap(array,j,j+1);
                   flag=true;
               }
           }
           if(flag ==false){
               return;
           }
        }
    }

    public static  void quickSort(int []array){
           quick(array,0,array.length-1);
    }

    private static void quick(int[] array,int start,int end){
        if(start>=end){
            return;
        }

        if(end-start+1<=15){
              insertSort2(array,start,end);
              return;
        }

        int index=middleNum(array,end,start);
        swap(array,index,start);

        int pivot=partition(array,start,end);
        quick(array,start,pivot-1);
        quick(array,pivot+1,end);


    }

    public static void insertSort2(int[] array,int start,int end){
        for (int i=start+1;i<=end;i++){
            int temp=array[i];
            int j=i-1;
            for(;j>=start;j--){
                if(array[j]>temp){
                    array[j+1]=array[j];
                }else {
                    break;
                }
            }
           array[j+1] =temp;
        }
    }

    private static int partition(int[]array,int left,int right ){
        int tmp=array[left];
        while (left<right){
            while (left<right && array[right]>=tmp){
                right--;
            }
            if(left>=right){
                break;
            }
            array[left]=array[right];
            while (left<right && array[left]<=tmp){
                left++;
            }
            if(left>=right){
                break;
            }
            array[right]=array[left];
        }
        array[left]=tmp;
        return left;

    }

    private static int middleNum(int[]array,int left,int right){
        int mid= left+((right-left)>>1);

        if(array[left]<array[right]){
            if(array[mid]>array[right]){
                return right;
            }else if(array[left]>array[mid]){
                return left;
            }else {
                return mid;
            }

        }else {
            if(array[mid] < array[right]) {
                return right;
            }else if(array[mid] > array[left]) {
                return left;
            }else {
                return mid;
            }



        }
    }
    public static void mergeSort(int[] array){
        mergeFunc(array,0,array.length-1);
    }

    private static void mergeFunc(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        int mid=left+((right-left)>>1);
        mergeFunc(array,left,mid);
        mergeFunc(array,mid+1,right);
        merge(array,left,mid,right);
    }


    private static void merge(int[] array,int left,int mid,int right){
        int s1=left;
        int e1=mid;
        int s2=mid+1;
        int e2=right;
        int []tmpArr=new int[right-left+1];
        int k=0;
        while (s1<=e1 && s2<=e2){
            if(array[s1]<=array[s2]){
                tmpArr[k++]=array[s1++];
            }else {
                tmpArr[k++]=array[s2++];
            }
        }
        while (s1 <= e1){
            tmpArr[k++]=array[s1++];
        }
        while (s2<=e2){
            tmpArr[k++]=array[s2++];
        }
        for(int i=0;i<k;i++){
            array[i+left]=tmpArr[i];
        }
   }



}
