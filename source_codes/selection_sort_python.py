def selection_sort(arr):
	for i in range(len(arr)):

		min_index = i
		for j in range(i+1, len(arr)):
			if arr[i]>arr[j]:
				min_index = j

		arr[i], arr[min_index] =  arr[min_index], arr[i]
	return arr

a = [14,55,23,76,89]
print(selection_sort(a))