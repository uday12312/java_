public class towerOfHanoi{
    public static void move(String s,String h,String d,int n,int count) {
        if(n==1){
            count++;
            System.out.println("Transfer disk "+n+" from "+s+" to "+d);
            System.out.println("Total steps are "+count);
            return;
        }
        move(s, d, h, n-1,count);
        count++;
        System.out.println("Transfer disk "+n+" from "+s+" to "+d);
        move(h, s, d, n-1,count);
    }
    public static void main(String[] args) {
        move("Source","Helper","Destination",3,0);
    }
}