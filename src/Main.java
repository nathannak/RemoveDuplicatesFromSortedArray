public class Main {

    public static void main(String[] args) {

        System.out.println( removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}) );
    }

//    method-1
//    public static int removeDuplicates(int[] A) {
//        if (A.length==0) return 0;
//        int j=0;
//        for (int i=0; i<A.length; i++)
//            if (A[i]!=A[j]) A[++j]=A[i];
//        return ++j;
//    }

//  method-2
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int i = 0;
        nums[i++] = nums[0];
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[j-1]){
                nums[i++] = nums[j];
            }
        }
        return i;
    }

}
