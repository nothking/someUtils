import java.math.BigDecimal;
import java.util.*;

public class SPDBANK {
    public static void main(String[] args){
        System.out.println(3 +"\t" + getResult(8799, 3));
        System.out.println(6 +"\t" + getResult(8799, 6));
        System.out.println(12 +"\t" + getResult(8799, 12));
        System.out.println(18 +"\t" + getResult(8799, 18));
        System.out.println(24 +"\t" + getResult(8799, 24));
    }

    public static BigDecimal getResult(int gold,int months){
        
        Map<Integer,BigDecimal> pers = new HashMap<>(){{
            put(3, new BigDecimal("0.009"));
            put(6, new BigDecimal("0.0078"));
            put(12, new BigDecimal("0.0074"));
            put(18, new BigDecimal("0.0076"));
            put(24, new BigDecimal("0.0076"));
        }};
        
        return pers.get(months).multiply(new BigDecimal(gold+"")).multiply(new BigDecimal(months+""));
    }
}
