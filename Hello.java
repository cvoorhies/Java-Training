class Hello {
    public static void main(String a[]) {
        double num = 5.5679;
        float num2 = 5.6f; // the f at the end is needed to make it a float value.
        System.out.println("Hello World");
        System.out.println(num);
        System.out.println(num2);

        for (int i = 0; i == 10; i++) {
            num2 += 1.234;
            System.out.println(num2);
            System.out.println("Hello World");
        }
        System.out.println(num2);
    }
}