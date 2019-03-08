package toys;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
            ToyStore store = new ToyStore();
            store.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
            store.loadToys("sorry bat ball");
            System.out.println(store.toString());
            System.out.println(store.getThatToy("ball").toString());
            System.out.println(store.getMostFrequentToy());
            store.sortToysByCount();
            System.out.println(store.toString());
            
            
	}
}