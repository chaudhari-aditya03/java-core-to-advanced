package practice.patterns;

public class Square2Pattern {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            char ch ='a';
            for(int j = 1; j <= 5; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
