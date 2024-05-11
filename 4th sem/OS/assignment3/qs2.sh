echo "Enter four integers:"
read num1 num2 num3 num4

sum=$((num1 + num2 + num3 + num4))

average=$(echo "scale=2; $sum / 4" | bc)

echo "Sum: $sum"
echo "Average: $average"

