import java.util.Scanner; 
class wordReverse{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a word to reverse: ");
        String word = scan.nextLine();
        myMethod(word);
        scan.close();
    }
    public static void myMethod(String word){
        String reverseWord = "";
        for(int i = 0; i < word.length(); i++){
            reverseWord = word.charAt(i) + reverseWord;
        }
        System.out.println(reverseWord);
    }
}