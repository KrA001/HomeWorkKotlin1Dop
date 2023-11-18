import java.util.Scanner

fun main(args: Array<String>) {
    val carPrint = Car()
    val carsMers = Cars("Mersedes", "AMG", "V8", 1880, "Black")
    val carsBmv = Cars("Bmv", "F90", "v8", 2000, "Black")
    val carsMazda = Cars("Mazda", "E626", "v6", 1900, "White")
    val carsBugattiChiron = Cars("Bugatti", "BugattiChiron", "v12", 1995, "Black")
    val list = listOf(
        carsMers,
        carsBmv,
        carsMazda,
        carsBugattiChiron
    )

    println("Выберите из пречисленного ммодели машины c 1 до 4")
    for (i in list.indices) {
        var number = i + 1
        println("$number) ${list[i].carMake}")
    }
    val scanner = Scanner(System.`in`)
    println("----------------------------")
    print("Введите номер:")

    val number = scanner.nextInt() - 1
    // тут это для пробела println("") немного для красаты
    println("")
    for (i in list.indices) {
        if (i == number) {
            carPrint.cars(list[i])
        }
    }
}