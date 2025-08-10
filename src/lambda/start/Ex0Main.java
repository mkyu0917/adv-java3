package lambda.start;

public class Ex0Main {
    /*
    public static void helloJava() {
        System.out.println("프로그램 시작");
        System.out.println("Hello Java");
        System.out.println("프로그램 종료");
    }
    public static void helloSpring() {
        System.out.println("프로그램 시작");
        System.out.println("Hello Spring");
        System.out.println("프로그램 종료");
    }
     */
    public static void hello(String str){

        System.out.println("프로그램 시작");
        System.out.println(str);
        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {
        //helloJava();
        //helloSpring();

        //위 메소드를 하나로 합쳐서 만들기
        String str = "Hello Spring";
        hello(str);
        // 변하는 부분과 변하지 않는 부분을 구분해서 중복을 제거하여 코드를 재사용할 수 있도록 만드는게
        // 좋은 프로그램의 요지

    }

}
