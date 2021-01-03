
def insertion_sort(arr):

	for i in range(1, len(arr)):
	
		temp = arr[i]

		j = i-1

		while j >= 0 and temp < arr[j]:

			arr[j+1] = arr[j]

			j -= 1

		arr[j+1] = temp

	return arr

arr = [ 13, 56, 39, 29, 11, 1, 0]
print(insertion_sort(arr))


