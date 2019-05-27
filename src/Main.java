import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int n=scan.nextInt();
            int m=scan.nextInt();
            Good[]goods=new Good[m];
            for(int i=0;i<m;i++){
                Good tem=new Good();
                tem.later=scan.nextInt();
                tem.former=scan.nextInt();
                goods[i]=tem;
            }
            if(get(n,m,goods)==false){
                System.out.println("None");
            }
        }
    }
    public static boolean get(int n,int m,Good[]goods){
        boolean flag=false;
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<n;i++){
            map.put(i,-999);
        }
        map.put(goods[0].former,0);
        map.put(goods[0].later,1);
        boolean ans=true;
        while (flag==false){
            flag=true;
            for(int i=1;i<m;i++){
                Good tem=goods[i];
                int later=tem.later;
                int former=tem.former;
                if(map.get(later)!=-999&&map.get(former)==-999){
                    map.put(former,map.get(later)-1);
                    flag=false;
                } else if(map.get(later)==-999&&map.get(former)!=-999){
                    map.put(later,map.get(former)+1);
                    flag=false;
                }else if (map.get(later)!=-999&&map.get(former)!=-999){
                    if(map.get(former)>map.get(later)) {
                        ans = false;
                        return ans;
                    }
                }
            }
        }
        sortbyvalue(map);
        return true;
    }
    public static List<Map.Entry<Integer,Integer>> sortbyvalue(Map<Integer,Integer>map){
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
        {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
            {
                int result=o1.getValue()-o2.getValue();
                if(result<0)
                    result=-1;
                else if(result>0)
                    result=1;
                else
                    result=0;
                return result;
            }
        });
        System.out.print(list.get(0).getKey());
        for(int i=1;i<list.size();i++){
            System.out.print(","+list.get(i).getKey());
        }
        System.out.println();
        return list;
    }
}
class Good{
    int later;
    int former;
}
