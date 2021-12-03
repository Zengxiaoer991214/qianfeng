package month11.day24;

import java.util.*;

/**
 * ClassName: Country
 * Description:
 * date: 2021/11/24 10:07
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Country {
    public static void main(String[] args) {

        HashSet<String> countries = new HashSet<String>(){{
            add("China");
            add("usa");
            add("russia");
            add("france");
            add("japan");
            add("ukl");
            add("aus");
        }};
        Iterator<String> iterator = countries.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();
            if(s.contains("u")){
                iterator.remove();
            }
        }
        System.out.println(countries);


        ArrayList<String> countries2 = new ArrayList<String>(){{
            add("China");
            add("usa");
            add("russia");
            add("france");
            add("japan");
            add("ukl");
            add("aus");
        }};
        ListIterator<String> iterator2 = countries2.listIterator(countries2.size());
        while (iterator2.hasPrevious()){
            System.out.println(iterator2.previous()+"=");
        }
//        System.out.println(countries2);


        /*String[] ss= new String[10];
        int i=0;
        for (String s:countries){
            if(s.contains("u")){
               ss[i++]=s;
            }
        }
        for(String str:ss){
            countries.remove(str);
        }
        System.out.println(countries);*/
    }
}
