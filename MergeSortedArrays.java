

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j =0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j] && (i<m && nums1[i]==0)){
                    i++;
            }
            else{
                for(int k=nums1.length-1; k>i; k--){
                    nums1[k] = nums1[k-1];
                }
                nums1[i] = nums2[j];
                i++;
                j++;
            }
        }
        
    }

    public static void mergeArrays(int[] nums1, int m, int[] nums2, int n){
        for(int j = 0; j<nums2.length; j++){
            nums1[m+j]= nums2[j];
        }
        boolean swapped;
        for(int i = 0; i<nums1.length; i++){
            swapped = false;
            for(int j = 1; j<=nums1.length-1-i; j++){
                if(nums1[j] < nums1[j-1]){
                    int t = nums1[j];
                    nums1[j]=nums1[j-1];
                    nums1[j-1] = t;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
    public static void main(String[] args){
        //merge(new int[] {-1,0,0,3,3,3,0,0,0}, 6, new int[]{1,2,2}, 3);
        mergeArrays(new int[] {2, 0}, 1, new int[]{1}, 1);
    }
}
