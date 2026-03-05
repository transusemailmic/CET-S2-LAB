#!/bin/bash
# Program to reverse a string

read -p "Enter the string" str
l=${#str}
rs=""
for i in $(seq $l -1 1)
do
a=$(expr substr "$str" $i 1)
rs="$rs$a"
done
echo "Reversed String: $rs"