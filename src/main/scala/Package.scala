package object MatchingProblem {
type Match = (Int ,Int)
type Matching = List[Match]
type Preferences = Vector[Vector[Int]]
// 1.1
def matchByElement(i: Int, n: Int): List[Match] = {
  var matches = List[Match]()
  for (j <- 1 to n) {
    matches =  matches :+ (i, j)
  }
  matches
}

// 1.2
def matchsByElements(n: Int): List[List[Match]] = {
  var subMatches = List[List[Match]]()
  for (i <- 1 to n) {
    val matches = matchByElement(i, n)
    subMatches = subMatches :+ matches
  }
  subMatches
}


// 1.3
def possibleMatchings(n: Int): List[List[Match]] = {
  val subMatches = matchsByElements(n)
  subMatches.foldRight(List(List[Match]())) {
    case (matches, acc) => for {
      m <- matches
      rest <- acc
    } yield m :: rest
  }
}

// 1.4
def matchings(n:Int): List[Matching] = {
	def is_valid_matching(l:List[Match], n:Int):Boolean = {
		def is_in_list(l:List[Match], n:Int):Boolean = {
			if(l.isEmpty)
				false
			else
				if(l.head._2 == n)
					true
				else
					is_in_list(l.tail, n)
		}
		val result = for(i <- 1 to n if is_in_list(l, i)) yield i	
		result.length == n
	}
	val possible_matchings = possibleMatchings(n)
	for (match_list <- possible_matchings if is_valid_matching(match_list, n)) yield match_list
}

// 1.5
def weightedMatchings(n:Int, pilotPrefs: Preferences, navigPrefs: Preferences):List[(Matching, Int)] = {
	def weight(l:Matching, p:Preferences, n:Preferences):Int = {
		def aux(l:Matching, result:Int):Int = {
			if(l.isEmpty)
				result
			else
				val m = l.head 
				aux(l.tail, result + (p(m._1-1)(m._2-1) * (n(m._2-1)(m._1-1))))
		}
		aux(l, 0)
	}
	val l_matchings = matchings(n)
	for(possibility <- l_matchings) 
		yield (possibility, weight(possibility, pilotPrefs, navigPrefs))
}

// 1.6
def bestMatching(n:Int, pilotPrefs: Preferences, navigPrefs: Preferences):(Matching, Int) = {
	def get_max_matching(l:List[(Matching, Int)], result:(Matching, Int)):(Matching, Int) = {
		if(l.isEmpty)
			result
		else
			if(l.head._2 > result._2)
				get_max_matching(l.tail, l.head)
			else
				get_max_matching(l.tail, result)
	}
	val matchings_list = weightedMatchings(n, pilotPrefs, navigPrefs)
	get_max_matching(matchings_list, matchings_list.head)
}
}