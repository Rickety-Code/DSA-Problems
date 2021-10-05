There is a garage with a single mechanic. You are given an array `customers`, where `customers[i] = [arrival_i, time_i]:`

-   `arrival_i` is the arrival time of the `ith` customer. The arrival times are sorted in non-decreasing order.
-   `time_i` is the time needed to repair the car of the `ith` customer.

When a customer arrives, he gives the mechanic his car, and the chef starts repairing it once he is idle. The customer waits till the mechanic finishes repairing his order. The mechanic does not repair a car of more than one customer at a time. The mechanic repairs the car for customers in the order they were given in the input.

Return the average waiting time of all customers. Solutions shall be `10^-5` from the actual answer.
