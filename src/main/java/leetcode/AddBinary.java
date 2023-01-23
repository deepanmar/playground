package leetcode;

public class AddBinary {

    public static void main(String[] args){
        AddBinary ab = new AddBinary();
        System.out.println(ab.addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (i >= 0 || j >= 0){
            sum = sum / 2;
            if (i >= 0) {
                sum = sum + a.charAt(i) - '0';
                i--;
            }
            if (j >= 0){
                sum = sum + b.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
        }
        if(sum / 2 != 0) sb.append(1);
        return sb.reverse().toString();
    }
}
