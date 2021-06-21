package BT1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solve {
	public static Scanner sc = new Scanner(System.in);
	
	public static void getUniqueNumbers(Map<Integer, Integer> map, int element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } else {
            map.put(element, 1);
        }
    }
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        int [] arr = new int [20];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        //so lan xuat hien cua cac phan tu
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
        	getUniqueNumbers(map, arr[i]);
        }
        System.out.print("cac phan tu xuat hien mot lan la : ");
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
    }
    

}
