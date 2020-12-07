package AssociativeArrays;

import java.util.*;

public class PlantDiscovery {

    public static class Plant {
        public String name;
        public int rarity;
        List<Double> ratings;
        double averageRating;

        public void setAverageRating(double averageRating) {
            this.averageRating = averageRating;
        }

        public Plant(String name, int rarity) {
            this.name = name;
            this.rarity = rarity;
            this.ratings = new ArrayList<>();
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }


        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Plant> plants = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String[] split = scanner.nextLine().split("<->");
            String plantName = split[0];
            int rarity = Integer.parseInt(split[1]);

            if (!plants.containsKey(plantName)) {
                plants.put(plantName, new Plant(plantName, rarity));
            } else {
                Plant currentPlant = new Plant(plantName, rarity);
                plants.replace(plantName, plants.get(plantName), currentPlant);
            }
        }
        List<String> commands = List.of("Rate", "Update", "Reset");
        String input;

        while (!"Exhibition".equals(input = scanner.nextLine())) {
            String[] tokens = input.split(": ");
            String command = tokens[0];
            String[] split = tokens[1].split(" - ");
            String name = split[0];
            if (!commands.contains(command)) {
                System.out.println("error");
            } else {
                switch (command) {
                    case "Rate":
                        double rating = Double.parseDouble(split[1]);
                        plants.get(name).ratings.add(rating);
                        break;
                    case "Update":
                        int newRarity = Integer.parseInt(split[1]);
                        plants.get(name).setRarity(newRarity);
                        break;
                    case "Reset":
                        plants.get(name).ratings.clear();
                        break;
                }
            }
        }
        plants.forEach((key, value) -> {
            double sum = value.ratings.stream().mapToDouble(Double::doubleValue).sum();
            double averageRating = sum / value.ratings.size();
            if (value.ratings.isEmpty()) {
                averageRating = 0.0;
            }
            value.setAverageRating(averageRating);
        });

        System.out.println("Plants for the exhibition:");

        plants.entrySet().stream()
                .sorted((first, second) -> {
                    int result = second.getValue().rarity - first.getValue().rarity;
                    if (result == 0) {
                        result = (int) (second.getValue().averageRating - first.getValue().averageRating);
                    }
                    return result;
                })
                .forEach(plant -> {
                    System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",
                            plant.getValue().name,
                            plant.getValue().rarity,
                            plant.getValue().averageRating);
                });
        System.out.println();
    }
}
