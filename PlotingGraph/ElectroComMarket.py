
# A simple grap using numpy and matplotlib

Electrocom = """
	ys = Electrocom's market approach
	x  =  Strategy Market Range
	Electrocom would like to see the ploting range between
	Market approach and Strategy approach
						"""
print("Result of Electrocom is:", Electrocom)

import numpy as np
from matplotlib import pyplot as plt

ys = 200 + np.random.randn(90)
x = [x for x in range(len(ys))]

plt.plot(x, ys, '-')
plt.fill_between(x, ys, 265, where=(ys > 265), facecolor='g', alpha=0.6)

plt.title("Electrocom_Sales_Information")
plt.show()


