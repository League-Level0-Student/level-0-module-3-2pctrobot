int number = 99;
int looper = 0;
while(looper < 99) {
print(number);
println(" bottles of beer on the wall.");
print(number);
println(" bottles of beer! Take one down, pass it around.");
number -= 1;
print(number);
println(" bottles of beer on the wall!");
looper += 1;
}
println("No bottles of beer on the wall! No bottles of beer! Go to the store and buy some more. 99 bottles of beer on the wall!");
