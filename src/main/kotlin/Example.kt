import kotlin.js.Math
import kotlin.math.floor

val shapes = mutableListOf<Circle>()

fun main(args: Array<String>) {
    register("chat") {
        shapes.add(
                Circle(randWidth(), randHeight())
        )
    } as OnChatTrigger

    register("renderOverlay") {
        shapes.forEach {
            it.draw()
        }
    }
}

fun randWidth() = random(Renderer.screen.getWidth())
fun randHeight() = random(Renderer.screen.getHeight())

fun random(upper: Int): Float {
    return floor(Math.random() * upper).toFloat()
}

class Circle(private val x: Float, private val y: Float) {
    fun draw() {
        Renderer.drawRect(0xff00AADD.toInt(), x, y, 10f, 10f)
    }
}