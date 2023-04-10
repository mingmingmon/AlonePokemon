public class Items {
    Pill pill = new Pill();
    Candy candy = new Candy();
    MonsterBall monsterBall = new MonsterBall();
    class Pill{
        int numberOfPills;
        void SetPill(int number){ //회복약 개수를 추가하는 메소드. 회복약이 늘어나는 경우는 사탕을 주고 사는 경우밖에 없음.
            this.numberOfPills += number;
        }
        String GetPill(){ //회복약 몇 개 있는지 확인하는 메소드
            return("회복약이 " + numberOfPills + "개 있습니다.");
        }
        void FeedPill(int num){ // 회복약을 포케몬에 먹이는 함수.
            numberOfPills--;
            //hp 회복시키는 코드
        }
    }
    class Candy{
        int numberOfCandy;
        void SetCandy(int number){
            this.numberOfCandy += number;
        }
        String GetCandy(){
            return("사탕이" + numberOfCandy + "개 있습니다.");
        }
        void FeedCandy(int n){ // 사탕을 포케몬에 먹이는 함수.//n은 pokemonsInMyBag에 있는 포켓몬 위치 즉 012 중 하나임.
            //근데 가방에 포켓몬은 1,2,3부터 있는거라서 입력 받는거 -1로 인덱스에 넣기
            --numberOfCandy;
            Bag.pokemonsInMyBag[n-1].level++;//사탕 먹이면 레벨 올라감
        }
    }
    class MonsterBall{
        int numberOfMonsterBall;
        void SetCandy(int number){
            this.numberOfMonsterBall += number;
        }
        String GetMonsterBall(){
            return("사용가능한 몬스터볼이" + numberOfMonsterBall + "개 있습니다.");
        }
        void ThrowMonsterBall(){ //몬스터볼을 던지는 함수. 야생포켓몬의 체력에 반비례해서 포켓몬을 획득할 확률을 부여한다.

        }
    }
}
