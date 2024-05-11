echo "Enter two variables:"
read var1
read var2

temp=$var1
var1=$var2
var2=$temp

echo "After exchanging:"
echo "var1: $var1"
echo "var2: $var2"

