package day_11;

public class BookAllocation {
    public static void main(String args[]) {
        int arr[] = {10,20,30,40};
        int nos = 2;

        System.out.println(minMaxPages(arr,nos));
    }

    public static int minMaxPages(int page[], int nos) {
        int low = 0;
        int high = 0;
        for(int i = 0; i<page.length;i++) {
            high += page[i];
        }

        int ans = 0;

        while(low <= high) {
            int mid = (low+high)/2;
            if(isItPossible(page,nos,mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }


    public static boolean isItPossible(int page[], int nos, int mid) {
        int readPage=0;
        int student = 1;

        for(int i = 0; i < page.length;i++) {
            if(readPage+page[i] <= mid) {
                readPage += page[i];
            } else {
                student++;
                readPage = page[i];
            }

            if(student > nos) {
                return false;
            }
        }
        return true;
    }
}
