#!/bin/bash
# Start printing from a certain line after inputting the contents

read -p "Enter the file name: " file1
read -p "Enter the file name: " file2
read -p "Enter the file name: " file3
echo "Enter the contents of the file $file1: "
cat > "$file1"
echo "Enter the contents of the file $file2: "
cat > "$file2"
echo "The differences of both the files are saved in $file3"
diff -a "$file1" "$file2" > "$file3"
cat "$file3"
