import java.util.*;

public class MergePackages {
  public static void main(String[] args) {
    int[] arr = {1, 4, 5, 3};
    int limit = 6;
    System.out.println(Arrays.toString(mergePackages(arr,limit)));
  }

  public static int[] mergePackages(int[] arr, int limit) {
    int[] a;
    //key is weight, val is index
    Map<Integer, Integer> map = new HashMap<>();
    //start complimentIndex at -1
    int complimentIndex = -1;
    for(int i = 0; i < arr.length; i++) {
      if(map.get(limit - arr[i]) == null) complimentIndex = -1;
      else complimentIndex = map.get(limit - arr[i]);
      if(complimentIndex > -1){
        a = new int[] {i, complimentIndex};
        return a;
      }
      else map.put(arr[i], i);
    }
    a = new int[] {-1};
    return a;
  }
}
