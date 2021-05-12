def angle(h,m):
    return (30*h) - (5.5*m)

h,m=map(int,input().split())
print(angle(h,m))