package hackerrank.practice.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

// https://www.hackerrank.com/challenges/one-week-preparation-kit-simple-text-editor
public class SimpleTextEditor {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        StringBuilder s = new StringBuilder();
        stack.push(s.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num of operations : ");
        int ops = Integer.parseInt(scanner.nextLine());

        for(int i=0;i<ops;i++) {
            System.out.print("Enter op : ");
            String op = scanner.nextLine();
            String[] cmd = op.split(" ");
            switch (Integer.parseInt(cmd[0])) {
                case 1:
                    s.append(cmd[1]);
                    stack.push(s.toString());
                    break;
                case 2:
                    int range = Integer.parseInt(cmd[1]);
                    s.delete(s.length()-range, s.length());
                    stack.push(s.toString());
                    break;
                case 3:
                    int ind = Integer.parseInt(cmd[1]);
                    System.out.println(s.charAt(ind-1));
                    break;
                case 4:
                    stack.pop();
                    if(!stack.isEmpty()) {
                        s.delete(0, s.length());
                        s.append(stack.peek());
                    }
                    break;
            }
        }
        scanner.close();
    }
}
