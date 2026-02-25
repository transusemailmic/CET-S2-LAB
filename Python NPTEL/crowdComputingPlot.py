import matplotlib.pyplot as plt
import statistics
data=[145, 230, 512, 678, 890, 1200, 1567, 1789, 1345, 999, 432, 876, 1543, 1678, 1890, 245, 367, 489, 590, 1023, 1111, 1432, 1765, 1888, 1999, 210, 345, 567, 789, 910, 134, 278, 356, 444, 520, 610, 705, 820, 940, 1050, 1175, 1290, 1405, 1520, 1635, 1740, 1855, 1960, 250, 375, 498, 622, 745, 869, 993, 1117, 1241, 1365, 1489, 1613, 1737, 1861, 1985, 300, 425, 550, 675, 800, 925, 1055, 1180, 1305, 1430, 1555, 1680, 1805, 1930, 222, 333, 444, 555, 666, 777, 888, 999, 1110, 1221, 1332, 1443, 1554, 1665, 1776, 1887, 1998, 150, 275, 400, 525, 650, 775]
y=[]
data.sort()
tv=int(0.1*len(data))
data=data[tv:len(data)-tv]
for i in range(len(data)):
    y.append(5)
mean=statistics.mean(data)
median=statistics.median(data)
plt.plot(data,y,'r--')
plt.plot(mean,5,'gx', markersize="10")
plt.plot(median,5,'bx', markersize="10")
plt.xlabel("X Axis")
plt.ylabel("Y Axis")