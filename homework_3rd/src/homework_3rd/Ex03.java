package homework_3rd;

// 다음 프로그램에서 잘못된 부분을 모두 지적하고 올바르게 수정하시오.
// 그리고 수정된 후의 출력 결과를 쓰시오. 

class Television {
//	필드
    private String model;
//  getter, setter
    void setModel(String b) {
        model = b; 
    } 
    String getModel() {
        return model;
//        	void 메소드는 return값을 갖지 않으므로, 리턴 타입 String으로 수정
    }
    
}

public class Ex03 {
	
    public static void main(String[] args){
        Television t = new Television();
//        	생성자는 메소드의 일종이므로 new Television()으로 수정
        t.setModel("STV-101"); 
        String b = t.getModel();
//        	메소드 앞에 객체가 지정되지 않았으므로 t.getModel()로 수정
//      String b의 출력값은 "STV-101"임
        System.out.println(b);
    }
    
}
