
package staticinitializersexample2;


public class StaticInitializersExample2 {

    {
        System.out.println("this is Constructor1-Running");
    }
    StaticInitializersExample2(){                 // default constructor block will be executed when a class is instantiated. 
        System.out.println("This is no parameter Constructor.");
    }
    StaticInitializersExample2(String a){
        System.out.println("This is One Parameter Constructor");
    }
    StaticInitializersExample2(String a,String b){
        System.out.println("This is Two Parameter Constructor");
    }
    
    {
        System.out.println("This is Constructor2-Running");
    }
    public static void main(String[] args) {
        StaticInitializersExample2 object=new StaticInitializersExample2();
        System.out.println("-----------------------------------------------\n ");
        StaticInitializersExample2 object1=new StaticInitializersExample2("value");
        System.out.println("-----------------------------------------------\n");
        StaticInitializersExample2 object2=new StaticInitializersExample2("value1","value2");
    }
    {
        System.out.println("this is Constructor3-Running");
    }
    
}
