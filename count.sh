
#!/bin/bash

# Check if the file exists
if [ ! -f "$1" ]; then
    echo "File not found!"
    exit 1
fi

# Calculate number of characters, words, spaces, and special characters
char=$(wc -m < "$1")
word=$(wc -w < "$1")
space=$(grep -o ' ' "$1" | wc -l)
special=$(grep -o '[^[:alnum:] ]' "$1" | wc -l)

# Print the results
echo -e "Characters: $char\nWords: $word\nWhitespaces: $space\nSpecial 
if [ ! -f "$1" ]; then
    echo "File not found!"
    exit 1
fi
char=$(wc -m < "$1")
word=$(wc -w < "$1")
space=$(grep -o ' ' "$1" | wc -l)
special=$(grep -o '[^[:alnum:] ]' "$1" | wc -l)
echo -e "Characters:$char\nWords:$word\nWhitespaces:$space\nSpecial characters:$special"
