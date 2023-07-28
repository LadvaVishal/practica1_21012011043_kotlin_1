import java.util.*
fun main()
{
    var arr1= arrayOf(1,2,3,4,5)
    println("Using arrayof function:")
    println(Arrays.deepToString(arr1))
    var m=arr1.max();
    println("Maximum Value using inbuilt function:"+m)

    var max=0;
    for (i in arr1){
        if(i>max)
        {
            max=i;
        }
    }
    println("Maximum value using user define function:"+max)

}