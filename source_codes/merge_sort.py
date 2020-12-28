def merge_sort(arr):
	
	if(len(arr)>1):

		mid_index = len(arr)//2

		left_arr = [: mid_index]

		right_arr = [mid_index :]

		merge_sort(left_arr)

		merge_sort(right_arr)

		