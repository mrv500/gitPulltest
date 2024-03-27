package collectionsPractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class listDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a =
			{1,2};
		int[] b =
			{1,2};
	ArrayList<Integer> alist= new ArrayList<>();
	
	alist.add(2);
	alist.add(3);
	alist.add(1);
	alist.add(9);
	alist.add(9);
	checkListDuplicates(alist);
	
			List<Integer> list =new ArrayList<>();
			list.add(2);
			list.add(3);
			list.add(1);
			list.add(9);
			list.add(1);
			System.out.println("get - "+list.get(0));
			System.out.println(checkList(list));
			
		//System.out.println(Collections.frequency(list, ));
		//	Collections.rev;
			
			//Arrays.sort,Collections.reverseOrder());
			
			Arrays.sort(a,Collections.reverseOrder());
			
		//	Collections.replaceAll(null, null, null)
			
		}
		
		public static boolean checkList(List<Integer> list)
		{
			
			Set<Integer> set = new HashSet<>();
			
			for(Integer integer:list)
			{
				if(set.contains(integer))
				{
					return false;
				}
				else
				{
					set.add(integer);
				}
				
				
			}
			
			return true;
		}
		
		
		
		
		public static void checkListDuplicates(List<Integer> list)
		{ 
			Set<Integer> set = new HashSet<>();
			ArrayList<Integer> alist=new ArrayList<Integer>();
			for(Integer value:list)
			{
				
				
				set.add(value);
				
				
			}
			
			alist.addAll(set);
		System.out.println(alist);
		}
		
		public class RemoveDuplicatesFromArraylist {
			public ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
			ArrayList<Integer> newList = new ArrayList<Integer>();
			for (Integer element : list) {
			if (!newList.contains(element)) {
			newList.add(element);
			}
			}
			return newList;
			}
		}

		
		public static void checkListDuplicatesPrint(List<Integer> list)
		{ Integer[] a =
	{1,2};
			Set<Integer> set = new HashSet<>();
			ArrayList<Integer> alist=new ArrayList<Integer>();
		
		Set<Integer> set2= new HashSet<>(Arrays.asList(a));
			//Collections.so
			for(Integer value:list)
			{
				if(list.isEmpty())
				
				set.add(value);
				
				
			}
			
			alist.addAll(set);
		System.out.println(alist);
		}


	}


