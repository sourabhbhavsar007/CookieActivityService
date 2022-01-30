## CookieActivityService

### We aim to find out the "Most Active Cookie" from a given csv file:

Given a cookie log file in the following format:

cookie,timestamp 
AtY0laUfhglK3lC7,2018-12-09T14:19:00+00:00 
SAZuXPGUrfbcn5UA,2018-12-09T10:13:00+00:00 
5UAVanZf6UtGyKVS,2018-12-09T07:25:00+00:00 
AtY0laUfhglK3lC7,2018-12-09T06:19:00+00:00 
SAZuXPGUrfbcn5UA,2018-12-08T22:03:00+00:00 
4sMM2LxV07bPJzwf,2018-12-08T21:30:00+00:00 
fbcn5UAVanZf6UtG,2018-12-08T09:30:00+00:00 
4sMM2LxV07bPJzwf,2018-12-07T23:30:00+00:00


We tried to implement the solution using a HashMap, wherein we read the data given in csv file and populate our HashMap with the key as cookie, and try to find most active cookie present. Also, exception handling is implemented to take care of undesired scenarios.



### Output Screenshot : We see that our code performs as expected and we get the desired outputs. Exceptions are also handled.

<img width="1405" alt="cookie_output" src="https://user-images.githubusercontent.com/30754286/151715713-ba05ecb8-8d2d-4be3-aa4c-eb97d97902cd.png">

