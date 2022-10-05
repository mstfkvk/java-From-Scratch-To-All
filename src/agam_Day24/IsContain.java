package agam_Day24;

public class IsContain {
    public static void main(String[] args) {
        System.out.println(contains(new int[]{1,2,3,4,5,6,7},-1));
    }

    public static boolean contains(int[] arr, int par) {

        boolean b = false;
        for (int i : arr) {
            if (i != par) {
                continue;
            }
            b = true;
            break;
        }
        return b;
    }

}
/*9. Create a method named contains that passes one integer array and one integer parameters,
the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false*/