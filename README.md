# ken virtual pet

(Which gradually turned into a cat as animation took over....)

This game functions best if the console is maximized.

In this game, the user is an old cat lady. The user inputs a name, and more importantly, an age for her cat. The cat's age will set instance variables and also determine behaviors for the cat. An older cat is less hungry, but also tires quickly, for example. A younger cat has a stronger desire to hunt, and doesn't tire as easily.

The game loop follows the course of an afternoon during which the cat lady must prepare for a party, and tend to the cat as well. Choices the user makes affect the cat in different and overlapping ways.

At the conclusion of the party, the state of the cat is evaluated based on levels of hunger, fatigue, and anxiety, and also based on whether or not the cat has been overfed and barfed. (This is animated of course.) The user is then given a message based on how content the cat is after the day.

There are various extra methods near the top of the App class. These deal with user input possibilites, correct the capitalization of the pet's name, and also construct a possessive version of the cat's name. 

space()  - adds space to the console print display
displayTime()  - uses the tick variable to print the time
validInteger()  -takes Scanner and also an int value. It determines whether or not the user has entered a valid number, and also ensures that the number is within a given range.
capitalize() - capitalizes the first letter in the name, in case user has not done so.
possessiveVersion() - adds an "'s" to the name, or a "'" if the name already ends in "s".
introAndVariableSet() - introduces the game, sets instance variables, and controls for problems with user input.
displayStory() - this is the set of story lines which are displayed throughout the main loop
feedPet() - calls various feeding other methods in case the user chooses to feed the pet
menu() -calls methods in the Pet class based on user input

in main, after the intro and loop, is a final statement, including an array of "finalMessages" strings.






