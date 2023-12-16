package tasks.task_02;

import java.util.ArrayList;
import java.util.List;

public class ListPart {

    public static void main(String[] args) {

        System.out.println("\n\u2714\uFE0F Initial List:");
        getOutput(getInitialList());

        System.out.println("\n\u267B\uFE0F List part:");
        getOutput(getListPart(new ArrayList<>(getInitialList())));
    }

    private static List<String> getInitialList() {
        List<String> list = new ArrayList<>();
        list.add("orange \uD83C\uDF4A");
        list.add("mango  \uD83E\uDD6D");
        list.add("banana \uD83C\uDF4C");
        list.add("apple  \uD83C\uDF4F");
        list.add("kiwi   \uD83E\uDD5D");
        list.add("cherry \uD83C\uDF52");
        return list;
    }

    private static List<String> getListPart(List<String> list) {
        list.remove("orange \uD83C\uDF4A");
        list.remove("apple  \uD83C\uDF4F");
        list.remove("kiwi   \uD83E\uDD5D");
        list.remove("cherry \uD83C\uDF52");
        return list;
    }

    private static void getOutput(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ") " + list.get(i));
        }
    }
}
