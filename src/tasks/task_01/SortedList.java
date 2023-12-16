package tasks.task_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {

    public static void main(String[] args) {

        System.out.println("\n\u2714\uFE0F Initial List:");
        getOutput(getInitialList());

        System.out.println("\n\u267B\uFE0F Sorted List:");
        getOutput(getSortedList(new ArrayList<>(getInitialList())));
    }

    private static List<String> getInitialList() {
        List<String> list = new ArrayList<>();
        list.add("John   \uD83E\uDDD4");
        list.add("Alice  \uD83D\uDC67");
        list.add("Robert \uD83D\uDC68");
        list.add("Lisa   \uD83D\uDC69");
        list.add("David  \uD83D\uDC74");
        list.add("Amanda \uD83D\uDC75");
        return list;
    }

    private static List<String> getSortedList(List<String> list) {
        Collections.sort(list);
        return list;
    }

    private static void getOutput(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ") " + list.get(i));
        }
    }
}
