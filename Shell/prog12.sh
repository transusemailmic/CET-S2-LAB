#!bin/bash
# Program to find the factorial

read -p "Enter the number to find the factorial: " n
f=1
for i in $(seq 1 $n)
do
f=$(($f * $i))
done
echo "Factorial of $n is $f"