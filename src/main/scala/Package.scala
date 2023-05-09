package object MatchingProblem {
type Match = (Int ,Int)
type Matching = List[Match]
type Preferences = Vector[Vector[Int]]

def matchByElement (i:Int, n:Int):List[Match] = {
//Devuelve la lista de los posibles match del elemento i

}

def matchsByElements(n:Int): List[List[Match]] = {
//Devuelve la lista de los posibles matchs de cada elemento (1 hasta n)

}

def possibleMatchings(n:Int): List[List[Match]] = {
//Devuelve la lista de todos los posibles matchings de cada uno de los n
//elementos

}

def matchings(n:Int): List[Matching] = {
//Devuelve la lista de todoso los posibles matchings de n pilotos

}

def weightedMatchings(n:Int, pilotPrefs: Preferences, navigPrefs: Preferences):List[(Matching, Int)] = {

}

def bestMatching(n:Int, pilotPrefs: Preferences, navigPrefs: Preferences):(Matching, Int) = {

}
}