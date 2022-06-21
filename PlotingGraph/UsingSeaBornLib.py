# Finding joint, marginal conditional probability in python coding

'''
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
import pandas as pd
'''
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

exValue = int (input("Enter your value to determine the graph:"))
x,y = np.random.randn(exValue), np.random.randn(exValue)**2

plt.hist2d (x, y, 30, vmax=20)
plt.xlabel("x")
sns.jointplot(x,y)
plt.show()
plt.ylabel('$x^2$')
plt.show()

