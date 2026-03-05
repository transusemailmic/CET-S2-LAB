#!/bin/bash
# Start printing from a certain line after inputting the contents

read -p "Enter the file name: " file1
echo "Enter the contents of the file $file: "
cat > "$file1"
read -p "Enter the number: " l
echo "Start printing from line $l"
tail +$l $file1
