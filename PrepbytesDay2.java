public class PrepbytesDay2 {
    public static void main(String[] args) {
        byte c = 1; //1 byte
        System.out.println(c);

        short d = 34;   // 2 byte
        System.out.println(d);

        int a = 10; // A non- static variable
        a = 20;     // 4 bytes
        a = 30;
        System.out.println(a);

        long b = 60037115577L; // 8 bytes
        System.out.println(b);  //

        float f = 3.14F;        // 4 bytes
        System.out.println(f);

        double g = 3.14162323425;   // 8 bytes
        System.out.println(g);

        char m;
        m = 'a';        // 2 bytes
        System.out.println(m);

        boolean z = true;       // 1 byte
        System.out.println(z);
    }
}

// Java is statically type and Python is Dynamically typed