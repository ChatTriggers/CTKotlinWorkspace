@file:Suppress("UNUSED")

external object ChatLib {
    fun chat(text: Any)
    fun actionBar(text: Any)
    fun simulateChat(text: Any)
    fun say(text: String)
    fun command(text: String)
    fun clearChat()
    fun clearChat(vararg chatLineIDs: Int)
    fun getChatBreak(separator: String = definedExternally): String
    fun getChatWidth(): Int
    fun removeFormatting(text: String): String
    fun replaceFormatting(text: String): String
    fun getCenteredText(text: String): String
    fun editChat(regexp: dynamic, vararg replacements: Message)
    fun editChat(toReplace: String, vararg replacements: Message)
    fun editChat(toReplace: Message, vararg replacements: Message)
    fun editChat(chatLineId: Int, vararg replacements: Message)
    fun getChatLines(): List<String>
    fun getChatMessage(event: dynamic, formatted: Boolean = definedExternally): String
    fun addColor(message: String?): String
    fun isPlayer(out: String): Boolean
}
external object EventLib {
    fun getButtonState(event: dynamic): Boolean
    fun getType(event: dynamic): Int
    fun getMessage(event: dynamic): dynamic
    fun getName(event: dynamic): String
    fun getModId(event: dynamic): String
    fun cancel(event: Any)
}
external object FileLib {
    fun write(importName: String, fileName: String, toWrite: String)
    fun write(fileLocation: String, toWrite: String)
    fun read(importName: String, fileName: String): String?
    fun read(fileLocation: String): String?
    fun read(file: dynamic): String?
    fun getUrlContent(theUrl: String, userAgent: String? = definedExternally): String
    fun deleteDirectory(dir: dynamic): Boolean
    fun unzip(zipFilePath: String, destDirectory: String)
}
external object MathLib {
    fun map(number: Float, in_min: Float, in_max: Float, out_min: Float, out_max: Float): Float
    fun clampFloat(number: Float, min: Float, max: Float): Float
    fun clamp(number: Int, min: Int, max: Int): Int
}
external class Image(image: dynamic) {
    fun getTextureWidth(): Int
    fun getTextureHeight(): Int
    fun getTexture(): dynamic
    fun onRender(event: dynamic)
    fun draw(x: Double, y: Double, width: Double = definedExternally, height: Double = definedExternally): Image
}
external class Rectangle(color: Int, x: Float, y: Float, width: Float, height: Float) {
    fun getColor(): Int
    fun setColor(color: Int): Rectangle
    fun getX(): Float
    fun setX(x: Float): Rectangle
    fun getY(): Float
    fun setY(y: Float): Rectangle
    fun getWidth(): Float
    fun setWidth(width: Float): Rectangle
    fun getHeight(): Float
    fun setHeight(height: Float): Rectangle
    fun isShadow(): Boolean
    fun setShadow(shadow: Boolean): Rectangle
    fun getShadowOffset(): dynamic
    fun getShadowOffsetX(): Float
    fun getShadowOffsetY(): Float
    fun setShadowOffset(x: Float, y: Float): Rectangle
    fun setShadowOffsetX(x: Float): Rectangle
    fun setShadowOffsetY(y: Float): Rectangle
    fun getShadowColor(): Int
    fun setShadowColor(color: Int): Rectangle
    fun setShadow(color: Int, x: Float, y: Float): Rectangle
    fun getOutline(): Boolean
    fun setOutline(outline: Boolean): Rectangle
    fun getOutlineColor(): Int
    fun setOutlineColor(color: Int): Rectangle
    fun getThickness(): Float
    fun setThickness(thickness: Float): Rectangle
    fun setOutline(color: Int, thickness: Float): Rectangle
    fun draw(): Rectangle
}
external object Renderer {
    fun getColor(color: Int): Int
    fun getFontRenderer(): dynamic
    fun getStringWidth(text: String, removeFormatting: Boolean = definedExternally): Int
    fun color(red: Int, green: Int, blue: Int, alpha: Int = definedExternally): Int
    fun getRainbow(step: Float, speed: Float = definedExternally): Int
    fun getRainbowColors(step: Float, speed: Float = definedExternally): IntArray
    fun translate(x: Float, y: Float)
    fun scale(scaleX: Float, scaleY: Float = definedExternally)
    fun rotate(angle: Float)
    fun colorize(red: Int, green: Int, blue: Int, alpha: Int = definedExternally)
    fun image(name: String, url: String): Image?
    fun text(text: String, x: Float, y: Float): Text
    fun text(text: String): Text
    fun rectangle(color: Int, x: Float, y: Float, width: Float, height: Float): Rectangle
    fun shape(color: Int): Shape
    fun drawRect(color: Int, x: Float, y: Float, width: Float, height: Float)
    fun drawString(text: String, x: Float, y: Float)
    fun drawStringWithShadow(text: String, x: Float, y: Float)
    fun drawImage(image: Image, x: Double, y: Double, width: Double, height: Double)
    fun drawPlayer(player: Any, x: Int, y: Int, rotate: Boolean)
    fun finishDraw()
    object screen {
        fun getWidth(): Int
        fun getHeight(): Int
        fun getScale(): Int
    }
}
external class Shape(color: Int) {
    fun copy(): Shape
    fun clone(): Shape
    fun getColor(): Int
    fun setColor(color: Int): Shape
    fun getDrawMode(): Int
    fun setDrawMode(drawMode: Int): Shape
    fun getVertexes(): List<dynamic>
    fun addVertex(x: Float, y: Float): Shape
    fun insertVertex(index: Int, x: Float, y: Float): Shape
    fun removeVertex(index: Int): Shape
    fun setLine(x1: Float, y1: Float, x2: Float, y2: Float, thickness: Float): Shape
    fun setCircle(x: Float, y: Float, radius: Float, steps: Int): Shape
    fun draw(): Shape
}
external class Text(string: String, x: Float = definedExternally, y: Float = definedExternally) {
    fun getString(): String
    fun setString(string: String): Text
    fun getColor(): Int
    fun setColor(color: Int): Text
    fun getFormatted(): Boolean
    fun setFormatted(formatted: Boolean): Text
    fun getShadow(): Boolean
    fun setShadow(shadow: Boolean): Text
    fun getAlign(): DisplayHandler.Align
    fun setAlign(align: Any): Text
    fun getX(): Float
    fun setX(x: Float): Text
    fun getY(): Float
    fun setY(y: Float): Text
    fun getWidth(): Int
    fun setWidth(width: Int): Text
    fun getLines(): List<String>
    fun getMaxLines(): Int
    fun setMaxLines(maxLines: Int): Text
    fun getScale(): Float
    fun setScale(scale: Float): Text
    fun getMaxWidth(): Int
    fun getHeight(): Float
    fun exceedsMaxLines(): Boolean
    fun draw(x: Float? = definedExternally, y: Float? = definedExternally): Text
    override fun toString(): String
}
external object Tessellator {
    fun bindTexture(texture: Image): Tessellator
    fun begin(drawMode: Int = definedExternally, textured: Boolean = definedExternally): Tessellator
    fun colorize(red: Float, green: Float, blue: Float, alpha: Float = definedExternally): Tessellator
    fun rotate(angle: Float, x: Float, y: Float, z: Float): Tessellator
    fun translate(x: Float, y: Float, z: Float): Tessellator
    fun scale(x: Float, y: Float = definedExternally, z: Float = definedExternally): Tessellator
    fun pos(x: Float, y: Float, z: Float): Tessellator
    fun tex(u: Float, v: Float): Tessellator
    fun draw()
    fun drawString(text: String, x: Float, y: Float, z: Float, renderBlackBox: Boolean, partialTicks: Float, scale: Float, color: Int, increase: Boolean)
}
abstract external class XMLHttpRequest {
    fun addRequestHeader(key: String, value: String)
    fun setCallbackMethod(method: Any)
    fun send(vararg parameters: String)
    fun send()
    fun getResponseHeader(headerName: String): String?
}
external class Book(bookName: String) {
    fun addPage(message: Message): Book
    fun addPage(message: String): Book
    fun setPage(pageNumber: Int, message: Message): Book
    fun updateBookScreen(pages: dynamic)
    fun display(page: Int = definedExternally)
    fun isOpen(): Boolean
    fun getCurrentPage(): Int
}
external object CPS {
    fun update(event: dynamic)
    fun click(event: dynamic)
    fun getLeftClicksMax(): Int
    fun getRightClicksMax(): Int
    fun getLeftClicks(): Int
    fun getRightClicks(): Int
    fun getLeftClicksAverage(): Int
    fun getRightClicksAverage(): Int
}
abstract external class Display {
    constructor()
    constructor(any: dynamic)
    fun getBackgroundColor(): Int
    fun setBackgroundColor(backgroundColor: Int): Display
    fun getTextColor(): Int
    fun setTextColor(textColor: Int): Display
    fun getBackground(): DisplayHandler.Background
    fun setBackground(background: Any): Display
    fun getAlign(): DisplayHandler.Align
    fun setAlign(align: Any): Display
    fun getOrder(): DisplayHandler.Order
    fun setOrder(order: Any): Display
    fun setLine(index: Int, line: Any): Display
    fun getLine(index: Int): DisplayLine
    fun getLines(): List<DisplayLine>
    fun setLines(lines: MutableList<DisplayLine>): Display
    fun addLine(index: Int = definedExternally, line: Any)
    fun addLines(vararg lines: Any): Display
    fun clearLines(): Display
    fun getRenderX(): Float
    fun setRenderX(renderX: Float): Display
    fun getRenderY(): Float
    fun setRenderY(renderY: Float): Display
    fun setRenderLoc(renderX: Float, renderY: Float): Display
    fun getShouldRender(): Boolean
    fun setShouldRender(shouldRender: Boolean): Display
    fun getWidth(): Float
    fun getHeight(): Float
    fun getMinWidth(): Float
    fun setMinWidth(minWidth: Float): Display
    fun render()
    override fun toString(): String
}
external object DisplayHandler {
    fun registerDisplay(display: Display)
    fun clearDisplays()
    fun renderDisplays(event: dynamic)
    enum class Background {
        NONE, FULL, PER_LINE;
    }
    enum class Align {
        NONE, LEFT, CENTER, RIGHT;
    }
    enum class Order {
        UP, DOWN;
    }
}
abstract external class DisplayLine {
    constructor(text: String)
    constructor(text: String, config: dynamic)
    fun getText(): Text
    fun setText(text: String): DisplayLine
    fun getTextColor(): Int?
    fun setTextColor(color: Int): DisplayLine
    fun getTextWidth(): Float
    fun setShadow(shadow: Boolean): DisplayLine
    fun setScale(scale: Float): DisplayLine
    fun getAlign(): DisplayHandler.Align?
    fun setAlign(align: Any?): DisplayLine
    fun getBackground(): DisplayHandler.Background?
    fun setBackground(background: Any?): DisplayLine
    fun getBackgroundColor(): Int?
    fun setBackgroundColor(color: Int): DisplayLine
    fun registerClicked(method: Any)
    fun registerHovered(method: Any)
    fun registerDragged(method: Any)
    fun drawLeft(x: Float, y: Float, maxWidth: Float, background: DisplayHandler.Background, backgroundColor: Int, textColor: Int)
    fun drawRight(x: Float, y: Float, maxWidth: Float, background: DisplayHandler.Background, backgroundColor: Int, textColor: Int)
    fun drawCenter(x: Float, y: Float, maxWidth: Float, background: DisplayHandler.Background, backgroundColor: Int, textColor: Int)
    override fun toString(): String
}
abstract external class Gui  {
    fun close()
    fun isOpen()
    fun isControlDown()
    fun isShiftDown()
    fun isAltDown()
    fun registerDraw(method: Any): OnRegularTrigger?
    fun registerClicked(method: Any): OnRegularTrigger?
    fun registerKeyTyped(method: Any): OnRegularTrigger?
    fun registerMouseDragged(method: Any): OnRegularTrigger?
    fun registerMouseReleased(method: Any): OnRegularTrigger?
    fun registerActionPerformed(method: Any): OnRegularTrigger?
    fun mouseClicked(mouseX: Int, mouseY: Int, button: Int)
    fun mouseReleased(mouseX: Int, mouseY: Int, button: Int)
    fun actionPerformed(button: dynamic)
    fun mouseClickMove(mouseX: Int, mouseY: Int, clickedMouseButton: Int, timeSinceLastClick: Long)
    fun handleMouseInput()
    fun drawScreen(mouseX: Int, mouseY: Int, partialTicks: Float)
    fun keyTyped(typedChar: Char, keyCode: Int)
    fun doesGuiPauseGame()
    fun setDoesPauseGame(doesPauseGame: Boolean): Gui
    fun addButton(buttonId: Int, x: Int, y: Int, buttonText: String)
    fun addButton(buttonId: Int, x: Int, y: Int, width: Int = definedExternally, height: Int = definedExternally, buttonText: String)
    fun setButtonVisibility(buttonId: Int, visible: Boolean)
}
external object GuiHandler {
    fun openGui(gui: dynamic)
    fun clearGuis()
    fun onTick(event: dynamic)
}
external class KeyBind {
    constructor(description: String, keyCode: Int)
    constructor(any: dynamic)
    fun isKeyDown(): Boolean
    fun isPressed(): Boolean
    fun getKeyCode(): Int
    fun setState(pressed: Boolean)
    fun clearKeyBinds()
}
external class Message {
    constructor(any: dynamic)
    constructor(messageParts: ArrayList<Any>)
    constructor(vararg components: Any)
    fun getChatMessage(): dynamic
    fun getMessageParts(): List<TextComponent>
    fun getChatLineId(): Int
    fun setChatLineId(id: Int): Message
    fun isRecursive(): Boolean
    fun setRecursive(recursive: Boolean): Message
    fun isFormatted(): Boolean
    fun setFormatted(formatted: Boolean): Message
    fun setTextComponent(index: Int, component: Any): Message
    fun addTextComponent(component: Any): Message
    fun addTextComponent(index: Int, component: Any): Message
    fun clone(): Message
    fun copy(): Message
    fun edit(vararg replacements: Message)
    fun chat()
    fun actionBar()
}
external class TextComponent {
    constructor(text: String)
    constructor(any: dynamic)
    fun getText(): String
    fun setText(text: String): TextComponent
    fun isFormatted(): Boolean
    fun setFormatted(formatted: Boolean): TextComponent
    fun setClick(action: String, value: String): TextComponent
    fun getClickAction(): String?
    fun setClickAction(action: String): TextComponent
    fun getClickValue(): String?
    fun setClickValue(value: String): TextComponent
    fun setHover(action: String, value: String): TextComponent
    fun getHoverAction(): String?
    fun setHoverAction(action: String): TextComponent
    fun getHoverValue(): String?
    fun setHoverValue(value: String): TextComponent
    fun chat()
    fun actionBar()
}
external class ParticleEffect(x: Double, y: Double, z: Double, xSpeed: Double = definedExternally, ySpeed: Double = definedExternally, zSpeed: Double = definedExternally)  {
    fun scale(scale: Float): ParticleEffect
    fun multiplyVelocity(multiplier: Float): ParticleEffect
    fun setColor(r: Float, g: Float, b: Float, a: Float? = definedExternally): ParticleEffect
    fun setColor(color: Int): ParticleEffect
    fun setAlpha(a: Float): ParticleEffect
    fun remove(): ParticleEffect
}
external class Sound(config: dynamic) {
    fun onWorldLoad()
    fun setCategory(category: String): Sound
    fun setVolume(volume: Float): Sound
    fun setPosition(x: Float, y: Float, z: Float): Sound
    fun setPitch(pitch: Float): Sound
    fun setAttenuation(model: Int): Sound
    fun play()
    fun pause()
    fun stop()
    fun rewind()
}
external object Client {
    fun getMinecraft(): dynamic
    fun getConnection(): dynamic
    fun getChatGUI(): dynamic
    fun isInChat(): Boolean
    fun isInTab(): Boolean
    fun isTabbedIn(): Boolean
    fun getKeyBindFromKey(keyCode: Int): KeyBind?
    fun getKeyBindFromKey(keyCode: Int, description: String): KeyBind
    fun getKeyBindFromDescription(description: String): KeyBind?
    fun getFPS(): Int
    fun getVersion(): String
    fun getMaxMemory(): Long
    fun getTotalMemory(): Long
    fun getFreeMemory(): Long
    fun getMemoryUsage(): Int
    fun getSystemTime(): Long
    fun getMouseX(): Float
    fun getMouseY(): Float
    fun isInGui(): Boolean
    fun getCurrentChatMessage(): String
    fun setCurrentChatMessage(message: String)
    object gui {
        fun getClassName(): String
        fun close()
    }
    object camera {
        fun getX(): Double
        fun getY(): Double
        fun getZ(): Double
    }
}
open external class Block {
    constructor(any: dynamic)
    constructor(block: Block)
    constructor(blockName: String)
    constructor(blockID: Int)
    constructor(item: Item)
    fun setBlockPos(blockPos: dynamic): Block
    fun getID(): Int
    fun getRegistryName(): String
    fun getUnlocalizedName(): String
    fun getName(): String
    fun getLightValue(): Int
    fun getState(): dynamic
    fun getDefaultState(): dynamic
    fun getX(): Int
    fun getY(): Int
    fun getZ(): Int
    fun getMetadata(): Int
    fun getDefaultMetadata(): Int
    fun canProvidePower(): Boolean
    fun isPowered(): Boolean
    fun getRedstoneStrength(): Int
    fun canBeHarvested(): Boolean
    fun canBeHarvestedWith(item: Item): Boolean
    fun isTranslucent(): Boolean
    override fun toString(): String
}
external class Sign(block: Block) : Block {
    fun getLines(): List<Message>
    fun getFormattedLines(): List<String>
    fun getUnformattedLines(): List<String>
    override fun toString(): String
}
external class Chunk(chunk: dynamic) {
    fun getAllEntities(): List<Entity>
    fun getAllEntitiesOfType(clazz: dynamic): List<Entity>
}
open external class Entity(entity: dynamic) {
    fun getX()
    fun getY()
    fun getZ()
    fun getPitch(): Double
    fun getYaw(): Double
    fun getMotionX(): Double
    fun getMotionY(): Double
    fun getMotionZ(): Double
    fun getHP(): Float
    fun getRiding(): Entity?
    fun getRider(): Entity?
    fun getRiders(): List<Entity>
    fun isDead(): Boolean
    fun getWidth(): Float
    fun getHeight(): Float
    fun getEyeHeight(): Float
    open fun getName(): String
    fun getClassName(): String
    fun getUUID(): dynamic
    override fun toString(): String
}
abstract external class Action(slot: Int, windowId: Int) {
    fun setSlot(slot: Int): Action
    fun setWindowId(windowId: Int): Action
    abstract fun complete()
    fun doClick(button: Int, mode: Int)
    fun of(inventory: Inventory, slot: Int, typeString: String)
    enum class Type {
        CLICK, DRAG, KEY, DROP;
    }
}
external class ClickAction(slot: Int, windowId: Int) : Action {
    fun getClickType(): ClickType
    fun setClickType(clickType: ClickType): ClickAction
    fun getHoldingShift(): Boolean
    fun setHoldingShift(holdingShift: Boolean): ClickAction
    fun getItemInHand(): Boolean
    fun setItemInHand(itemInHand: Boolean): ClickAction
    fun setClickString(clickType: String): ClickAction
    override fun complete()
    enum class ClickType {
        LEFT, RIGHT, MIDDLE;
    }
}
external class DragAction(slot: Int, windowId: Int) : Action {
    fun getClickType(): ClickType
    fun setClickType(clickType: ClickType): DragAction
    fun getStage(): Stage
    fun setStage(stage: Stage): DragAction
    fun setClickString(clickType: String): DragAction
    fun setStageString(stage: String): DragAction
    override fun complete()
    enum class ClickType {
        LEFT, RIGHT, MIDDLE;
    }
    enum class Stage {
        BEGIN, SLOT, END;
    }
}
external class DropAction(slot: Int, windowId: Int) : Action {
    fun getHoldingCtrl(): Boolean
    fun setHoldingCtrl(holdingCtrl: Boolean): DropAction
    override fun complete()
}
external class KeyAction(slot: Int, windowId: Int) : Action {
    fun getKey(): Int
    fun setKey(key: Int): KeyAction
    override fun complete()
}
external class Inventory {
    constructor(any: dynamic)
    fun getSize(): Int
    fun getStackInSlot(slot: Int): Item
    fun getWindowId(): Int
    fun doAction(action: Action)
    fun isItemValidForSlot(slot: Int, item: Item): Boolean
    fun contains(item: Item): Boolean
    fun indexOf(item: Item): Int
    fun isContainer(): Boolean
    fun click(slot: Int, shift: Boolean): Inventory
    fun drop(slot: Int, ctrl: Boolean): Inventory
    fun drag(type: String, vararg slots: Int): Inventory
    fun getName(): String
    fun getClassName(): String
    override fun toString(): String
}
external class Item {
    constructor(any: dynamic)
    constructor(itemName: String)
    constructor(itemID: Int)
    constructor(block: Block)
    constructor(entity: Entity)
    fun getID(): Int
    fun setStackSize(stackSize: Int): Item
    fun getStackSize(): Int
    fun getUnlocalizedName(): String
    fun getRegistryName(): String
    fun getName(): String
    fun getEnchantments(): Map<String,Int>
    fun isEnchantable(): Boolean
    fun isEnchanted(): Boolean
    fun getItemNBT(): String
    fun getMetadata(): Int
    fun canPlaceOn(block: Block): Boolean
    fun canHarvest(block: Block): Boolean
    fun canDestroy(block: Block): Boolean
    fun getDurability(): Int
    fun getDamage(): Int
    fun setDamage(damage: Int): Item
    fun getMaxDamage(): Int
    fun isDamagable(): Boolean
    fun getLore(): List<String>
    fun draw(x: Float, y: Float, scale: Float = definedExternally)
    override fun equals(other: Any?): Boolean
    override fun hashCode(): Int
    override fun toString(): String
}
external class Particle(underlyingEntity: dynamic) {
    fun scale(scale: Float)
    fun multiplyVelocity(multiplier: Float)
    fun setColor(r: Float, g: Float, b: Float)
    fun setColor(r: Float, g: Float, b: Float, a: Float)
    fun setColor(color: Long)
    fun setAlpha(a: Float)
    fun setMaxAge(maxAge: Int)
    fun remove()
}
external class PlayerMP(player: dynamic) : Entity {
    fun isSpectator()
    fun getActivePotionEffects(): List<PotionEffect>
    fun getPing(): Int
    fun getItemInSlot(slot: Int): Item
    fun getDisplayName(): TextComponent
    fun setTabDisplayName(textComponent: TextComponent)
    fun setNametagName(textComponent: TextComponent)
    override fun toString(): String
    override fun getName(): String
}
external class PotionEffect(effect: dynamic) {
    fun getName(): String
    fun getAmplifier(): Int
    fun getDuration(): Int
    fun getID(): Int
    fun isAmbient(): Boolean
    fun isDurationMax(): Boolean
    fun showsParticles(): Boolean
    override fun toString(): String
}
external object Player {
    fun getPlayer(): dynamic
    fun getX(): Double
    fun getY(): Double
    fun getZ(): Double
    fun getMotionX(): Double
    fun getMotionY(): Double
    fun getMotionZ(): Double
    fun getPitch(): Float
    fun getYaw(): Float
    fun getRawYaw(): Float
    fun getName(): String
    fun getUUID(): String
    fun getHP(): Float
    fun getHunger(): Int
    fun getSaturation(): Int
    fun getArmorPoints(): Int
    fun getAirLevel(): Int
    fun getXPLevel(): Int
    fun getXPProgress(): Float
    fun getBiome(): String
    fun getLightLevel(): Int
    fun isSneaking(): Boolean
    fun isSprinting(): Boolean
    fun isFlying(): Boolean
    fun isSleeping(): Boolean
    fun facing(): String
    fun getActivePotionEffects(): List<PotionEffect>
    fun lookingAt(): Any
    fun getHeldItem(): Item
    fun getInventory(): Inventory
    fun getDisplayName(): TextComponent
    fun setTabDisplayName(textComponent: TextComponent)
    fun getOpenedInventory(): Inventory
    object armor {
        fun getHelmet(): Item
        fun getChestplate(): Item
        fun getLeggings(): Item
        fun getBoots(): Item
    }
}
external object Scoreboard {
    fun getScoreboardTitle(): String
    fun getTitle(): String
    fun getLines(descending: Boolean = definedExternally): List<dynamic>
    fun getLineByIndex(index: Int): dynamic
    fun getLinesByScore(score: Int): List<dynamic>
    fun setLine(score: Int, line: String, override: Boolean)
    fun setShouldRender(shouldRender: Boolean)
    fun getShouldRender()
    fun resetCache()
    class Score(score: dynamic) {
        fun getPoints(): Int
        fun getName(): String
        override fun toString(): String
    }
}
external object Server {
    fun getIP(): String
    fun getName(): String
    fun getMOTD(): String
    fun getPing(): Long
}
external object TabList {
    fun getNamesByObjectives(): List<String>
    fun getNames(): List<String>
}
external object World {
    fun getWorld(): dynamic
    fun isLoaded(): Boolean
    fun playSound(name: String, volume: Float, pitch: Float)
    fun playRecord(name: String, x: Double, y: Double, z: Double)
    fun showTitle(title: String, subtitle: String, fadeIn: Int, time: Int, fadeOut: Int)
    fun isRaining(): Boolean
    fun getRainingStrength(): Float
    fun getTime(): Long
    fun getDifficulty(): String
    fun getMoonPhase(): Int
    fun getSeed(): Long
    fun getType(): String
    fun getBlockAt(x: Int, y: Int, z: Int): Block
    fun getAllPlayers(): List<PlayerMP>
    fun getPlayerByName(name: String): PlayerMP
    fun hasPlayer(name: String): Boolean
    fun getChunk(x: Int, y: Int, z: Int): Chunk
    fun getAllEntities(): List<Entity>
    fun getAllEntitiesOfType(clazz: dynamic): List<Entity>
    object border {
        fun getCenterX(): Double
        fun getCenterZ(): Double
        fun getSize(): Int
        fun getTargetSize(): Double
        fun getTimeUntilTarget(): Long
    }
    object spawn {
        fun getX(): Int
        fun getY(): Int
        fun getZ(): Int
    }
    object particle {
        fun getParticleNames(): List<String>
        fun spawnParticle(particle: String, x: Double, y: Double, z: Double, xSpeed: Double, ySpeed: Double, zSpeed: Double): Particle?
        fun spawnParticle(particle: dynamic)
    }
}
external class OnChatTrigger(method: Any, type: dynamic, loader: dynamic) : OnTrigger {
    fun triggerIfCanceled(bool: Boolean): OnChatTrigger
    fun setChatCriteria(chatCriteria: String): OnChatTrigger
    fun setCriteria(chatCriteria: String)
    fun setParameter(parameter: String): OnChatTrigger
    fun setParameters(vararg parameters: String): OnChatTrigger
    fun addParameter(parameter: String): OnChatTrigger
    fun addParameters(vararg parameters: String): OnChatTrigger
    override fun trigger(vararg args: Any?)
    enum class Parameter {
        CONTAINS, START, END;
        fun getParameterByName(name: String): Parameter?
    }
}
external class OnCommandTrigger(method: Any, loader: dynamic) : OnTrigger {
    override fun trigger(vararg args: Any?)
    fun setCommandName(commandName: String): OnCommandTrigger
    fun setName(commandName: String)
}
external class OnRegularTrigger(method: Any, triggerType: dynamic, loader: dynamic) : OnTrigger {
    override fun trigger(vararg args: Any?)
}
external class OnRenderTrigger(method: Any, triggerType: dynamic, loader: dynamic) : OnTrigger {
    fun triggerIfCanceled(bool: Boolean): OnRenderTrigger
    override fun trigger(vararg args: Any?)
}
external class OnSoundPlayTrigger(method: Any, loader: dynamic) : OnTrigger {
    fun setCriteria(soundNameCriteria: String): OnSoundPlayTrigger
    override fun trigger(vararg args: Any?)
}
external class OnStepTrigger(method: Any, loader: dynamic) : OnTrigger {
    fun setFps(fps: Long): OnStepTrigger
    fun setDelay(delay: Long): OnStepTrigger
    override fun trigger(vararg args: Any?)
}
abstract external class OnTrigger(method: Any, type: dynamic, loader: dynamic) {
    fun setPriority(priority: Priority): OnTrigger
    fun register(): OnTrigger
    fun unregister(): OnTrigger
    fun callMethod(vararg args: Any?)
    abstract fun trigger(vararg args: Any?)
    enum class TriggerResult {
        CANCEL;
    }
    enum class Priority {
        HIGHEST, HIGH, NORMAL, LOW, LOWEST;
    }
}
