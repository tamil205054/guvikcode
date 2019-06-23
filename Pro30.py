n=input()
flag=0
for i in range(0,len(n)):
    s=n[0:i]+n[i+1::]
    # print(n[0:i])
    if int(s)%8==0:
        flag=1
        break
if flag==1:
    print("yes")
else:
    print("no")
