public class Main {
    public static void main(String[] args) {
        // Названия городов и их расстояния
        String city1 = "Санкт-Петербург";
        int distance1 = 700;

        String city2 = "Казань";
        int distance2 = 820;

        String city3 = "Новосибирск";
        int distance3 = 3300;

        String city4 = "Владивосток";
        int distance4 = 6400;

        String city5 = "Сочи";
        int distance5 = 1600;

        // Начальные значения для самого удаленного города
        String mostDistantCity = city1;
        int maxDistance = distance1;

        // Сравнение с каждым городом
        if (distance2 > maxDistance) {
            mostDistantCity = city2;
            maxDistance = distance2;
        }

        if (distance3 > maxDistance) {
            mostDistantCity = city3;
            maxDistance = distance3;
        }

        if (distance4 > maxDistance) {
            mostDistantCity = city4;
            maxDistance = distance4;
        }

        if (distance5 > maxDistance) {
            mostDistantCity = city5;
            maxDistance = distance5;
        }

        // Вывод самого удаленного города и его расстояния
        System.out.println("Самый удаленный город от Москвы: " + mostDistantCity);
        System.out.println("Расстояние: " + maxDistance + " км");
    }
}