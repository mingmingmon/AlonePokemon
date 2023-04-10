public class PokeTribe {
        int dictionaynumber, hp, attack, defense, specialAttack, specialDefense, speed, maxLevel, Evo;
        PokemonType types;
        String name;

        PokeTribe(){
        }
        PokeTribe(int dictionaynumber, PokemonType types, String name, int hp, int attack, int defense, int specialAttack, int specialDefense, int speed, int maxLevel, int Evo) {
            this.dictionaynumber = dictionaynumber;//dictionaynumber
            this.types = types;
            this.name = name;
            this.hp = hp;
            this.attack = attack;
            this.defense = defense;
            this.specialAttack = specialAttack;
            this.specialDefense = specialDefense;
            this.speed = speed;
            this.maxLevel = maxLevel; //evolevel
            this.Evo = Evo;//evodictionaynumber
    }
}
