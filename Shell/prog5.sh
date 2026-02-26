#!/bin/bash
# Program to find whether a number is even or odd

read -p "Enter a number: " n
if [ $(( $n % 2)) -eq 0 ]
then
echo "$n is an even number"
else
echo "$n is an odd number"
fi
