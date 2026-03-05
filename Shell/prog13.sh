#!/bin/bash
# Program to check whether a number is palindome or not

read -p "Enter a number: " n
n1=$n
s=0
while [ $n -gt 0 ]
do
r=$((n % 10))
s=$((s * 10 + r))
n=$((n / 10))
done
if [ $n1 -eq $s ]
then
echo "$n1 is a palindrome"
else
echo "$n1 is not a palindrome"
fi