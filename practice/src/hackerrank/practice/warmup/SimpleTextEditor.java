package hackerrank.practice.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/one-week-preparation-kit-simple-text-editor
public class SimpleTextEditor {
    public static void main(String[] args) {
        List<String> stateList = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        stateList.add(s.toString());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter op : ");
            String op = scanner.nextLine();
            if(op.equalsIgnoreCase("bye")) {
                break;
            }
            String[] ops = op.split(" ");
            switch (Integer.parseInt(ops[0])) {
                case 1:
                    s.append(ops[1]);
                    stateList.add(s.toString());
                    break;
                case 2:
                    int range = Integer.parseInt(ops[1]);
                    s.delete(s.length()-range, s.length());
                    stateList.add(s.toString());
                    break;
                case 3:
                    System.out.println(s);
                    break;
                case 4:
                    int index = stateList.size() - 2;
                    if(index>=0) {
                        s.delete(0, s.length());
                        s.append(stateList.get(index));
                        stateList.remove(index+1);
                    }
                    break;
            }
        }
    }
}
