#!/bin/bash
# Program to know the number of times a user has logged in to terminal

if [ $# -eq 1 ]
then
	who > user.1st
	echo "$1 is logged at"
	grep -c $1 user.1st
else
	echo "Please enter username"
fi

