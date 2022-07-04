import java.util.*;
import java.util.stream.*;
public class Mode {
	  static void mode(int [][] grades) {
	 String spc = " ";
    HashMap<Integer , Integer> map = new HashMap();
    for (int i = 0; i < grades.length; i++) {
        for (int j = 0; j < grades[i].length; j++) {
            int temp = grades[i][j];
            if(map.get(temp)==null){
                map.put(grades[i][j],1);
            }else {
                int temp2 = (int) map.get(temp);
                map.put(grades[i][j],++temp2);
            }
        }
    }
    Object[] objects = map.values().stream().sorted().toArray();
    Stream stream = map.entrySet().stream().filter(val -> val.getValue().equals(objects[objects.length-1]));
    stream.forEach(System.out::println);
}
	public static void main(String[] args) {
		int num [] [] = {
			{1,2,2},
			{3,6,6},
			{90,90,80,87,86,86}
		};
		mode(num);
	} 
}