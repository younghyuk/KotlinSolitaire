/**
 * Created by yyhyo on 2017-05-28.
 */
val clubs = "Clubs"
val diamonds = "Diamonds"
val hearts = "Hearts"
val spades = "Spades"
val redSuits = arrayOf(diamonds, hearts)
val blackSuits = arrayOf(clubs, spades)

data class Card(val value: Int, val suit: String, var faceUp: Boolean = false) {
}