
import java.util.*;

/*
Practice 
Collection<V> - List - Vector
Collection<K> - Set - HashSet - LinkedHashSet
Map<K,V> - HashTable(HashMap)
*/
public class SetTest{
		
		private Set<Integer> myKey;
		private Map<Integer,String> myDb;
	  private Collection<String> myVaule;
		
		public SetTest(){
				myKey = new LinkedHashSet<>();
				myDb = new Hashtable<>();
				myVaule = new Vector<>();
		}

		public static void main(String args[]){
				System.out.println("Hi~ Set");
				SetTest test = new SetTest();
				
				//Put Data
				for(int i=0 ; i<100 ; i++){
						test.myDb.put(i,i+"");
				}
				
				//Get Data
				test.myKey = test.myDb.keySet(); // map.keySet() to retrieve Keys
				Iterator it = test.myKey.iterator();
				while(it.hasNext()){
					Object obj = it.next();
					System.out.println("Key = "+obj+ " Value = "+test.myDb.get(obj));
				}
				System.out.println("Map.values()--------");
				test.myVaule = test.myDb.values();
				System.out.println(test.myVaule);
				System.out.println("toArray-----------");
				String[] myDb = test.myVaule.toArray(new String[test.myVaule.size()]);
				for(String s : myDb)
				System.out.print(s+" ");
				System.out.println("\ntoCollection-----------");
				Collection myDb2 = Arrays.asList(myDb);
				System.out.print(myDb2+" ");
		}


}