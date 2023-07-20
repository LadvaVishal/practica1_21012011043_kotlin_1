import java.util.Arrays

fun main()
{

    var arr1= arrayOf(1,2,3,4,5)
    println("Using arrayof function:")
    println(Arrays.deepToString(arr1))

    var arr2=IntArray(5)
    arr2[0]=1
    arr2[1]=2
    arr2[2]=3
    arr2[3]=4
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
//   var sort1=arr1.sort()
//    println("Sorted array  using Built in function")
//    println("Origional array: ")
//    println(Arrays.deepToString(arr1))
//    println(Arrays.deepToString(sort1))

//    var arr4=Array<Int>(5){i:Int->1}
//    for (i
  // 2D array
  var arr_2D= arrayOf( arrayOf(1,2,3),
                       arrayOf(4,5,6)
                     )
    println("\n2D array example: \n"+Arrays.deepToString(arr_2D))
    println("\n2D array example: \n"+Arrays.deepToString(arr_2D[0]))

}