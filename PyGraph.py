
# Function to print the graph
def grapher(arr) :
    # Declaring the required variables
    sum, peak, sumOfInput = 0, 0, 0
    sumArr, peakArr=[],[]
    temp,symbpos,negative=0, 0, 0
    
# Loop for finding the cummulative sum
    i = 0
    while (i < len(arr)) :
        temp+=arr[i]
        sumArr.append(temp)
        sumOfInput += arr[i]
        if (i % 2 == 0) :
            sum += arr[i]
        else :
            sum -= arr[i]
        if sum<0:
            negative-=sum
        peakArr.append(sum)
        peak = max(sum,peak)
        i += 1

    i = 0
    # To find the position of symbol
    while(i<len(peakArr)):
        if peakArr[i] == peak:
            symbpos=i
        i += 1

    # Declaring a 2-D array
    graph = [[0] * (sumOfInput+1) for _ in range(peak+2+negative)]
    
    # Declaring the start of row,column and filler=0
    startRow = peak
    startColumn = 0
    filler = 0
    
    # Assigning 1, -1, accordingly to the 2-D array
    i = 0
    while (i < len(arr)) :
        if (i % 2 == 0) :
            filler = 1
        else :
            filler = -1
        j = 0
        while (j < arr[i]) :
            if startColumn == sumArr[symbpos]:
                startColumn += 1
            graph[startRow][startColumn] = filler
            startColumn += 1
            if (j != arr[i] - 1) :
                if (filler > 0) :
                    startRow -= 1
                else :
                    startRow += 1
            j += 1
        i += 1

    #printing the symbol
    print()
    print(" "*(sumArr[symbpos]-1)+" o")
    print(" "*(sumArr[symbpos]-1)+"/|\\")
    print(" "*(sumArr[symbpos]-1)+"< >",end="")
    
    # Printing the graph
    i = 0
    while (i <= peak+negative) :
        j = 0
        while (j <= sumOfInput) :
            if (graph[i][j] == 1) :
                print("/", end ="")
            elif(graph[i][j] == -1) :
                    print("\\", end ="")
            else :
                    print(" ", end ="")
            j += 1
        print()
        i += 1

# Main function
if __name__=="__main__":
    index=[]
    str=input("Enter the input (Separated by space):")
    # Removing the white space at the beginning and at the end of the input
    str=str.strip()
    index = list(str.split(" "))
    index = [int(i) for i in index]
    if 0 in index:
        index.remove(0)

    grapher(index)