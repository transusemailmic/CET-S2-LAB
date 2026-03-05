#!/bin/bash
# Program to print below priority jobs

echo "Below priority jobs"
ps -al | cut -c 16-19,70-
