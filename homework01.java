public class homework01 {

    public static void main(String[] args) {

        int var1=5;
        int var2=2;
        double var3=(double)var1/var2;     // double 타입으로 묶어줘야 실수로 계산되어 var3으로 소수점자리도 들어간다.
        int var4=(int)(var3*var2);
        System.out.println(var4);

    }

}
