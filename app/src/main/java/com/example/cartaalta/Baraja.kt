package com.example.cartaalta

enum class Palos {
    CORAZONES, DIAMANTES, TREBOLES, PICAS
}

enum class Naipes {
    AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, DIEZ, JOTA, REINA, REY

}
class Baraja {
    //meteremos todos los metodos dentro de nuestro companion object,
    // ya que lo llamaremos estaticamente
    companion object{
     var listaCartas = arrayListOf<Carta>()
        //Generar la lista de 52 cartas de la baraja.
        fun crearBaraja(){
            var idCarta = 1
            for (palo in Palos.values()) {
                for (numero in Naipes.values()) {
                    val newCarta = Carta(numero, palo, numero.ordinal + 1, numero.ordinal + 1, idCarta)
                    if (numero.name == "AS") newCarta.puntosMax = 11
                    listaCartas.add(newCarta)
                    idCarta++
                }
            }
        }

        //Desordenar las cartas de la lista de cartas de la baraja (shuffle)
        fun barajar() = listaCartas.shuffle()

        //Retorna la última carta de la lista de cartas y la elimina de la baraja.
        fun dameCarta() = listaCartas.removeLast()

    }
}