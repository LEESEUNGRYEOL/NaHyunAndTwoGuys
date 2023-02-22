package Service;

import Entity.Computer;

import java.util.ArrayList;
import java.util.List;


/* computer에 필요한 기능 :
* 1. 정수형 겹치지 않는 랜덤 숫자 3개 List에 넣기
* */
public class ComputerService {

    static List<Integer> computerRandNum = new ArrayList<>();

    public ComputerService(){

    }

    /* 컴퓨터 난수 생성 */
    public void creatRandNum(){
        while (computerRandNum.size()<3){
            int randNum =(int)((Math.random()*9)+1);

            if(!computerRandNum.contains(randNum)){
                computerRandNum.add(randNum);
            }
        }
    }
}
