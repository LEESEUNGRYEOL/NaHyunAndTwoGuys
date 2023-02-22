package Service;

public class Judge {
    // User 가 입력한 숫자와 Computer 가 생성한 숫자에 따라서
    // Ball 의 갯수와, Strike 의 갯수를 측정하는 Class

    private final Answer computer;
    private static final int ANSWER_SIZE = BASEBALL_DEFAULT_SIZE.getCode();
    // 1. 생성자.
    public Judge (Answer computer)
    {

    }
    // 2. BallCount 와 Strike Count 를 ScoreBoard 에서 가져오는 Method.
    public ScoreBoard getScoreBoard(Answer user)
    {
        int ballCount = getBallCount(user);
        int strikeCount = getStrikeCount(user);
        return new ScoreBoard(ballCount,strikeCount);
    }

    // 3. ballCount 를 가져오는 Method.

    private int getBallCount(Answer user)
    {
        return getContainsNumberCount(user)-getStrikeCount(user);
    }

    // 4. StrikeCount 를 가져오는 Method.
    private int getStrikeCount(Answer user)
    {
        int cnt = 0;
        for (int i = 0; i < ANSWER_SIZE ; i++) {
            if(computer.get(i) == user.get(i))
            {
                cnt++;
            }
        }
        return cnt;
    }
    // 5. Computer 가 제시한 숫자와 User 가 제시한 숫자가 포함되어있는 경우.
    // 예) 2,2,3 이라는 Computer 숫자와 2,3,4 라는 User 의 숫자가 있다면
    //    2라는 숫자는 2번등장, 3이라는 숫자는 1번 등장으로 총 3번의 count 를 return.
    private int getContainsNumberCount(Answer user) {
        int count = 0;
        for (int i = 0; i < ANSWER_SIZE; i++) {
            if (computer.contains(user.get(i))) {
                count++;
            }
        }
        return count;
    }

}
