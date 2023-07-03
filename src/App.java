class A{
    int i =10;
    void lakukanSesuatu(){
        i-=1;
        System.out.println("Nilai i = "+i);
    }
}

interface B{
    public void doB();
}
interface C extends B{
    public void doC();
}

public class App {
    public static void main(String[] args) throws Exception {
        A a = new A(){
            void lakukanSesuatu(){
                i+=1;
                System.out.println("Nilai i = "+i);
            }
        };
        a.lakukanSesuatu();
        C c = new C(){
            public void doB(){
                System.out.println("Cetak Nilai B");
            }
            public void doC(){
                System.out.println("Cetak Nilai C");
            }
        };
        c.doB();
        c.doC();
    }
}
