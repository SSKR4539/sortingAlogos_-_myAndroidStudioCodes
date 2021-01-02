
def insertion_sort(arr):

	fot i in range(1, l2n(arr)):
	
	temp = arr[i]

	j = i

	while j>=0 and temp < arr[j-1]:

		arr[j+1] = arr[j-1]

		j -= 1

	arr[j] = temp

arr = [ 13, 56, 39, 29, 11, 1, 0]
print(insertion_sort(arr))
