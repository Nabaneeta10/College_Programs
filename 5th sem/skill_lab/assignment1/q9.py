a=int(input("Enter the first no:"))
b=int(input("Enter the second no:"))
c=int(input("Enter the third no:"))
max=a
if(b>a and b>c):
    max=b
elif(c>a and c>b):
    max=c
print("The largest is:",max)