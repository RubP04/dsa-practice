def binarySearch(sortedList, target):
    start = 0
    end = len(sortedList) - 1

    while start <= end:
        middle = (start + end) // 2
        if sortedList[middle] == target:
            return middle
        elif sortedList[middle] > target:
            end = middle - 1
        else:
            start = middle + 1
    
    return -1

print(binarySearch([1,2,3,4,5,6], 3)) # Expected 2
print(binarySearch([1,2,3,4,5,6], 8)) # Expected -1