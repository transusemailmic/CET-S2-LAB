#!/bin/bash
# Program to reverse the contents of a file

if [ $# -eq 1 ]
then
	if [ -f $1 ]
	then
		cat $1
		echo "->"
		tac $1
	else
		echo "File Not Found"
	fi
else
	echo "Please Enter Filename"
fi
