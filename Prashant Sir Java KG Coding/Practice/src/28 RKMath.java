class RKMath {
    public static void main(String[] args){
        System.out.println(Math.abs(-44));
        System.out.println(Math.ceil(77.6));
        System.out.println(Math.floor(99.1));
        System.out.println(Math.max(4,6));
        System.out.println(Math.min(5,3));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.random());
        System.out.println(Math.PI);

        for (int in = 0; in < 10; in++) {
            long random = (int) Math.round(Math.random() * 100);
            System.out.println(random);
        }
    }
}
