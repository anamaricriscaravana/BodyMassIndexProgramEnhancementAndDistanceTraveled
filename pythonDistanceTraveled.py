#Caravana, Ana Maricris A.
#BSCpE 1-1

#IV - Programming Exercise
#   Phython
#   2.  Distance Traveled

def main():
    print (" ")
    print ("Hello!")
    print (" ")
    print ("This program calcuates the Distance Traveled")
    print (" ")
    print ("If you want to continue")
    speed = int(input("Please enter the speed of the vehicle in miles per hour (MPH): "))
    print (" ")
    print ("If you want to continue")
    time = int(input("Please enter the traveled hours: "))
    print (" ")
    
    CalculateDistanceTraveled(speed, time)

def CalculateDistanceTraveled(speed, time):
    print("Hour\t\tDistance Traveled")
    print("----            -----------------")
   
    for time in range (1, time+1):
        distance = speed * time

        print(str(time), "\t\t", str(distance))

main ()
