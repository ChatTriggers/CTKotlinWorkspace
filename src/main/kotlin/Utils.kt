external fun register(type: String, method: () -> Unit): OnTrigger
external fun print(text: String)
external val arguments: Array<Any?>
external fun cancel(event: Any?)
external val Java: dynamic

fun <T : OnTrigger> OnTrigger.to(editor: T.() -> Unit): T {
    val inst = this.unsafeCast<T>()
    inst.editor()
    return inst
}

fun command(name: String, method: () -> Unit): OnCommandTrigger {
    return register("command", method).to {
        setName(name)
    }
}
