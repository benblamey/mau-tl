package Ex3_priv_virt_method;

public class Ex3 {

    void foo() {}

    private void privateFoo() {}

    void main() {
        this.foo();
        this.privateFoo();
    }

    public static void main(String args) {
        Ex3 ex3 = new Ex3();
        ex3.main();
    }
}
