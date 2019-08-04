n=int(input())
a= list(map(int, input().split()))
b=list()
for i in range(n):
    if i !=n-1:
        max=0
        for j in range(i+1,n):
            if a[j]>max:
                max=a[j]
        b.append(max)
    else:
        b.append(0)
for i in range(n):
    if i!=n-1:
        print(b[i],end=" ")
    else:
        print(b[i],end="")
