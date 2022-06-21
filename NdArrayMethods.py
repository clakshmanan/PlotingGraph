# Note :  Numpy is faster than list
# pip install numpy
'''
import numpy
import numpy as np

print("The Version of numpy is :", np.__version__)

myarray =  numpy.array([1,2,3,4,5])
print("The list of array is :",myarray)
print()
myarray = np.array(["one", "two", "three", "four"])
print("The is list of array is:", myarray)
'''
# Create a numpy ndarray object by using the array() function
import numpy as np

cusArray = np.array(["chennai", "madurai","salem", "karur"])
print(cusArray)
print(type(cusArray))
print(id(cusArray))
print(len(cusArray))

# Finding Array Shape
ArrayShape = np.array([[1, 2, 3, 4], [5, 6, 7, 8], [5, 6, 7, 8]])
print("The shape of array is:",ArrayShape.shape) 

for runner in ArrayShape: # 3 row and 4 column matrix form
	print(runner)


ArrayBox = np.array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) # reshape command provide single into rqed matrix form
newarr = ArrayBox.reshape(4, 3)
print(newarr) 

arrayValue = np.array(['one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'])
getValue = arrayValue.reshape(3,3)
print(getValue)
print()
print(arrayValue.shape)
print(type(arrayValue))

for duck in arrayValue:
	print("the arrayValue is:", duck)




