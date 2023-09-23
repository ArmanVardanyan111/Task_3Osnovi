/*fun main(args: Array<String>) {
    var text = "136"
    var text_ = ""
    var x = text.toInt()

    while(x != 1)
    {
        var a = x/2
        x -= a*2
        text_ += x
        x = a
    }
    text_ += x

    print(text_)
}*/

fun main(args: Array<String>) {
    var text = "2"
    var text_ = ""
    var x = text.toInt()

    while(x != 1)
    {
        var a = x/2
        x -= a*2
        text_ += x
        x = a
    }
    text_ += x
    print(text_.reversed())
}