// ---------------------- Bianary search to find the element(Sorted array) --------------------- //
// class Day_14_Code {

//     static int BinarySearch(int[] arr, int target) {
//         int l = 0;
//         int r = arr.length - 1;

//         while (l <= r) {
//             int mid = l + (r - l) / 2;

//             if (arr[mid] == target) {
//                 return mid;
//             } else if (arr[mid] < target) {
//                 l = mid + 1;
//             } else {
//                 r = mid - 1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = {5, 8, 11, 14, 16};
//         int target = 14;
//         System.out.println(BinarySearch(arr, target));
//     }
// }



// ---------------------- Bianary search to find the element(UnSorted array) --------------------- //
class Day_14_Code {

    static int BinarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[l] <= arr[mid]) {
                if (arr[l] <= target && target < arr[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            else {
                if (arr[mid] < target && target <= arr[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 4, 5, 6};
        int target = 7;
        System.out.println(BinarySearch(arr, target)); 
    }
}

