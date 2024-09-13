sec = int(input("Enter the seconds: "))
hours = sec / 3600
minutes = (sec % 3600) / 60
seconds = sec % 60
print("The hours, minutes and seconds are:",hours,minutes,seconds)