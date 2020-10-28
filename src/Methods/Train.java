package Methods;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] tokens = input.split("\\s+");

            if (tokens[0].equals("Add")) {
                int passengersToAdd = Integer.parseInt(tokens[1]);
                wagons.add(passengersToAdd);

            } else {
                int passengers = Integer.parseInt(tokens[0]);
                int index = 0;
                for (Integer wagon : wagons) {
                    int passengersInWagon = wagons.get(index);
                    if (passengersInWagon + passengers <= maxCapacity) {
                        wagons.set(index, passengersInWagon + passengers);
                        break;
                    }
                    index++;
                }
            }
            input = scanner.nextLine();
        }
            printList(wagons);
    }

        private static void printList (List < Integer > wagons) {
            for (Integer wagon : wagons) {
                System.out.print(wagon + " ");
            }
        }
    }
