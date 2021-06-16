package acwing.蓝桥杯._11届蓝桥杯国赛;

import java.util.HashSet;

/**
 * @author: yeah
 * f[i] 表示以i结尾的上升子序列个数
 * f[i] for(int j=0;j<i;j++) if()
 */
public class D本质上升序列 {
    static int[] f = new int[250];
    static HashSet<String>[] sets = new HashSet[250];
    static HashSet<String> ss = new HashSet<>();

    public static void main(String[] args) {
//        String str="tocyjkdzcieoiodfpbgcncsrjbhmugdnojjddhllnofawllbhf" +
//                "iadgdcdjstemphmnjihecoapdjjrprrqnhgccevdarufmliqij" +
//                "gihhfgdcmxvicfauachlifhafpdccfseflcdgjncadfclvfmad" +
//                "vrnaaahahndsikzssoywakgnfjjaihtniptwoulxbaeqkqhfwl";
//        int n=str.length();
//        for(int i=0;i<n;i++){
//            sets[i]=new HashSet<>();
//            sets[i].add(str.charAt(i)+"");
//            for(int j=0;j<i;j++){
//                if(str.charAt(i)> str.charAt(j)){
//                    for(String s:sets[j]){
//                        sets[i].add(s+str.charAt(i));
//                    }
//                }
//            }
//        }
//        long res=0;
//        for(int i=0;i<n;i++){
//            for(String s:sets[i]){
//                ss.add(s);
//            }
//        }
//        System.out.println(ss.size());
        System.out.println(3616159);

    }

}
