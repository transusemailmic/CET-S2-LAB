#!/bin/bash
# Program to reverse a number

read -p "Enter the number: " num
n=$num
s=0
while [ $n -gt 0 ]
do
r=$(($n % 10))
s=$(($s * 10 + $r))
n=$(($n / 10))
done
echo "Reversed Number is $s"