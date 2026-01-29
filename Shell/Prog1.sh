#!/bin/bash
# Shell Program to find the grestest among three numbers

read -p "Enter three numbers: " a b c
if [ $a -gt $b ] && [ $a -gt $c ]
then
echo "$a is greatest"
elif [ $b -gt $c ]
then
echo "$b is greatest"
else
echo "$c is greatest"
fi