package test;

public class Solution {
	/**
	 *����һ����ά���飨�����Σ��������ҵ��������ϵ��µ���
	 *��������һ����
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
