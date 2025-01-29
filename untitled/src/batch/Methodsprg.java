package batch;

public class Methodsprg {
    public static void main(String[] args) {
        Methodsprg ob=new Methodsprg();
        ob.disp();//without retuntype and arguments
        int c= ob.add();//with returntype and without arguments
        System.out.println("add ; "+c);
        ob.sub(2,1);//without return type and with arguments
       int d= ob.mul(2,3);//with return type and with arguments
        System.out.println("mul :"+d);
    }
    public void disp(){
        System.out.println("hi");
    }
    public int add(){
        return 1+2;
    }
    public void sub(int a, int b){
        System.out.println("sub : ");
        System.out.println(a-b);
    }
    public int mul(int a,int b){
        return a*b;
    }
}
