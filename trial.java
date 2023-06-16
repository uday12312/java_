class FirstProgram{
    public static boolean trying() {
        int i=123;
        String s=String.valueOf(i);
        // int l=s.length();
        StringBuilder ss=new StringBuilder();
        StringBuilder sb= new StringBuilder();
        sb.append(s.charAt(0));
        sb.append(s.charAt(1));
        sb.append(s.charAt(2));
        ss.append(s.charAt(0));
        ss.append(s.charAt(1));
        ss.append(s.charAt(2));
        System.out.println(sb);
        if(sb.compareTo(ss)==0){
            return true;
        }else{
            return false;
        }
    }
    public static int[] conversion(int num){
        StringBuilder newbyte=new StringBuilder("");
        StringBuilder bytee=new StringBuilder("");
        int r=0;
        if(num==0){
            bytee.append("0");
        }else if(num==1){
            bytee.append("1");
        }else{
            while(num>1){
                r=num%2;
                num=num/2;
                newbyte.append(String.valueOf(r));
                if(num==0 || num==1){
                    newbyte.append(String.valueOf(num));
                }
            }
            for(int i=newbyte.length()-1;i>=0;i--){
                bytee.append(newbyte.charAt(i));
            }
        }
        String sbytee=bytee.toString();
        int ibytee=Integer.valueOf(sbytee);
        int len=bytee.length();
        // StringBuilder[] array=new StringBuilder[len];
        // array.add
        int[] arr=new int[2];
        arr[0]=len;
        arr[1]=ibytee;
        System.out.println("Length"+len);
        System.out.println("Bytee"+ibytee);
        return arr;
    }
 
    public static void update(int num,int len){
        StringBuilder reversed=new StringBuilder("");
        for(int i=0;i<len;i++){
            int pos=i;
            int bitmaskk=1<<pos;
            System.out.println("Bitmaskk"+bitmaskk);
            if((bitmaskk & num)==0){
                System.out.println("Set");
                 int a=set(num, bitmaskk,i);
                 String aa=String.valueOf(a);
                 System.out.println("aa"+aa);
                 char value=aa.charAt(len-i-1);
                 System.out.println("value"+value);
                 reversed.append(aa);
            }else{
                System.out.println("Clear");
                int a=clear(num, bitmaskk,i);
                String aa=String.valueOf(a);
                System.out.println("aa"+aa);
                char value=aa.charAt(len-i-1);
                System.out.println("value"+value);
                reversed.append(aa);
           }
        }
        System.out.println("Reversed"+reversed);
       
    }
 
    public static int clear(int num,int bitmask,int i){
        int tempbyte=~bitmask;
        int newbyte=tempbyte & num; 
        // System.out.println("New Byte is "+newbyte);
        int[] resultarr=conversion(newbyte);
        int result=resultarr[1];
        System.out.println("Clear result"+result);
        return result;
    }
 
    public static int set(int num,int bitmask,int i){
    int newbyte=bitmask | num;
    // System.out.println("New Byte is "+newbyte);
    int[] resultarr=conversion(newbyte);
    int result=resultarr[1];
    System.out.println("Set result"+result);
    return result;
    }
 
    public static void get(int num,int bitmask){
        if (( bitmask & num)==0) {
            System.out.println("Bit is zero");
        }else{
            System.out.println("Bit is one");
        }
    }
    public static void main(String args[]) {
        // int num=4;//0101
        // // int pos=0;
        // // int bitmask=1<<pos;
        // int[] arr=conversion(num);
        // int len=arr[0];
        // // int len=arr[0];
        // // System.out.println(len);
        // update(num, len);
        trying();
    }
}