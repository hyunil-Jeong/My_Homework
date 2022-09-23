public class homework02 {

    public static void main(String[] args) {

        int x=10;
        int y=20;
        int z = (++x) + (y--);   // ++x는 1을 올려주고 x에 11을 넣는다. y-- 20으로 계산하여 z에 넣어전 후에 1을 내려준다.
        System.out.println(x);
        System.out.println(z);
        System.out.println(y);

    }

}
