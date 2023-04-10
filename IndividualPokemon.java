class IndividualPokemon { //개별 포케몬 클래스(내가 키울 애들, 야생포켓몬, 대전시 ai 플레이어가 들고 나올 포케몬)
    int index, hp, attack, defense, specialAttack, specialDefense, speed, maxLevel, Evo , level;
    String types, name;
    //경험치 얻는 거랑 레벨업은 indiv클래스
    void GetExp(){

    }
    void LevelUp(){
    }
    void Evolution(){ //진화하는 함수. 다음 인덱스로 넘어감.

    }
    /*PokemonTribe pokemontribe;
    PokeTribe individualpokemontribe;

    //개별 포케몬 클래스 생성자
    public IndividualPokemon() {
        //상속을 받으면 좋을 듯.
        pokemontribe = new PokemonTribe(); // 이 생성자로 도감생성.
        individualpokemontribe = new PokeTribe(); // 도감에서 하나의 포케몬의 종족치 꺼내와서 저장할 공간. 타입은 PokeTribe
        individualpokemontribe = pokemontribe.getOnePokemonTribeFromDictionary(1);
        this.index = individualpokemontribe.index;
        this.attack = individualpokemontribe.attack*8;
    }*/

    //이제는 직접 클래스에 접근해서 도감배열 뺴오는거.

    IndividualPokemon(int dictionaynumber, int level){//n은 도감번호 즉 인덱스 번호.
        PokemonTribe pokemonTribe = new PokemonTribe();
        PokeTribe[] dictionary = PokemonTribe.pokemonTribeDictionary;
        this.index = dictionary[dictionaynumber].dictionaynumber;
        this.attack = (dictionary[dictionaynumber].attack)*level;
        this.name = dictionary[dictionaynumber].name;
        this.level = level;
        this.types = types;
    }
    String PrintIndividualPokemonData(){
        return("이름은 " + name  +"도감번호는" + index + "레벨은" + level);
    }

}