def div(num,den):
    count=0
    while(num>=den):
        num-=den
        count+=1
    return count

n,d=map(int,input().split())
print(div(n,d))