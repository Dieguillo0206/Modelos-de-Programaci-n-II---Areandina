public class Arrays {
    public static void main(String[] args) {

        // Los indices identifican la posición de los elementos en un array

        String[] androidVersions = new String[18];
        String days[] = new String[7];
        String countriesWorldCup[] = new String[48];

        String [][] cities = new String[4][2]; // 4 rows and 2 columns

        int [][][] numbers = new int[2][2][2]; // 3 dimensions

        int [][][][] numbers4 = new int[2][2][2][2]; // 4 dimensions

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";
        androidVersions[4] = "Eclair";
        androidVersions[5] = "Froyo";
        androidVersions[6] = "Gingerbread";
        androidVersions[7] = "Honeycomb";
        androidVersions[8] = "Ice Cream Sandwich";
        androidVersions[9] = "Jelly Bean";
        androidVersions[10] = "KitKat";
        androidVersions[11] = "Lollipop";
        androidVersions[12] = "Marshmallow";
        androidVersions[13] = "Nougat";
        androidVersions[14] = "Oreo";
        androidVersions[15] = "Pie";
        androidVersions[16] = "Android 10";
        androidVersions[17] = "Android 11";

        for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(androidVersions[i]);
        }

        /*
        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);
        System.out.println(androidVersions[4]);
        System.out.println(androidVersions[5]);
        System.out.println(androidVersions[6]);
        System.out.println(androidVersions[7]);
        System.out.println(androidVersions[8]);
        System.out.println(androidVersions[9]);
        System.out.println(androidVersions[10]);
        System.out.println(androidVersions[11]);
        System.out.println(androidVersions[12]);
        System.out.println(androidVersions[13]);
        System.out.println(androidVersions[14]);
        System.out.println(androidVersions[15]);
        System.out.println(androidVersions[16]);
        System.out.println(androidVersions[17]);
        */

        // cities
        cities[0][0] = "Colombia";
        cities[0][1] = "Bogotá";
        cities[1][0] = "Colombia";
        cities[1][1] = "Medellín";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        /*
        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);
         */


        // numbers
        numbers[0][0][0] = 1;
        numbers[0][0][1] = 2;
        numbers[0][1][0] = 3;
        numbers[0][1][1] = 4;
        numbers[1][0][0] = 5;
        numbers[1][0][1] = 6;
        numbers[1][1][0] = 7;
        numbers[1][1][1] = 8;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int k = 0; k < numbers[j].length; k++) {
                    System.out.println(numbers[i][j][k]);
                }
            }
        }

        /*
        System.out.println(numbers[0][0][0]);
        System.out.println(numbers[0][0][1]);
        System.out.println(numbers[0][1][0]);
        System.out.println(numbers[0][1][1]);
        System.out.println(numbers[1][0][0]);
        System.out.println(numbers[1][0][1]);
        System.out.println(numbers[1][1][0]);
        System.out.println(numbers[1][1][1]);
        */

        // numbers 4 dimensions
        numbers4[0][0][0][0] = 1;
        numbers4[0][0][0][1] = 2;
        numbers4[0][0][1][0] = 3;
        numbers4[0][0][1][1] = 4;
        numbers4[0][1][0][0] = 5;
        numbers4[0][1][0][1] = 6;
        numbers4[0][1][1][0] = 7;
        numbers4[0][1][1][1] = 8;
        numbers4[1][0][0][0] = 9;
        numbers4[1][0][0][1] = 10;
        numbers4[1][0][1][0] = 11;
        numbers4[1][0][1][1] = 12;
        numbers4[1][1][0][0] = 13;
        numbers4[1][1][0][1] = 14;
        numbers4[1][1][1][0] = 15;
        numbers4[1][1][1][1] = 16;

        for (int i = 0; i < numbers4.length; i++) {
            for (int j = 0; j < numbers4[i].length; j++) {
                for (int k = 0; k < numbers4[j].length; k++) {
                    for (int l = 0; l < numbers4[k].length; l++) {
                        System.out.println(numbers4[i][j][k][l]);
                    }
                }
            }
        }

    }
}
