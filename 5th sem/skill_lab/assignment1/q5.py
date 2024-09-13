n=int(input("Enter the 3-digit number:"))
sum=0
while(n>0):
    d=n%10
    n=n//10
    sum+=d
print("The sum of digits is ",sum)