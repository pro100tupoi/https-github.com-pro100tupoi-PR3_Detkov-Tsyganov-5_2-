import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Ввод первой точки
    val pointA = inputPoint(scanner, "A")

    // Ввод второй точки
    val pointB = inputPoint(scanner, "B")

    // Вычисление расстояния между точками
    val distance = pointA.distanceTo(pointB)

    // Вывод результата
    println("Расстояние между точками $pointA и $pointB равно $distance.")
}

fun inputPoint(scanner: Scanner, pointName: String): Point {
    while (true) {
        try {
            println("Введите координаты точки $pointName (формат: x y):")
            val input = scanner.nextLine().trim().split(" ")
            if (input.size != 2) throw IllegalArgumentException("Неверный формат ввода.")

            val x = input[0].toDouble()
            val y = input[1].toDouble()
            return Point(x, y)
        } catch (e: NumberFormatException) {
            println("Ошибка: введите числовые значения для координат.")
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }
}