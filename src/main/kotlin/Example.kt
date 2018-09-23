import kotlin.js.Math
import kotlin.math.floor

val shapes = mutableListOf<Circle>()

fun main(args: Array<String>) {
    command("addCircle") {
        shapes.add(Circle(randWidth(), randHeight(), randDelta(), randDelta()))
    }

    command("addCircles") {
        for (i in 0..arguments[0].toString().toInt()) {
            shapes.add(Circle(randWidth(), randHeight(), randDelta(), randDelta()))
        }
    }

    register("renderOverlay") {
        shapes.forEach { it.draw() }
    }

    register("step") {
        shapes.forEach { it.update() }
    }.to<OnStepTrigger> {
        setFps(120)
    }
}

fun randWidth() = random(Renderer.screen.getWidth())
fun randHeight() = random(Renderer.screen.getHeight())
fun randDelta() = (Math.random() - 0.5).toFloat()
fun randColor() = Renderer.color(random(255).toInt(), random(255).toInt(), random(255).toInt())

fun random(upper: Int) = floor(Math.random() * upper).toFloat()

class Circle(private var x: Float, private var y: Float, private var dx: Float = 0f, private var dy: Float = 0f) {
    private val shape = Renderer.shape(randColor()).setCircle(0f, 0f, 5f, 20)

    fun draw() {
        Renderer.translate(x, y)
        this.shape.draw()
    }

    fun update() {
        this.x += this.dx
        this.y += this.dy

        if (this.x > Renderer.screen.getWidth() || this.x < 0) this.dx = -this.dx
        if (this.y > Renderer.screen.getHeight() || this.y < 0) this.dy = -this.dy
    }
}