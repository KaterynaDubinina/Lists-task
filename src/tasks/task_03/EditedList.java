package tasks.task_03;

import java.util.ArrayList;
import java.util.List;

public class EditedList {

    public static void main(String[] args) {

        System.out.println("\n\u2714\uFE0F Initial List:");
        getOutput(getInitialList());

        System.out.println("\n\u267B\uFE0F Edited list:");
        getOutput(getEditedList(new ArrayList<>(getInitialList())));
    }

    private static List<String> getInitialList() {
        List<String> list = new ArrayList<>();
        list.add("orange \uD83C\uDF4A");
        list.add("grape  \uD83C\uDF47");
        list.add("apple  \uD83C\uDF4F");
        list.add("lemon  \uD83C\uDF4B");
        return list;
    }

    private static List<String> getEditedList(List<String> list) {
        list.add(0, "plum   \uD83D\uDC9C");
        list.add(5, "mango  \uD83E\uDD6D");
        return list;
    }

    private static void getOutput(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ") " + list.get(i));
        }
    }
}
