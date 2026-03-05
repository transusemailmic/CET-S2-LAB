#!/bin/bash
# Program to extract the substring

read -p "Enter the string: " str
read -p "Enter the starting and ending index: " a b
substr=${str:a:b}
echo "Substring: $substr"