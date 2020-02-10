package com.acn;

import java.util.ArrayList;
import java.util.List;

public class ListChunkingImp implements ListChunking{

	public List<List> listDivider(List list, int size,boolean discard) {
		List<List> lists=new ArrayList();	
		List CurrList=new ArrayList();
		
		for(int count=0;count<list.size();count++) {	
			if(count%size==0 && count!=0) {		
				 lists.add(CurrList);
				 CurrList=new ArrayList();		 
			}
			
			if(CurrList!=null)
				CurrList.add(list.get(count));		
		}
		
		if( CurrList.size() ==size)
		lists.add(CurrList);
		if(CurrList.size()<size&& discard==false)
		lists.add(CurrList);
		
		return lists;
		
	}
	
	public static void main(String[] args) {		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(1);
		list1.add(1);
		
		list1.add(2);
		list1.add(2);
		list1.add(2);
		
		list1.add(3);
		list1.add(3);
		list1.add(3);

		list1.add(4);
		list1.add(4);
		list1.add(4);

		list1.add(4);
		list1.add(4);
		ListChunkingImp listChunking = new ListChunkingImp();
		System.out.println(listChunking.listDivider(list1, 3, true));
	}

}
