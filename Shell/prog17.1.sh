#!/bin/bash
# Program to show the count of users logged in

echo "Show all users login"
who
echo "Show count of all users login"
who | wc -l
