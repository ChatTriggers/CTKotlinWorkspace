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
    fun removeFormatting(text: String)
    fun replaceFormatting(text: String)
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
    fun read(importName: String, fileName: String)
    fun read(fileLocation: String)
    fun read(file: dynamic): String?
    fun getUrlContent(theUrl: String, userAgent: String? = definedExternally): String
    fun deleteDirectory(dir: dynamic): Boolean
    fun unzip(zipFilePath: String, destDirectory: String)
}
external object MathLib {
    fun map(number: Float, in_min: Float, in_max: Float, out_min: Float, out_max: Float)
    fun clampFloat(number: Float, min: Float, max: Float)
    fun clamp(number: Int, min: Int, max: Int)
}
external class Image(image: dynamic) {
    fun getTextureWidth()
    fun getTextureHeight()
    fun getTexture(): dynamic
    fun onRender(event: dynamic)
    fun draw(x: Double, y: Double, width: Double = definedExternally, height: Double = definedExternally)
}
external class Rectangle(color: Int, x: Float, y: Float, width: Float, height: Float) {
    fun getColor()
    fun setColor(color: Int)
    fun getX()
    fun setX(x: Float)
    fun getY()
    fun setY(y: Float)
    fun getWidth()
    fun setWidth(width: Float)
    fun getHeight()
    fun setHeight(height: Float)
    fun isShadow()
    fun setShadow(shadow: Boolean)
    fun getShadowOffset()
    fun getShadowOffsetX()
    fun getShadowOffsetY()
    fun setShadowOffset(x: Float, y: Float)
    fun setShadowOffsetX(x: Float)
    fun setShadowOffsetY(y: Float)
    fun getShadowColor()
    fun setShadowColor(color: Int)
    fun setShadow(color: Int, x: Float, y: Float)
    fun getOutline()
    fun setOutline(outline: Boolean)
    fun getOutlineColor()
    fun setOutlineColor(color: Int)
    fun getThickness()
    fun setThickness(thickness: Float)
    fun setOutline(color: Int, thickness: Float)
    fun draw()
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
    fun text(text: String, x: Float, y: Float)
    fun text(text: String)
    fun rectangle(color: Int, x: Float, y: Float, width: Float, height: Float)
    fun shape(color: Int)
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
    fun copy()
    fun clone(): Shape
    fun getColor()
    fun setColor(color: Int)
    fun getDrawMode()
    fun setDrawMode(drawMode: Int)
    fun addVertex(x: Float, y: Float)
    fun insertVertex(index: Int, x: Float, y: Float)
    fun removeVertex(index: Int)
    fun setLine(x1: Float, y1: Float, x2: Float, y2: Float, thickness: Float)
    fun setCircle(x: Float, y: Float, radius: Float, steps: Int)
    fun draw()
}
external class Text(string: String, x: Float = definedExternally, y: Float = definedExternally) {
    fun getString()
    fun setString(string: String)
    fun getColor()
    fun setColor(color: Int)
    fun getFormatted()
    fun setFormatted(formatted: Boolean)
    fun getShadow()
    fun setShadow(shadow: Boolean)
    fun getAlign()
    fun setAlign(align: Any)
    fun getX()
    fun setX(x: Float)
    fun getY()
    fun setY(y: Float)
    fun getWidth()
    fun setWidth(width: Int)
    fun getLines()
    fun getMaxLines()
    fun setMaxLines(maxLines: Int)
    fun getScale()
    fun setScale(scale: Float)
    fun getMaxWidth(): Int
    fun getHeight(): Float
    fun exceedsMaxLines(): Boolean
    fun draw(x: Float? = definedExternally, y: Float? = definedExternally)
    override fun toString(): String
}
external object Tessellator {
    fun bindTexture(texture: Image)
    fun begin(drawMode: Int = definedExternally, textured: Boolean = definedExternally)
    fun colorize(red: Float, green: Float, blue: Float, alpha: Float = definedExternally)
    fun rotate(angle: Float, x: Float, y: Float, z: Float)
    fun translate(x: Float, y: Float, z: Float)
    fun scale(x: Float, y: Float = definedExternally, z: Float = definedExternally)
    fun pos(x: Float, y: Float, z: Float)
    fun tex(u: Float, v: Float)
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
    fun getLeftClicksMax()
    fun getRightClicksMax()
    fun getLeftClicks()
    fun getRightClicks()
    fun getLeftClicksAverage(): Int
    fun getRightClicksAverage(): Int
}
abstract external class Display {
    constructor()
    constructor(any: dynamic)
    fun getBackgroundColor()
    fun setBackgroundColor(backgroundColor: Int)
    fun getTextColor()
    fun setTextColor(textColor: Int)
    fun getBackground()
    fun setBackground(background: Any)
    fun getAlign()
    fun setAlign(align: Any)
    fun getOrder()
    fun setOrder(order: Any)
    fun setLine(index: Int, line: Any)
    fun getLine(index: Int)
    fun getLines()
    fun setLines(lines: MutableList<DisplayLine>)
    fun addLine(index: Int = definedExternally, line: Any)
    fun addLines(vararg lines: Any)
    fun clearLines()
    fun getRenderX()
    fun setRenderX(renderX: Float)
    fun getRenderY()
    fun setRenderY(renderY: Float)
    fun setRenderLoc(renderX: Float, renderY: Float)
    fun getShouldRender()
    fun setShouldRender(shouldRender: Boolean)
    fun getWidth()
    fun getHeight()
    fun getMinWidth()
    fun setMinWidth(minWidth: Float)
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
    fun getText()
    fun setText(text: String)
    fun getTextColor()
    fun setTextColor(color: Int)
    fun getTextWidth()
    fun setShadow(shadow: Boolean)
    fun setScale(scale: Float)
    fun getAlign()
    fun setAlign(align: Any?)
    fun getBackground()
    fun setBackground(background: Any?)
    fun getBackgroundColor()
    fun setBackgroundColor(color: Int)
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
    fun setDoesPauseGame(doesPauseGame: Boolean)
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
    fun isKeyDown()
    fun isPressed()
    fun getKeyCode()
    fun setState(pressed: Boolean)
    fun clearKeyBinds()
}
external class Message {
    constructor(any: dynamic)
    constructor(messageParts: ArrayList<Any>)
    constructor(vararg components: Any)
    fun getChatMessage(): dynamic
    fun getMessageParts()
    fun getChatLineId()
    fun setChatLineId(id: Int)
    fun isRecursive()
    fun setRecursive(recursive: Boolean)
    fun isFormatted()
    fun setFormatted(formatted: Boolean)
    fun setTextComponent(index: Int, component: Any)
    fun addTextComponent(component: Any)
    fun addTextComponent(index: Int, component: Any)
    fun clone()
    fun copy(): Message
    fun edit(vararg replacements: Message)
    fun chat()
    fun actionBar()
}
external class TextComponent {
    constructor(text: String)
    constructor(any: dynamic)
    fun getText()
    fun setText(text: String)
    fun isFormatted()
    fun setFormatted(formatted: Boolean)
    fun setClick(action: String, value: String)
    fun getClickAction()
    fun setClickAction(action: String)
    fun getClickValue()
    fun setClickValue(value: String)
    fun setHover(action: String, value: String)
    fun getHoverAction()
    fun setHoverAction(action: String)
    fun getHoverValue()
    fun setHoverValue(value: String)
    fun chat()
    fun actionBar()
}
external class ParticleEffect(x: Double, y: Double, z: Double, xSpeed: Double = definedExternally, ySpeed: Double = definedExternally, zSpeed: Double = definedExternally)  {
    fun scale(scale: Float)
    fun multiplyVelocity(multiplier: Float)
    fun setColor(r: Float, g: Float, b: Float, a: Float? = definedExternally)
    fun setColor(color: Int)
    fun setAlpha(a: Float)
    fun remove()
}
external class Sound(config: dynamic) {
    fun onWorldLoad()
    fun setCategory(category: String)
    fun setVolume(volume: Float)
    fun setPosition(x: Float, y: Float, z: Float)
    fun setPitch(pitch: Float)
    fun setAttenuation(model: Int)
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
    fun setBlockPos(blockPos: dynamic)
    fun getID()
    fun getRegistryName(): String
    fun getUnlocalizedName()
    fun getName(): String
    fun getLightValue(): Int
    fun getState(): dynamic
    fun getDefaultState(): dynamic
    fun getX()
    fun getY()
    fun getZ()
    fun getMetadata()
    fun getDefaultMetadata()
    fun canProvidePower(): Boolean
    fun isPowered()
    fun getRedstoneStrength()
    fun canBeHarvested()
    fun canBeHarvestedWith(item: Item)
    fun isTranslucent(): Boolean
    override fun toString(): String
}
external class Sign(block: Block) : Block {
    fun getLines()
    fun getFormattedLines()
    fun getUnformattedLines()
    override fun toString(): String
}
external class Chunk(chunk: dynamic) {
    fun getAllEntities()
    fun getAllEntitiesOfType(clazz: dynamic)
}
open external class Entity(entity: dynamic) {
    fun getX()
    fun getY()
    fun getZ()
    fun getPitch()
    fun getYaw()
    fun getMotionX()
    fun getMotionY()
    fun getMotionZ()
    fun getHP()
    fun getRiding(): Entity?
    fun getRider(): Entity?
    fun getRiders(): List<Entity>
    fun isDead()
    fun getWidth()
    fun getHeight()
    fun getEyeHeight()
    open fun getName(): String
    fun getClassName()
    fun getUUID()
    override fun toString(): String
}
abstract external class Action(slot: Int, windowId: Int) {
    fun setSlot(slot: Int)
    fun setWindowId(windowId: Int)
    abstract fun complete()
    fun doClick(button: Int, mode: Int)
    fun of(inventory: Inventory, slot: Int, typeString: String)
    enum class Type {
        CLICK, DRAG, KEY, DROP;
    }
}
external class ClickAction(slot: Int, windowId: Int) : Action {
    fun getClickType()
    fun setClickType(clickType: ClickType)
    fun getHoldingShift()
    fun setHoldingShift(holdingShift: Boolean)
    fun getItemInHand()
    fun setItemInHand(itemInHand: Boolean)
    fun setClickString(clickType: String)
    override fun complete()
    enum class ClickType {
        LEFT, RIGHT, MIDDLE;
    }
}
external class DragAction(slot: Int, windowId: Int) : Action {
    fun getClickType()
    fun setClickType(clickType: ClickType)
    fun getStage()
    fun setStage(stage: Stage)
    fun setClickString(clickType: String)
    fun setStageString(stage: String)
    override fun complete()
    enum class ClickType {
        LEFT, RIGHT, MIDDLE;
    }
    enum class Stage {
        BEGIN, SLOT, END;
    }
}
external class DropAction(slot: Int, windowId: Int) : Action {
    fun getHoldingCtrl()
    fun setHoldingCtrl(holdingCtrl: Boolean)
    override fun complete()
}
external class KeyAction(slot: Int, windowId: Int) : Action {
    fun getKey()
    fun setKey(key: Int)
    override fun complete()
}
external class Inventory {
    constructor(any: dynamic)
    fun getSize()
    fun getStackInSlot(slot: Int)
    fun getWindowId()
    fun doAction(action: Action)
    fun isItemValidForSlot(slot: Int, item: Item)
    fun contains(item: Item)
    fun indexOf(item: Item)
    fun isContainer()
    fun click(slot: Int, shift: Boolean)
    fun drop(slot: Int, ctrl: Boolean)
    fun drag(type: String, vararg slots: Int)
    fun getName()
    fun getClassName(): String
    override fun toString(): String
}
external class Item {
    constructor(any: dynamic)
    constructor(itemName: String)
    constructor(itemID: Int)
    constructor(block: Block)
    constructor(entity: Entity)
    fun getID()
    fun setStackSize(stackSize: Int)
    fun getStackSize(): Int
    fun getUnlocalizedName()
    fun getRegistryName(): String
    fun getName(): String
    fun getEnchantments(): Map<String,Int>
    fun isEnchantable()
    fun isEnchanted()
    fun getItemNBT()
    fun getMetadata()
    fun canPlaceOn(block: Block)
    fun canHarvest(block: Block): Boolean
    fun canDestroy(block: Block)
    fun getDurability()
    fun getDamage()
    fun setDamage(damage: Int)
    fun getMaxDamage()
    fun isDamagable()
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
    fun getAmplifier()
    fun getDuration()
    fun getID(): Int
    fun isAmbient()
    fun isDurationMax()
    fun showsParticles(): Boolean
    override fun toString(): String
}
external object Player {
    fun getPlayer(): dynamic
    fun getX()
    fun getY()
    fun getZ()
    fun getMotionX()
    fun getMotionY()
    fun getMotionZ()
    fun getPitch()
    fun getYaw()
    fun getRawYaw()
    fun getName(): String
    fun getUUID(): String
    fun getHP()
    fun getHunger()
    fun getSaturation()
    fun getArmorPoints()
    fun getAirLevel()
    fun getXPLevel()
    fun getXPProgress()
    fun getBiome(): String
    fun getLightLevel()
    fun isSneaking()
    fun isSprinting()
    fun isFlying()
    fun isSleeping()
    fun facing(): String
    fun getActivePotionEffects(): List<PotionEffect>
    fun lookingAt(): Any
    fun getHeldItem()
    fun getInventory()
    fun getDisplayName()
    fun setTabDisplayName(textComponent: TextComponent)
    fun getOpenedInventory()
    object armor {
        fun getHelmet(): Item
        fun getChestplate(): Item
        fun getLeggings(): Item
        fun getBoots(): Item
    }
}
external object Scoreboard {
    fun getScoreboardTitle()
    fun getTitle(): String
    fun getLines(descending: Boolean = definedExternally): List<Score>
    fun getLineByIndex(index: Int)
    fun getLinesByScore(score: Int)
    fun setLine(score: Int, line: String, override: Boolean)
    fun setShouldRender(shouldRender: Boolean)
    fun getShouldRender()
    fun resetCache()
    class Score(score: dynamic) {
        fun getPoints()
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
    fun triggerIfCanceled(bool: Boolean)
    fun setChatCriteria(chatCriteria: String)
    fun setCriteria(chatCriteria: String)
    fun setParameter(parameter: String)
    fun setParameters(vararg parameters: String)
    fun addParameter(parameter: String)
    fun addParameters(vararg parameters: String)
    override fun trigger(vararg args: Any?)
    enum class Parameter {
        CONTAINS, START, END;
        fun getParameterByName(name: String): Parameter?
    }
}
external class OnCommandTrigger(method: Any, loader: dynamic) : OnTrigger {
    override fun trigger(vararg args: Any?)
    fun setCommandName(commandName: String)
    fun setName(commandName: String)
}
external class OnRegularTrigger(method: Any, triggerType: dynamic, loader: dynamic) : OnTrigger {
    override fun trigger(vararg args: Any?)
}
external class OnRenderTrigger(method: Any, triggerType: dynamic, loader: dynamic) : OnTrigger {
    fun triggerIfCanceled(bool: Boolean)
    override fun trigger(vararg args: Any?)
}
external class OnSoundPlayTrigger(method: Any, loader: dynamic) : OnTrigger {
    fun setCriteria(soundNameCriteria: String)
    override fun trigger(vararg args: Any?)
}
external class OnStepTrigger(method: Any, loader: dynamic) : OnTrigger {
    fun setFps(fps: Long)
    fun setDelay(delay: Long)
    override fun trigger(vararg args: Any?)
}
abstract external class OnTrigger(method: Any, type: dynamic, loader: dynamic) {
    fun setPriority(priority: Priority): OnTrigger
    fun register()
    fun unregister()
    fun callMethod(vararg args: Any?)
    abstract fun trigger(vararg args: Any?)
    enum class TriggerResult {
        CANCEL;
    }
    enum class Priority {
        HIGHEST, HIGH, NORMAL, LOW, LOWEST;
    }
}
