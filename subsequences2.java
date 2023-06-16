public class subsequences2{
    public static void function(String s) {
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<s.length();j++){
                String s2="";
                s2+=s.charAt(j);
                for(int k=j+1;k<i;k++){
                    s2+=s.charAt(k);
                }
                System.out.println(s2);
            }
        }
    }
    public static void main(String[] args) {
        String s="abc";
        function(s);
    }
}