#!/bin/bash
# Program to check whether a file is directory or not

read -p "Enter the directory name you want to search" dir
for filename in "./$dir"
do
if [ -d "$filename" ]
then
echo "$filename is a directory"
else
echo "$filename is not a directory"
fi
done
