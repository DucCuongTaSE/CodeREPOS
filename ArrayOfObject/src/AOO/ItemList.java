
package AOO;

public class ItemList {

    Item[] list;
    int numOfItem;
    final int MAX = 100;

    public ItemList() {
        list = new Item[MAX];
        numOfItem = 0;
    }

    public boolean addItem(Item item) {
        if (item == null || numOfItem >= MAX) {
            return false;
        }
        list[numOfItem] = item;
        numOfItem++;
        return true;
    }

    public void displayAll() {
        if (numOfItem == 0) {
            System.out.println("The list is empty");
        }
        for (int i = 0; i < numOfItem; i++) {
            System.out.println(list[i]);
        }
    }

    public Item findItem(String creator) {
        for (int i = 0; i < numOfItem; i++) {
            if (list[i].getCreator().equals(creator)) {
                return list[i];
            }
        }
        return null;
    }

    public int findItemIndex(String creator) {
        for (int i = 0; i < numOfItem; i++) {
            if (list[i].getCreator().equals(creator)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateItem(int index) {
        if (index >= 0 && index < numOfItem) {
            list[index].input();
            return true;
        }
        return false;
    }

    public boolean removeItem(int index) {
        if (index >= 0 && index < numOfItem) {
            for (int j = index; j < numOfItem; j++) {
                list[j] = list[j + 1];
            }
            numOfItem--;
            return true;
        }
        return false;
    }

    public void displayItemsByType(String type) {
        if (type.equals("Vase")) {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Vase) {
                    System.out.println(list[i]);
                }
            }
        } else if (type.equals("Statue")) {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Statue) {
                    System.out.println(list[i]);
                }
            }
        } else {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Painting) {
                    System.out.println(list[i]);
                }
            }
        }
    }

    public void sortItems() {
        for (int i = 0; i < numOfItem ; i++) {
            for (int j = numOfItem - 1;j>i; j--) {
                if (list[j].getValue() < list[j - 1].getValue()) {
                    Item tmp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = tmp;
                }
            }
        }
    }
}


