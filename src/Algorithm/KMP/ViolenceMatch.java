package Algorithm.KMP;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/9/8 20:15
 * @uesr 刘梹晨
 */
public class ViolenceMatch {
    public static void main(String[] args) {
        String st1 = "夜猫子夜夜猫子猫猫子夜夜猫子";
        String st2 = "子猫猫子夜";
        int index = violenceMatch(st1, st2);
        System.out.println("index = " + index);
    }
    static int violenceMatch(String Str1, String Str2){
        char[] S1 = Str1.toCharArray();
        char[] S2 = Str2.toCharArray();

        int S1len = S1.length;
        int S2len = S2.length;

        int i = 0;
        int j = 0;
        while(i < S1len && j < S2len){
            if(S1[i] == S2[j]){
                i++;
                j++;
            }else{
                i = i - j + 1;
                j = 0;
            }
        }if(j == S2len){
            return i - j;
        }else{
            return -1;
        }
    }
}
