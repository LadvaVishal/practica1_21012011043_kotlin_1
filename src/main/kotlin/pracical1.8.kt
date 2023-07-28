import java.util.Arrays

fun main()
{
    var arr1= arrayOf(1,4,31,43,2)
    println("Using arrayof function:")
    println(Arrays.deepToString(arr1))

    var arr2=IntArray(5)
    arr2[0]=1
    arr2[1]=20
    arr2[2]=3
    arr2[3]=42
    arr2[4]=5
    println("Using IntArray function:")

    for (i in 0..arr2.size-1)
    {
        print(" "+arr2[i])
    }

   var arr3= intArrayOf(11,12,13,13,14,15)
    println("\nUsing intArrayof function:")

    for (i in 0..arr3.size-1)
    {
        print(" "+arr3[i])
    }

  var arr_2D= arrayOf( arrayOf(1,2,3),
                       arrayOf(4,5,6)
                        )
    println("\n2D array example: \n"+Arrays.deepToString(arr_2D))

    println("*********With built-in function**********")
    println("Origional array: ")
    println(Arrays.deepToString(arr1))
    arr1.sort()
    println("\nAfter Sorting with built-in function : ")

    for (elements in arr1)
    {
    print(" "+elements)
    }
    println("")

    println("*********Without built-in function**********")
    println("Origional array: ")
    for (i in 0..arr2.size-1)
    {
        print(" "+arr2[i])
    }
    bubbleSort(arr2)
    println("\nAfter Sorting without built-in function : ")
    for (elements in arr2)
    {
        print(" "+elements)
    }
    println("")
}

fun bubbleSort(arr1: IntArray) {
    var n = arr1.size
    for (i in 0 until n-1)
    {
        for (j in 0 until n-i-1)
       {
            if (arr1[j] > arr1[j+1])
          { var temp = arr1[j]
              arr1[j] = arr1[j+1]
              arr1[j+1] = temp
    }
    }
    }
}
