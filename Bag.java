import java.util.Scanner;
public class Bag {
    //Items 클래스의 내부 클래스들 Candy, Pill, MonsterBall 속에 각각의 개수에 대한 필드가 저장되어 있음.
    //아이템 객체들을 만들어야 쓸 수 있겠지
    void DoSomethingInBag(){
        System.out.println("여기는 내 가방 속입니다.");
        System.out.println("원하시는 동작을 선택하세요.");
        System.out.println("1. 가방 속 포켓몬 확인하기");
        System.out.println("2. 사탕 먹이기");
        System.out.println("3. 포켓몬볼");
    }
    Items items = new Items();
    Items.Pill gainedPill = items.new Pill(); //대전모드에서 쓰이는 객체입니다. 작동 확인해주세요.
    Items.Candy gainedCandy = items.new Candy(); //대전모드에서 승리시 이 gainedpill 객체 부르면 됩니다.
    Items.MonsterBall gainedMonsterBall = items.new MonsterBall(); //수집모드에서 사용될 객체입니다. 작동 확인해주세요.

    boolean isFull(){
        for(int i = 0; i < pokemonsInMyBag.length; i++){
            if(pokemonsInMyBag[i]==null)
                return false;
        }
        return true;
    }

    static IndividualPokemon[] pokemonsInMyBag = new IndividualPokemon[3];//가방에 들고 다니는 포켓몬 3마리 배열.//static 주의
    PokemonCenter pokemoncenter = new PokemonCenter();
    static void ShowMyPokemonsInBag(){
        for(int i = 0; i < pokemonsInMyBag.length; i++) {
            if (pokemonsInMyBag[i] == null) {
                System.out.println("가방에 한 칸이 비었습니다.");
            } else {
                System.out.println(i+1 + "번" + pokemonsInMyBag[i].PrintIndividualPokemonData());
            }
        }
        System.out.println("\n");
    }
    void SelectPokemon() {
        //가방이 다 찾는지(포켓몬3마리가 다 있으면) 확인하는 코드
        if(isFull()){
            System.out.println("가방이 꽉 찼습니다. 포켓몬을 먼저 센터로 보내세요.");
            //SendPokemon()함수로 이동하시겠습니까? 물어보는 코드 작성하기
        }
        while(!isFull()){
            Scanner scanner = new Scanner(System.in);
            System.out.println("가방에 넣을 포켓몬을 고르세요. 도감번호를 입력해주세요.");
            pokemoncenter.ShowMyAllPokemons();
            int index;
            index = scanner.nextInt();
            for(int i = 0; i < pokemonsInMyBag.length; i++) {
                if (pokemonsInMyBag[i] == null) {
                    pokemonsInMyBag[i] = pokemoncenter.GetPokemonFromCenter(index);
                    break;
                }
            }
        }
    }
    void SendPokemon() {
        //가방이 비어있으면 경고 코드
        if(!isFull()){
            System.out.println("가방이 텅텅 비어있습니다. 포켓몬을 보낼 수 없어요.");
        }
        else{
            Scanner scanner = new Scanner(System.in);
            System.out.println("가방에서 뺄 포켓몬을 고르세요. 포켓몬 센터로 보내겠습니다.");
            ShowMyPokemonsInBag();
            int number;
            number = scanner.nextInt();
            pokemoncenter.SendPokemonToCenter(number, pokemonsInMyBag[number-1]);
            pokemonsInMyBag[number-1] = null;
        }
    }
}
