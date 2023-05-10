import MatchingProblem._


matchByElement(2,5)
matchsByElements(5)
possibleMatchings(2)
matchings(2)

val pilot_prefs = Vector ( Vector ( 2 , 3 , 1 , 1 ) , Vector ( 1 , 1 , 4 , 3 ) , Vector ( 1 , 2 , 3 , 4 ) , Vector ( 2 , 3 , 2 , 1 ) )
val copilot_prefs = Vector ( Vector ( 4 , 1 , 3 , 2 ) , Vector ( 4 , 2 , 3 , 1 ) , Vector ( 1 , 1 , 1 , 4 ) , Vector ( 3 , 2 , 3 , 3 ) )
weightedMatchings(4, pilot_prefs, copilot_prefs)
bestMatching(4, pilot_prefs, copilot_prefs)