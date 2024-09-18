import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        display("Hello");
        ArrayList<String> list = new ArrayList<>();
        list.add("Mohammed");
        list.add("Ali");
        readList(list);
    }

    public static void display(String mas) {
        System.out.println("message " + mas);
    }

    public static void readList(ArrayList<String> list) {
        int i = 1;
        for(String el : list){
            System.out.println(i + " " + el);
            i ++;
        }
    }

}
