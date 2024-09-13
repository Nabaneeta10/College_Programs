units = int(input("Enter the number of units: "))
charge = 0
if units <= 100:
    charge = 0
elif units <= 200:
    charge = (units - 100) * 5
else:
    charge = (100 * 5) + ((units - 200) * 10)
print("Total electricity bill amount is", charge)
