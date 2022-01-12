import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class tteest {
    /**
     * @program: CS-Notes
     * @description: test
     * @author: Log1c
     * @create: 2021-12-22 16:31
     **/

//    public static void changeString(String s){
//        s += "4";
//    }

    class TroopItem{
        //
        int id;
        // 兵种类型
        int type;
        // 兵种等级：1～4
        int level;
        // 装载值：随等级提高--装载资源res
        int load;
        // 战力值：随等级提高
        int force;
        // 拥有的数量
        int own_num;
        // 选择的数量
        int select_num;
    }

    public static List<TroopItem> QuickSelectTroopList(int res_max, int march_size_max, List<TroopItem> own_troop_list){
        List<TroopItem> TroopList = new LinkedList<TroopItem>();
        // 暂存数据
        int res = res_max;
        int size = march_size_max;
        // 对已有兵种列表进行遍历
        for(TroopItem troopItem : own_troop_list){
            // 判断资源数是否剩余以及是否仍有出兵的空间
            if(res>0 && size>0){
                // 计算每一兵种的总载重量
                int troopLoad = troopItem.load * troopItem.own_num;
                // 判断是否可以全体出动
                if(troopLoad <= res && size >= troopItem.own_num){
                    // 全部出动
                    troopItem.select_num = troopItem.own_num;
                    TroopList.add(troopItem);
                    // 计算剩余资源以及出兵量
                    res -= troopLoad;
                    size -= troopItem.own_num;
                }else if(troopLoad > res){
                    // 总载重大于资源量，计算需要出动多少兵力带回，向上取整
                    int select_num = (int)Math.ceil(res/troopItem.load);
                    // 判断此时出兵是否满足兵力限制
                    if(select_num > size){
                        // 如果说选择的数量大于限制，那么就只去size那么多人
                        troopItem.select_num = size;
                        TroopList.add(troopItem);
                        size = 0;
                        res -= troopItem.load * size;
                    }else{
                        // 满足的话 就直接去算出来的这么多人
                        troopItem.select_num = select_num;
                        TroopList.add(troopItem);
                        size -= select_num;
                        res -= troopItem.load*select_num;
                    }
                }else if(size < troopItem.own_num){
                    // 当出兵限制不够了 先判断能不能拉完
                    int loadMax = size * troopItem.load;
                    if(loadMax > res){
                        // 拉多了 明显要减少人 计算要多少人够拉剩下的资源
                        int select_num = (int)Math.ceil(res/troopItem.load);
                        troopItem.select_num = select_num;
                        TroopList.add(troopItem);
                        size -= select_num;
                        res -= troopItem.load * select_num;
                    }else{
                        // 没拉多，就是拉不完 直接去size那么多人
                        troopItem.select_num = size;
                        TroopList.add(troopItem);
                        size = 0;
                        res -= troopItem.load * size;
                    }
                }
            }else{
                // 其中一个条件不满足，直接返回
                break;
            }
        }
        return TroopList;
    }

    public static void main(String[] args) {
//        String s = "123";
//        String t = "345";
//        s = t;
//        System.out.println(s);
//
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        System.out.println(map.put(1, 1));
//        System.out.println(map.put(1, 2));
    }
}
