// remove all the duplicates from the string
class Recusrion{
    public static String s2="";
    public static int checking(String s2,char s,int l,int count) {
        int value=0;
        if(l==s2.length()){
            return 1;
        }
        if(s2.charAt(l)!=s){
           count++;
           value=checking(s2, s, l+1,count);
        }
        if(value==1){
            return 1;
        }else{
            return 0;
        }
    }
    public static void duplicates(String s,int len) {
        if(len==s.length()){
            System.out.println("Recursion "+s2);
            return;
        }
        if(len==0){
            s2+=s.charAt(len);
        }else{
            int value=checking(s2,s.charAt(len),0,0);
            if(value==1){
                s2+=s.charAt(len);
            }
        }
        duplicates(s, len+1);
    }
    public static void function(String s1,String s2) {
        s2+=s1.charAt(0);
        for(int i=1;i<s1.length() ;i++){
            int count=0;
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)!=s2.charAt(j)){
                    count++;
                }
                if(count==s2.length()){
                    s2+=s1.charAt(i);
                }
            }
        }
        System.out.println("Function  "+s2);
    }
   public static void main(String[] args) {
        // duplicates("aale",0);
        String s1="eexxtrraa";
        String s2="";
        function(s1, s2);
        duplicates(s1, 0);
    }
}