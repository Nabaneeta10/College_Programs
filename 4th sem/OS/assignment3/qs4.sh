if [ $# -ne 2 ]; then
    echo "Usage: $0 <number1> <number2>"
    exit 1
fi

num1=$1
num2=$2

sum=$((num1 + num2))
substraction=$((num1 - num2))
multiply=$((num1 * num2))

echo "Sum: $sum"
echo "Substraction: $substraction"
echo "Multiplication: $multiply"

