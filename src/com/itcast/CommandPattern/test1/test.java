package com.itcast.CommandPattern.test1;

public class test {
	public static void main(String[] args) {
		int[] arr = {2, 3, 1, 0, 2, 5, 3};
		int res = findRepeatNumber(arr);
		System.out.println(res);
	}
	public static int findRepeatNumber(int[] nums) {
		if(nums.length<2){
			return -1;
		}
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1 ; j<nums.length ;j++){
				if(nums[i]==nums[j]){
					return nums[i];
				}
			}
		}
		return -1 ;
	}
}
