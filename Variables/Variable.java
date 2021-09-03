public class Variable
{
    // static variable
    static int var = 10;

    // global variable
    int var4 = 20;

    void show()
    {
        // local variable
        int var2 = 20;
        System.out.println(var2);

    }

    public static void main(String[] args)
    {
        Variable obj = new Variable();

        obj.show();

        // local variable
        int var3 = 10;

        System.out.println(var);
        System.out.println(var3);
        System.out.println(obj.var4);

    }
}
