//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    LongestSubstring sub =  new LongestSubstring();

    Scanner sc = new Scanner(System.in);
    IO.print("Enter string: ");
    String s = sc.nextLine();

    Substring substring = sub.longestUniqueSubstring(s);
    IO.println("\nLongest unique substring: " + substring.substring());
    IO.println("Longest unique substring length: " + substring.length());
}