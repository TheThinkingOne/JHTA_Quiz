import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question {

    private Map<String,Integer> questionMap = new HashMap<>();
    // ArrayList<String> answerList = new ArrayList<>();

    public Question() {
        questionMap.put("1. Python에서 변수를 선언하는 방법은? (점수: 10점)",4);
        questionMap.put("2. Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)",2);
        questionMap.put("3. Python에서 조건문을 작성하는 방법은? (점수: 10점)",3);
        questionMap.put("4. Python에서 함수를 정의하는 방법은? (점수: 5점)",2);
    }

}
