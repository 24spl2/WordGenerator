# WordGenerator
Takes a text file and creates a small text based off of the input data

Three classes WordGen, Table, and Frequency List all work together to create a randomized text.

WordGen takes an input file, and breaks the file into chunks of 5 characters. Everytime a combination is seen (ex. a: aprons, p:rons  , r:ons w), it is added to the Table. If it is seen again, the frequency list is updated. 

To make a text, it (for a given amount of characters), selects a weighted random character, and using randomNumberGenerator and frequency, it finds a probably letter that would follow.
