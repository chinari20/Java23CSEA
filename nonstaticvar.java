class HelloWorld {
    int num = 5;
    public static void main(String[] args) {
        HelloWorld obj1 = new HelloWorld();
        obj1.num = 7;
        System.out.println(obj1.num);
        HelloWorld obj2 = new HelloWorld();
        System.out.println(obj2.num);
    }
}