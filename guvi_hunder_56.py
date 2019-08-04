def findClosest(arr, n, target):
    if (target <= arr[0]):
        return arr[0]
    if (target >= arr[n - 1]):
        return arr[n - 1]
    i = 0;
    j = n;
    mid = 0
    while (i < j):
        mid =int( (i + j) / 2)
        if (arr[mid] == target):
            return arr[mid]
        if (target < arr[mid]):
            if (mid > 0 and target > arr[mid - 1]):
                return getClosest(arr[mid - 1], arr[mid], target)
            j = mid
        else:
            if (mid < n - 1 and target < arr[mid + 1]):
                return getClosest(arr[mid], arr[mid + 1], target)
            i = mid + 1
    return arr[mid]
def getClosest(val1, val2, target):
    if (target - val1 >= val2 - target):
        return val2
    else:
        return val1
n=int(input())
a= list(map(int, input().split()))
maximum=10000
arr=list()
for i in range(n):
    for j in range(n):
        result=a[i]+a[j]
        arr.append(int(result))

arr.sort()
# print(arr)
n1 = len(arr)
target = 0
flag=0
temp=findClosest(arr, n1, target)
for i in range(n):
    for j in range(n):
        if a[i]+a[j]==temp:
            if a[i]>0:
                print("{} {}".format(a[i],a[j]),end="")
            break
