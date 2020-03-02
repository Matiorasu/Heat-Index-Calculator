# Heat-Index-Calculator

# Project Summary
This program is meant to take the humidity and other relevant factors from the user to calculate the Heat Index. Let's assume that I know the temperature outside to be 97 degrees farenheit, and the humidity in the air is two percent. The program will take these inputs, calculate what it feels like outside, and output the result.

# Running our Program
The program will run effectively on a compiler compliance level of Java 1.8 or higher.

To execute the program, download the repository, compile the source code, and run.

# Class Documentation
There are four total classes utilized by this program--

# HeatIndexCalculator (int CurrentTemp, double currentHumidity)
Takes inputs of the current temperature in degrees farenheit and current humidity as a percentage. These values are stored to be called later by the next class

# calculateHeatIndex (int currentTemp, double currentHumidity)
This class does all of the heavy lifting concerning computation, taking our values (from the class HeatIndexCalculator) and plugging them into a very lengthy mathematical expression to calculate the heat index.

# printHeatIndex (int currentTemp, double currentHumidity, double calculatedHeatIndex)
This class calls the calues calculated in our previous class and displays them with tidy, easy-to-read formatting, displaying both the value for temperature and humidity before giving you the current heat index.

# HeatIndexCalculatorTester
This class creates a scanner to allow for the input of the values heat and humidity (stored here as tempNow and humidityNow), then calls the classes from our other package to perform their individual work. In this case, they are also methods for this package. The information is then stored as an object of the class as the computer waits for an input to confirm the end of the program.
