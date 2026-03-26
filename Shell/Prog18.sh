#!/bin/bash
# Program to find GCD and LCM of two numbers

read -p "Enter two numbers: " a b
small=$a
if [ $b -lt $a ]
then
small=$b
fi
while [ $small -gt 0 ]
do
x=$(expr $a % $small)
y=$(expr $b % $small)
if [ $x -eq 0 -a $y -eq 0 ]
then 
echo "GCD of $a and $b is $small"
break
fi
small=$(expr $small - 1)
done
lcm=$(expr $a \* $b / $small )
echo "LCM of $a and $b is $lcm"


