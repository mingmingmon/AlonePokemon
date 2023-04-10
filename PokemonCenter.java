public class PokemonCenter {
    static IndividualPokemon[] collectedPokemons = new IndividualPokemon[5];//다른 클래스에서 변경한 사항이 저장되려면 static으로 선언. 중요한 내용.
    PokemonCenter(){ //초기화 하면서 내가 여태 모아놓은 포켓몬들을 불러온다는 개념
        collectedPokemons[1] = new IndividualPokemon(1,8);//도감 번호랑 일치시켜서 수집한 애들 저장하기
        collectedPokemons[2] = new IndividualPokemon(2,7);
        collectedPokemons[3] = new IndividualPokemon(3,6);
        collectedPokemons[4] = new IndividualPokemon(4,5);
    }
    void SendPokemonToCenter(int index,IndividualPokemon pokemon){
        collectedPokemons[index] = pokemon;
    }
    IndividualPokemon GetPokemonFromCenter(int n){
        IndividualPokemon sendedpokemon = collectedPokemons[n];
        collectedPokemons[n] = null;
        return sendedpokemon;
        //내보낸 곳 인덱스에는 다 null로 바꿔줘야 돼..
    }
    void ShowMyAllPokemons(){
        for(int i = 1; i < collectedPokemons.length; i++){
            if(collectedPokemons[i]!=null)
                System.out.println(collectedPokemons[i].PrintIndividualPokemonData());
            else{
                System.out.println("비어있습니다.");
            }
        }
    }
}
