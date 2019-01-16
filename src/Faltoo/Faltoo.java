package Faltoo;

import java.util.Arrays;

public class Faltoo {
    int[] list = new int[10];
    
    public static void main(String[] args) {
        Faltoo l1 = new Faltoo();
        System.out.println(Arrays.toString(l1.list));
        l1.insert(42);
        System.out.println(Arrays.toString(l1.list));
        l1.insert(52);
        l1.insert(23);
        l1.insert(25);
        l1.insert(65);
        System.out.println(Arrays.toString(l1.list));
        l1.remove(1);
        System.out.println(Arrays.toString(l1.list));
    }
    
    void insert(int value){
        for (int i = 0; i < list.length; i++) {
            if(list[i] == 0){
                list[i] = value;
                break;
            }
        }
    }

    void remove(int index){
        for (int i = index; i < list.length - 1; i++) {
            list[i] = list[i+1];
        }
        list[list.length - 1] = 0;
    }
}
