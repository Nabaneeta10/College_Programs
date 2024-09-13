m,n=map(int,input("Enter the range:").split())
for i in range(m,n):
    flag = True
    if(i>1):
        for j in range(2,i//2+1):
            if(i%j==0):
                flag=False
                break
        if(flag):
            print(I,end=' ')
