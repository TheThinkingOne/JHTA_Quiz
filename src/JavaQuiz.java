import java.io.IOException;
import java.util.*;

public class JavaQuiz {
    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());*/
        Scanner sc = new Scanner(System.in);

        int score = 0;

        Map<Integer,String> questionMap = new HashMap<>();
        Map<Integer, String> answerMap = new HashMap<>();
        List<Integer> userChoice = new ArrayList<>();

        int[] scores = {10,15,10,5};
        int[] correctAnswers = {2,1,1,2};
        String grade = "";

        questionMap.put(0,"1. Python에서 변수를 선언하는 방법은? (점수: 10점)");
        questionMap.put(1,"2. Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)");
        questionMap.put(2,"3. Python에서 조건문을 작성하는 방법은? (점수: 10점)");
        questionMap.put(3,"4. Python에서 함수를 정의하는 방법은? (점수: 5점)");

        answerMap.put(0,"1) var name 2) name = value 3) set name 4) name == value");
        answerMap.put(1,"순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 \n" +
                "상태로 유지된다");
        answerMap.put(2,"if-else, 2) for-in, 3) while, 4) def");
        answerMap.put(3,"1) class, 2) def, 3) import, 4) return");

        for (int i=0; i < questionMap.size(); i++) {
            System.out.println(questionMap.get(i));
            System.out.println(answerMap.get(i));
            int answer = sc.nextInt();
            userChoice.add(answer);
        }

        System.out.println("-----결과-----");
        System.out.println("응답한 내용");
        for (int i=0; i <userChoice.size(); i++) {
            System.out.print((i+1) + "번 : " + userChoice.get(i) + " ");
            if(userChoice.get(i) == correctAnswers[i]) {
                score += scores[i];
            }
        }

        if(score>=30){
            grade="A";
        }else if(score>=20){
            grade="B";
        }else{
            grade="F";
        }
        System.out.println();
        System.out.println("당신의 응답 합계 : " + score + "점");
        System.out.println("학점 : "+grade);



    }
}