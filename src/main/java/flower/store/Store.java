package flowerstore.src.main.java.flower.store;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

@Getter
public class Store {
    private HashMap<ItemType, ArrayList> categories = new HashMap<>();

    public Store() {
        categories.put(ItemType.FLOWER, new ArrayList<FlowerBucket>());
        categories.put(ItemType.PACK, new ArrayList<FlowerPack>());
        categories.put(ItemType.BUCKET, new ArrayList<Flower>());
    }

    public void addBucket(FlowerBucket bucket) {
        categories.get(ItemType.BUCKET).add(bucket);
    }

    public void addPack(FlowerPack pack) {
        categories.get(ItemType.PACK).add(pack);
    }

    public void addFlower(Flower flower) {
        categories.get(ItemType.FLOWER).add(flower);
    }

    public ArrayList searchByCategory(ItemType category) {
        return categories.get(category);
    }

    public ArrayList searchByItemAndPrice(int min, int max, ItemType category) {
        ArrayList res = new ArrayList();
        ArrayList<Item> items = categories.get(category);
        for(Item item : items){
            if(item.getPrice() < max & item.getPrice() > min){
                res.add(item);
            }
        }
        return res;
    }
}