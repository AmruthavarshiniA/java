package com.ds;

public class DataStructure {

	private final static int SIZE=15;
	private int[] arryOfInt=new int[SIZE];
	
	public DataStructure() {
		for(int i=0;i<SIZE;i++) {
			arryOfInt[i]=i;
		}
	}
	public void printEven() {
		InnterApp ip=new InnterApp();
		while(ip.hasNext()) {
			System.out.println(ip.getNext());
		}
	}
	
	private class InnterApp{
		private int next=0;
		public boolean hasNext() {
			return(next<=SIZE-1);
		}
		public int getNext() {
			int retValue=arryOfInt[next];
			next+=2;
			return retValue;
		}
	}
	public static void main(String[] args) {
		DataStructure ds=new DataStructure();
		ds.printEven();
	}
}
