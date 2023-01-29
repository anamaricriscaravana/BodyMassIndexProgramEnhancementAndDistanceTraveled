/**********************************
Caravana, Ana Maricris A.
BSCpE 1-1

IV - Programming Exercise
    C++
    2. Distance Traveled
**********************************/

#include <iostream>
using namespace std;

void CalculateDistanceTraveled(int speed, int time);

int main ()
{
    int speed;
    int time;

    cout << " " << endl;
    cout << "Hello!" << endl;
    cout << " " << endl;
    cout << "This program calcuates the Distance Traveled" << endl;
    cout << " " << endl;
    
    cout << " " << endl;
    cout << "If you want to continue" << endl;
    cout << "Please enter the speed of the vehicle in miles per hour (MPH): " << endl;
    cin >> speed;
    cout << " " << endl;

    cout << " " << endl;
    cout << "If you want to continue" << endl;
    cout << "Please enter the traveled hours: " << endl;
    cin >> time;
    cout << " " << endl;

    CalculateDistanceTraveled(speed, time);

    return 0;
}
void CalculateDistanceTraveled(int speed, int time)
{
    cout << "Hour\t\tDistance Traveled" << endl;
    cout << "----            -----------------"<< endl;
    for (int hours = 0; hours < time; hours++)  
    {
        int distance = speed * (hours + 1);
        cout << (hours + 1) << "\t\t" << distance << endl;
    }
}