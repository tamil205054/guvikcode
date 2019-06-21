#ry
n = int(input())
list_b = []
a = n//2 + n
for i in range(1,n+1):
  if i%2==0:
    list_b.append(i)
for i in range(1,n+1):
  if i%2!=0:
    list_b.append(i)
for i in range(1,n+1):
  if i%2==0:
    list_b.append(i)
print(a)
print(*list_b)
