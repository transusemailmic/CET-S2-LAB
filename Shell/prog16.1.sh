#!/bin/bash
# Copying contents of one file to another after inputting the contents

read -p "Enter the file name: " file1
echo "Enter the contents of the file $file: "
cat > "$file1"
read -p "Enter existing file name: " file2
cp "$file1" "$file2"
echo "Contents of $file2: "
cat "$file2"
