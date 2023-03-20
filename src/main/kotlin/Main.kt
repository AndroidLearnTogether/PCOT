import javax.swing.JButton
import javax.swing.JFrame

fun main(args: Array<String>) {
    val frame = JFrame("Kotlin Swing App")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

    val button = JButton("Click me!")
    frame.add(button)

    frame.pack()
    frame.isVisible = true;
}