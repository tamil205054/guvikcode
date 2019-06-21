#ry
n = int(input())
b = []
a = n//2 + n
for i in range(1,n+1):
  if i%2==0:
    b.append(i)
for i in range(1,n+1):
  if i%2!=0:
    b.append(i)
for i in range(1,n+1):
  if i%2==0:
    b.append(i)
print(a)
print(*b)
