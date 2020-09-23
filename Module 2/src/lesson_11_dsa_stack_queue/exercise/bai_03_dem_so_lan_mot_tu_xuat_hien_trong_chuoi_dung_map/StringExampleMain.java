package lesson_11_dsa_stack_queue.exercise.bai_03_dem_so_lan_mot_tu_xuat_hien_trong_chuoi_dung_map;
import java.util.TreeMap;

public class StringExampleMain {
    public static void main(String[] args) {
        String string = "Thiếu tự tin vào năng lực lập trình của mình? " +
                "Học đã vài năm mà vẫn chưa làm được sản phẩm nào xứng đáng? " +
                "Chán nản vì chương trình học hiện tại quá lí thuyết và mơ hồ? " +
                "Chán nản vì đang phải học những thứ khác xa với thực tế? " +
                "Đang cố tự học lập trình nhưng không biết bắt đầu từ đâu? " +
                "Lo lắng không biết liệu mình có đủ năng lực để đi làm hay không? " +
                "Có ý định bỏ học lập trình vì thấy mông lung quá? " +
                "Đã thử đi xin thực tập ở một vài nơi nhưng đều không ổn? " +
                "Lo lắng cho việc phát triển bền vững của tương lai sau này?" ;
        String[] arrays = string.split("\\s");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String temp;
        int count;
        for (String elements : arrays) {
            temp = elements.toUpperCase();
            if (treeMap.containsKey(temp)) {
                count = treeMap.get(temp);
                treeMap.put(temp, count + 1);
            } else treeMap.put(temp, 1);
        }
        System.out.println(treeMap);
    }
}
