package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    public List<Integer> UserNum = new ArrayList<>();
    protected String num = "";

    /* 유저 입력 후 입력된 값을 리스트 형태로 반환 */
    public List<Integer> readUserNum(){
        System.out.print("3자리의 숫자를 입력해주세요. : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextLine();
        checkNumLength();
        changeUserNumToList(num);
        return UserNum;
    }

    /* 범위 확인 */
    private void checkNumLength(){
        if(!(num.length() ==3)){
            System.out.println("범위를 벗어났습니다.");
            readUserNum();
        }
    }

    /* 유저가 입력한 숫자를 리스트 형태로 변환 */
    protected void changeUserNumToList(String num){
        for (int i = 0; i < num.length(); i++) {
            UserNum.add(i,num.charAt(i)-'0');
        }
    }
}
