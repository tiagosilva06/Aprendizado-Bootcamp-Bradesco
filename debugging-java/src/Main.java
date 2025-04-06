public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciou o programa no metodo Main");
        a();
        System.out.println("Finalizou o programa no método Main");
    }

    static void a () {
        System.out.println("Entrou no metodo a");
        b();
        System.out.println("Finalizou o método a");
    }

    static void b () {
        System.out.println("Entrou no método b");
        for (int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método b");   
    }

    static void c () {
        System.out.println("Entrou no metodo c");
        //Thread.dumpStack();
        System.out.println("Finalizou o metodo c");
    }
}
