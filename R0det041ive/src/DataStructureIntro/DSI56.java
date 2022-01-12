package DataStructureIntro;

import java.util.HashMap;
import java.util.Set;

public class DSI56 {
    /**
     * @program: R0det041ive
     * @description: 合并区间
     * @author: Log1c
     * @create: 2021-12-20 19:58
     **/

//    public static int[][] merge(int[][] intervals) {
//        Set<>
//    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
//        intervals = merge(intervals);
        for(int[] i:intervals){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
