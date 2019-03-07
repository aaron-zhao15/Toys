package toys;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
            toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
            String toyStr[] = toys.split(" ");
            ArrayList<String> toyArr = new ArrayList<String>();
            boolean isNew = true;
            for(int i = 0; i < toyStr.length; i++){
                toyArr.add(toyStr[i]);
            }
            for(int j = 0; j < toyArr.size(); j++){
                for(int k = 0; k < toyList.size(); k++){
                    if(toyArr.get(j).equals(toyList.get(k).getName())){
                        toyList.get(k).setCount(toyList.get(k).getCount()+1);
                        isNew = false;
                    }
                }
                if(isNew){
                    toyList.add(new Toy(toyArr.get(j), 1));
                    isNew = false;
                }
            }
            
	}
  
  	public Toy getThatToy( String nm )
  	{
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}