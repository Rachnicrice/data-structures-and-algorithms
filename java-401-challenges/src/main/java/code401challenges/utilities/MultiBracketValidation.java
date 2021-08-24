package code401challenges.utilities;

import code401challenges.stacksAndQueues.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input) {
        Stack round = new Stack();;
        Stack curly = new Stack();;
        Stack square = new Stack();;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(') {
                if (round.isEmpty()) {
                    round.push("(");
                } else { return false; }
            } else if ( c == '{') {
                if (curly.isEmpty()) {
                    curly.push("{");
                } else { return false; }
            } else if (c == '[') {
                if (square.isEmpty()) {
                    square.push("[");
                } else { return false; }
            } else if (c == ')') {
                if (!round.isEmpty()) {
                    round.pop();
                } else { return false; }
            } else if (c == '}') {
                if (!curly.isEmpty()) {
                    curly.pop();
                } else { return false; }
            } else if (c == ']') {
                if (!square.isEmpty()) {
                    square.pop();
                } else { return false; }
            }
        }

        if (round.isEmpty() && curly.isEmpty() && square.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
