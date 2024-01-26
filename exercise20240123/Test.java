package exercise20240123;

public class Test {
    public static void main(String[] args) {
        int []array={8,7,2,4,6,5};
        Sort.insertSort(array);
        Sort.display(array);
        System.out.println();
        int []array1={8,7,2,4,6,5};
        Sort.shellSort(array1);
        Sort.display(array1);
        System.out.println();
        int []array2={8,7,2,4,6,5};
        Sort.selectSort2(array2);
        Sort.display(array);
        System.out.println();
        int []array3={8,7,2,4,6,5};
        Sort.heapSort(array3);
        Sort.display(array3);
        System.out.println();
        int []array4={8,7,2,4,6,5};
        Sort.bubbleSort(array4);
        Sort.display(array4);
        System.out.println();
        int []array5={8,7,2,4,6,5};
        Sort.quickSort(array5);
        Sort.display(array5);

        System.out.println();
        int []array6={8,7,2,4,6,5};
        Sort.quickSort(array6);
        Sort.display(array6);
    }
}
