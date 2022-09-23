public class homework03 {

    public static void main(String[] args) {

        System.out.println("시작!");

        int num1 = 0;
        int num2 = 0;

        while ( num1 + num2 != 5) {

            num1 = (int)(Math.random()*5 + 1);  // Math.random() 함수는 0 ~ 1.0 까지의 실수를 반환하는 함수
            num2 = (int)(Math.random()*5 + 1);

             System.out.println("(" + num1 + "," + num2 + ")");

        }

        System.out.println("끝!");

    }

}

// 첫줄의 num1, num2를 변수 선언할 때부터 Math.random() 를 쓴 채로 만들었더니,
// 변수 생성 시 합이 5가 되는 채로 생성되면,  while 문을 돌지 않고 바로 "끝!" 을 출력함.
// 그래서 변수선언을 while문 안에서 했더니, while문 조건에서 변수를 찾을 수 없다고 나옴
// 따라서, while문 위에서 변수 선언하되, 무조건 한 번은 돌게끔 임의의 숫자를 할당해서 해결함.