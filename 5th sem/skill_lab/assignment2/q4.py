sal = int(input("Enter your current salary: "))
service = int(input("Enter your years of service: "))
if (service > 10):
    bonus = 0.1*sal
elif(6 <= service <= 10):
    bonus = 0.08*sal
elif(service<6):
    bonus = 0.05*sal

print("your net bonus is Rs ",bonus)
