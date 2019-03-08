package toys;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore {

    private ArrayList<Toy> toyList;

    public ToyStore() {
        toyList = new ArrayList<Toy>();
    }

    public void loadToys(String toys) {
        String toyStr[] = toys.split(" ");
        ArrayList<String> toyArr = new ArrayList<String>();
        boolean isNew;
        for (String s: toyStr) {
            toyArr.add(s);
        }
        for (int j = 0; j < toyArr.size(); j++) {
            isNew = true;
            for (int k = 0; k < toyList.size(); k++) {
                if (toyArr.get(j).equals(toyList.get(k).getName())) {
                    toyList.get(k).setCount(toyList.get(k).getCount() + 1);
                    isNew = false;
                }
            }
            if (isNew) {
                toyList.add(new Toy(toyArr.get(j), 1));
                isNew = false;
            }
        }
    }

    public Toy getThatToy(String nm) {
        Toy toy = new Toy();
        for (Toy t : toyList) {
            if(t.getName().equals(nm)){
                toy = t;
            }
        }
        return toy;
    }

    public String getMostFrequentToy() {
        String maxName = "";
        int maxCount = 0;
        for (Toy t : toyList){
            if(t.getCount()>maxCount){
                maxCount = t.getCount();
            }
        }
        for (Toy t : toyList){
            if(t.getCount()==maxCount){
                maxName = t.getName();
            }
        }
        return "max == " + maxName;
    }

    public void sortToysByCount() {
        boolean isSorted;
        do{
            isSorted = true;
            for(int i = 0; i < toyList.size(); i++){
                if(i < toyList.size()-1){
                    if(toyList.get(i).getCount() > toyList.get(i+1).getCount()){
                        isSorted = false;
                        Toy temp = toyList.get(i);
                        toyList.set(i, toyList.get(i+1));
                        toyList.set(i+1, temp);
                    }
                }
            }
        }while(!isSorted);
    }

    public String toString() {
        return toyList.toString();
    }
}
