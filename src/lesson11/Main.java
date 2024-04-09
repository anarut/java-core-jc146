package lesson11;

public class Main {

    public static void main(String[] args) {
        String text = ("In mathematics and computer science, an algorithm is a finite sequence of rigorous instructions, typically used to solve a class of specific problems or to perform a computation.");
        System.out.println(text);
        String[] Slovechki = text.split("\\s+");
        String max = "";
        String min = "";
        int maxn = 0;
        int minn = Slovechki[0].length();
        for (String word : Slovechki){
            if(word.length() > maxn){
                maxn = word.length();
                max = word;
            }
            if(word.length() <= minn){
                minn = word.length();
                min = word;
            }
        }
        String[] sravnenie = text.split(" ");
        for(int i = 0;i < sravnenie.length;i++){
            if(sravnenie[i].equals(max)){
                sravnenie[i] = min;
            } else if(sravnenie[i].equals(min)){      //equals был подсмотрен в интеренатах
                sravnenie[i] = max;
            }
        }
        text = String.join(" ",sravnenie);
        System.out.println(text);
    }
}
