# 344Project1
Multi threading to simulate story

Simulating a story where passengers are boarding a plane with a capacity of 30 people. Once 30 people fill the plane, it takes off and additional passengers are disregarded.
The plane consists of 3 zones where the passengers board and depart one at a time. Once the plane lands, the passengers begin to depart from their respective zones (they are notified by the flight attendant).

Each passenger has it's own thread, 2 flight attendant threads for telling the passengers when to board and depart, a checking counter thread for assisting passengers when arriving, and a clock thread that simulates time.

The program simulates synchronization between passengers by using Monitors.
