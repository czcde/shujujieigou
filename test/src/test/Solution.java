package test;

public class Solution {
	/**
	 *给定一个二维数组（正方形），从左到右递增，从上到下递增
	 *查找里面一个数
	 * @param target
	 * @param array
	 * @return
	 */
	public boolean Find(int target,int [][] array) {
		 for(int i=0;i<array.length;i++) {
			 for(int j=0;j<array[0].length;j++) {
				 if(array[i][j]==target) {
					 return true;
				 }
			 }
		 }
		return false;
		
	}
	public static void main(String[] args) {
		int[][] array = new int[5][5];
		array[0][1]=2;
		System.out.println(new Solution().Find(2, array));
	}
}
