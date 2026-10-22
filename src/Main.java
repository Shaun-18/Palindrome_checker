//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
String word = "22";
String reversed = "";

for(int i = 0; i < word.length(); i++){
reversed = word.charAt(i) + reversed;
}
    if(word.equals(reversed)){
        System.out.println("This is a palindrome");
    } else {
        System.out.println("Sorry this is not a palindrome try again");
    }




}
