#!/bin/bash
# Program to check the number of files inside a directory

read -p "Enter the directory name you want to search: " dir
direct="/mnt/c/Users/cacet/CET-S2-LAB/$dir"
if [ -d $direct ]
then
num_files=$(find $direct -type f | wc -l)
echo "There are $num_files files in $direct"
else
echo "$direct is not a directory"
fi