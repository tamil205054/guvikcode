num,k=map(int,input().split())
n2=list(map(int,input().split()))
n2=sorted(n2)
team,i=0,0
flag=0
while i<len(n2)-2:
  a,b,c=n2[i:i+3]
  for j in range(0,k):
    a,b,c=a+1,b+1,c+1 
    if a<=5 and b<=5 and c<=5:
      flag=1
    else:
      flag=0
  if flag==1:
    team+=1
  i+=3
   
print(team)
