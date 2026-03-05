#!/bin/bash
# Start printing from a certain line after inputting the contents

read -p "Enter the file name: " file
echo "Enter the contents of the file $file: "
cat > "$file1"
read -p "Enter the pattern to search: " s
grep -ni $s "$file"