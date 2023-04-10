public class TypeMatchingTable {
    static double POOR = 0.5F;
    static double NICE = 2.0F;
    static double JUST = 1.0F;
    static double DONT = 0.0F;
    static int NUMBER_OF_TYPE = 15;

        static double[][] matchingTable = {
                { 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, POOR, DONT, 1.0F },
                { 1.0F, POOR, POOR, NICE, 1.0F, NICE, 1.0F, 1.0F, POOR, 1.0F, 1.0F, NICE, POOR, 1.0F, POOR },
                { 1.0F, NICE, POOR, POOR, 1.0F, 1.0F, 1.0F, 1.0F, NICE, 1.0F, 1.0F, 1.0F, NICE, 1.0F, POOR },
                { 1.0F, POOR, NICE, POOR, 1.0F, 1.0F, 1.0F, POOR, NICE, POOR, 1.0F, 1.0F, NICE, 1.0F, POOR },
                { 1.0F, 1.0F, NICE, POOR, POOR, 1.0F, 1.0F, 1.0F, DONT, NICE, 1.0F, 1.0F, 1.0F, 1.0F, NICE },
                { 1.0F, 1.0F, POOR, NICE, 1.0F, POOR, 1.0F, 1.0F, NICE, NICE, 1.0F, 1.0F, 1.0F, 1.0F, NICE },
                { NICE, 1.0F, 1.0F, 1.0F, 1.0F, NICE, 1.0F, POOR, 1.0F, POOR, POOR, POOR, NICE, DONT, 1.0F },
                { 1.0F, 1.0F, 1.0F, NICE, 1.0F, 1.0F, 1.0F, POOR, POOR, 1.0F, 1.0F, NICE, POOR, POOR, 1.0F },
                { 1.0F, NICE, 1.0F, POOR, NICE, 1.0F, 1.0F, NICE, 1.0F, DONT, 1.0F, POOR, NICE, 1.0F, 1.0F },
                { 1.0F, 1.0F, 1.0F, NICE, POOR, 1.0F, NICE, 1.0F, 1.0F, 1.0F, 1.0F, NICE, POOR, 1.0F, 1.0F },
                { 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, NICE, NICE, 1.0F, 1.0F, POOR, 1.0F, 1.0F, 1.0F, 1.0F },
                { 1.0F, POOR, 1.0F, NICE, 1.0F, 1.0F, POOR, NICE, 1.0F, POOR, NICE, 1.0F, 1.0F, POOR, 1.0F },
                { 1.0F, NICE, 1.0F, 1.0F, 1.0F, NICE, POOR, 1.0F, POOR, NICE, 1.0F, NICE, 1.0F, 1.0F, 1.0F },
                { DONT, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, DONT, 1.0F, 1.0F, NICE, 1.0F },
                { 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, NICE }
        };

        String[] stringType = {
                "NORMAL",
                "FIRE",
                "WATER",
                "GRASS",
                "ELECTR",
                "ICE",
                "FIGTH",
                "POISON",
                "GROUND",
                "FLYING",
                "PSYSHC",
                "BUG",
                "ROCK",
                "GHOST",
                "DRAGON"
        };
    }
