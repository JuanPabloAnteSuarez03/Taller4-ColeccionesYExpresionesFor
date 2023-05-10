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
  var subMatches = List[List[Match]]()
  for (i <- 1 to n) {
    val matches = matchByElement(i, n)
    subMatches = subMatches :+ matches
  }
  subMatches
}



def possibleMatchings(n: Int): List[List[Match]] = {
  val subMatches = matchsByElements(n)
  subMatches.foldRight(List(List[Match]())) {
    case (matches, acc) => for {
      m <- matches
      rest <- acc
    } yield m :: rest
  }
}




/*
def matchings(n:Int): List[Matching] = {
}

def weightedMatchings(n:Int, pilotPrefs: Preferences, navigPrefs: Preferences):List[(Matching, Int)] = {
}

def bestMatching(n:Int, pilotPrefs: Preferences, navigPrefs: Preferences):(Matching, Int) = {
}*/
}