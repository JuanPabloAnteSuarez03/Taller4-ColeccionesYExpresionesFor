package object MatchingProblem {
type Match = (Int ,Int)
type Matching = List[Match]
type Preferences = Vector[Vector[Int]]

def matchByElement(i: Int, n: Int): List[Match] = {
  var matches = List[Match]()
  for (j <- 1 to n) {
    matches =  matches :+ (i, j)
  }
  matches
}


def matchsByElements(n: Int): List[List[Match]] = {
  var allMatches = List[List[Match]]()
  for (i <- 1 to n) {
    val matches = matchByElement(i, n)
    allMatches = allMatches :+ matches
  }
  allMatches
}


/*
def possibleMatchings(n:Int): List[List[Match]] = {
}

def matchings(n:Int): List[Matching] = {
}

def weightedMatchings(n:Int, pilotPrefs: Preferences, navigPrefs: Preferences):List[(Matching, Int)] = {
}

def bestMatching(n:Int, pilotPrefs: Preferences, navigPrefs: Preferences):(Matching, Int) = {
}*/
}