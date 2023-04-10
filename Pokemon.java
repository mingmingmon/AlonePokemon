public class Pokemon {
    int index, hp, attack, defense, specialAttack, specialDefense, speed, level;
    String types, name;

    PokemonTribe[] book = new PokemonTribe[11];
    void getBook(){
        //book = PokemonTribe.SetPokemons();
    }//이제 book을 쓸 수 있다.

    Pokemon(int index, int level){
        this.index = index;
        this.level = level;
    }
    void makePokemon(){
        //this.hp = book[index].hp*level;

    }
    public static void main(String[] args){
        Pokemon m1 = new Pokemon(1, 8);
        m1.makePokemon();
    }

}
