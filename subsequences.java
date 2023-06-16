class Subsequences{
    public static void Recursion(String s,String s2,int agree) {
        if(agree==1){
            
        }
    }
    public static void function(String s) {
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String s2="";
                for(int k=i;k<=j;k++){
                    s2+=s.charAt(k);
                }
                System.out.println(s2);
            }
        }
    }
    public static void main(String[] args) {
        // function("abcd");
        String s="abc";
        Recursion(s,"",1);
    }
}