public class backtracking {
    public static void nextperm(String str,String perm,int index) {
        if(str.length()==0){
            System.out.println(perm);
            System.out.println("New");
            return;
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            nextperm(newstr, perm+c, index+1);
        }
    }
    public static void main(String[] args) {
        String s="ABC";
        nextperm(s,"",0);
    }
}