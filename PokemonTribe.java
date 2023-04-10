public class PokemonTribe { //포케몬 종족치 클래스
    //hp attack 방어 특수공격 특수방어 speed

    static PokeTribe[] pokemonTribeDictionary = new PokeTribe[12]; //11마리의 포케몬 생성자 부르면서 세팅
    public PokeTribe getOnePokemonTribeFromDictionary(int num) {
        return pokemonTribeDictionary[num];
    }
    PokemonTribe(){ //PokemonTribe 생성자. 포케몬 종족치 클래스에 대해 객체 생성하면서 싹 초기화 해버림. 즉 생성자 속에서 다 초기화.
        //함수 불러서 pokemonTribeDictionary 만들기 싫어서 PokemonTribe 클래스 만들어서 생성시켜버림.
        //pokemon[0]
        pokemonTribeDictionary[1] = new PokeTribe(1, PokemonType.GRASS, "이상해씨", 45, 49, 49, 65, 65, 45, 16, 2);
       /* pokemonTribeDictionary[2] = new PokeTribe(2, "GRASS", "이상해풀", 60, 62, 63, 80, 80, 60, 32, 3);
        pokemonTribeDictionary[3] = new PokeTribe(3, "GRASS", "이상해꽃", 80, 82, 83, 100, 100, 80, -1, -1);
        pokemonTribeDictionary[4] = new PokeTribe(4, "FIRE", "파이리", 39, 52, 43, 60, 50, 65, 16, 5);
        pokemonTribeDictionary[5] = new PokeTribe(5, "FIRE", "리자드", 58, 64, 58, 80, 65, 80, 36, 6);
        pokemonTribeDictionary[6] = new PokeTribe(6, "FIRE", "리자몽", 78, 84, 78, 109, 85, 100, -1, -1);
        pokemonTribeDictionary[7] = new PokeTribe(7, "WATER", "꼬부기", 44, 48, 65, 50, 64, 43, 16, 8);
        pokemonTribeDictionary[8] = new PokeTribe(8, "WATER", "어니부기", 59, 63, 80, 65, 80, 58, 36, 9);
        pokemonTribeDictionary[9] = new PokeTribe(9, "WATER", "거북왕", 79, 83, 100, 85, 105, 78, -1, -1);
        pokemonTribeDictionary[10] = new PokeTribe(10, "ELECTR", "피카츄", 35, 55, 30, 50, 50, 90, 36, 11);
        pokemonTribeDictionary[11] = new PokeTribe(11, "ELECTR", "라이츄", 60, 90, 55, 90, 80, 100, -1, -1);*/
    }

}