echo "Enter name:"
read name

echo "Enter roll:"
read roll

echo "Enter marks:"
read m1
read m2
read m3
read m4

sum=$(expr $m1 + $m2 + $m3 + $m4)

avg=$(echo "scale=2; $sum / 4" | bc)

echo "Average = $avg"

avg1=$(echo "$avg / 1" | bc)
grade=$(expr $avg1 / 10)

case $grade in
    9) echo "Grade: O";;
    8) echo "Grade: E";;
    7) echo "Grade: A";;
    6) echo "Grade: B";;
    5) echo "Grade: C";;
    4) echo "Fail";;
    *) echo "Invalid";;
esac
