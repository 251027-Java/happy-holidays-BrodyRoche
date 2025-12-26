/**
 * Holiday ASCII Art Generator
 * 
 * Your task: Create a festive Christmas tree using ASCII characters!
 * 
 * Basic tree structure:
 * * <- Star on top
 * *** <- Tree branches (odd numbers of *)
 * *****
 * *******
 * ||| <- Trunk
 */
public class HolidayArt {

    public static void main(String[] args) {
        int height = args.length > 0 ? Integer.parseInt(args[0]) : 5;
        printTree(height);
    }

    public static void printTree(int height) {
        StringBuilder tree = new StringBuilder();
        int maxWidth = Math.max(3, height * 2 - 1);
        for(int i = 0; i < height; i++) {
            int stars = i * 2 + 1;
            int spaces = (maxWidth - stars) / 2;
            if(i == 0) tree.append(" ".repeat(spaces)).append("\u001B[33m★").append("\n");
            else tree.append(" ".repeat(spaces)).append("\u001B[32m*".repeat(stars)).append("\n");
        }
        tree.append(" ".repeat(maxWidth/2-1)).append("\u001B[38;5;130m|||").append("\n\n\u001B[0mHappy Holidays!\n");
        System.out.println(tree.toString());
    }
}
