import math
n=int(input())
radious=n*(math.pi/180)
if radious<1 and radious>0:
  print(round(math.sin(radious),1))
else:
  print(round(math.sin(radious)))
