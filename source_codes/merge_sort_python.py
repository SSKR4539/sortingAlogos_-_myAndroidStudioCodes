def merge_sort(arr):
	
	if(len(arr)>1):

		mid_index = len(arr)//2

		left_arr = arr[:mid_index]

		right_arr = arr[mid_index:]

		merge_sort(left_arr)

		merge_sort(right_arr)

		i,j,k = 0,0,0

		while i < len(left_arr) and j < len(right_arr):

			if left_arr[i] < right_arr[j]:
				arr[k] = left_arr[i]
				i += 1

			else:
				arr[k] = right_arr[j]
				j += 1

			k += 1

		while i < len(left_arr):
			arr[k] = left_arr[i]
			i +=1
			k+=1

		while j < len(right_arr):
			arr[k] = right_arr[j]
			j +=1
			k+=1

	return arr

a = [14,55,23,76,89]
print(merge_sort(a))