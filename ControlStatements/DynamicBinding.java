// OOPS 
// Polmorphism
// Dynamic Binding


public class DynamicBinding {
    
class Test{
    void show(int a, long d){
        System.out.println("show-1");
    }
    void show(lond d, int a){
        System.out.println("show-2");

    }
}


public class DynamicBinding {

    public static void main(String[] args){
        Test t=new Test();

        t.show(200, 100l);
        t.show(200l, 100);

        System.out.println("abc");
        System.out.println("123");

    }
    
}

    
}
