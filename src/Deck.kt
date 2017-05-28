import java.util.*

/**
 * Created by yyhyo on 2017-05-28.
 */
class Deck {
    val cards: Array<Card> = Array(52, { Card(it % 13, getSuit(it)) })
    var cardsInDeck: MutableList<Card> = cards.toMutableList()

    fun drawCard(): Card = cardsInDeck.removeAt(0)

    fun reset() {
        cardsInDeck = cards.toMutableList()
        Collections.shuffle(cardsInDeck)
    }

    private fun getSuit(i: Int) = when (i / 13) {
        0 -> clubs
        1 -> diamonds
        2 -> hearts
        else -> spades
    }
}