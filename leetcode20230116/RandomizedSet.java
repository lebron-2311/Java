package leetcode20230116;

public class RandomizedSet {
    public int elem[];
    int n=elem.length;
    public RandomizedSet() {

    }

    public boolean insert(int val) {
        for(int i=0;i<n;i++){
            if(elem[i]==val){
                return false;
            }
        }
        n++;
        elem[n-1]=val;
        return true;
    }

    public boolean remove(int val) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (elem[i] == val) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false; // Value doesn't exist, return false
        }
        // Shift elements to the left to remove the value
        for (int j = index; j < n - 1; j++) {
            elem[j] = elem[j + 1];
        }
        n--;
        return true;
    }

   /* public int getRandom() {

    }*/
}
