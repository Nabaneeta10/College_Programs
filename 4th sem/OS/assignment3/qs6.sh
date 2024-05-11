echo "Enter three numbers: "
read num1 num2 num3

largest=$num1
smallest=$num1

# Compare with num2
if [ $num2 -gt $largest ]; then
    largest=$num2
fi

if [ $num2 -lt $smallest ]; then
    smallest=$num2
fi

# Compare with num3
if [ $num3 -gt $largest ]; then
    largest=$num3
fi

if [ $num3 -lt $smallest ]; then
    smallest=$num3
fi

# Display the largest and smallest numbers
echo "Largest number: $largest"
echo "Smallest number: $smallest"

