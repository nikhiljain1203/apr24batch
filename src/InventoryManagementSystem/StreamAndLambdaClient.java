package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamAndLambdaClient {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();

        items.add(new Electronics("E1", "Laptop",  999.99,5,  24));
        items.add(new Clothing("C1", "T-Shirt", 19.99,100, "M"));
        items.add(new Book("B1", "Java Programming", 59.99, 50,"John Doe"));

        //Print all Item Ids in the inventory using map
//        items
//                .stream()
//                .map(Item::getId)
//                .forEach(System.out::println);

        //Create a list of item names in lowercase and print it.
//        items
//                .stream()
//                .map(item -> item.getName().toLowerCase())
//                .forEach(System.out::println);

        //Task 2: Filtering and Matching
        //Goal: Practice filtering and matching conditions with streams.
        //Practice:
        //Find all items priced above 1000 and print their details.
        //Check if any item in the inventory has a quantity of 0 using anyMatch.
        //Verify that all items have a price greater than 0 using allMatch.
        //Confirm that no item has a negative quantity using noneMatch

        //Find all items priced above 1000 and print their details.
//        items
//                .stream()
//                .filter(item -> item.getPrice() > 100)
//                .forEach(item -> System.out.println(item.getName()));

        //Check if any item in the inventory has a quantity of 0 using anyMatch.
        boolean anyItemWithQuantityZero = items
                .stream()
                .anyMatch(item -> item.getQuantity() == 0);

        //Verify that all items have a price greater than 0 using allMatch.
        boolean allItemsHavePriceGreaterThanZero = items
                .stream()
                .allMatch(item -> item.getPrice() > 0);

//        Filter items with a price greater than 1000 and a quantity greater than 0 (available stock).
//        Extract only the names of these items.
//                Remove duplicate names (if any).
//        Sort the names in alphabetical order.
//        Limit the result to the top 5 names.
//                Collect the final list into a List<String> and print it.
        List<String> top5Items = items
                .stream()
                .filter(item -> item.getPrice() > 100 && item.getQuantity() > 0)
                .map(Item::getName)
                .distinct()
                .sorted()
                .limit(5)
                .toList();

        System.out.println("Top 5 items: " + top5Items.toString());
//        Goal: Use reduce (Java Stream.reduce() - Scaler Topics) to aggregate data in a stream.
//        Practice:
//        Calculate the total quantity of all items in the inventory.
        int totalQuantity = items
                .stream()
                .map(Item::getQuantity)
                .reduce(0, (totalSum, quantity) -> totalSum + quantity);

        //Find the most expensive item using reduce.
        Optional<Item> mostExpensiveItem = items
                .stream()
                .reduce((item1, item2) -> item1.getPrice() > item2.getPrice() ? item1 : item2);
        System.out.println("Most expensive item: " + mostExpensiveItem.get().getName());


    }

}
