import MatchingProblem._

matchByElement(1,1)
matchByElement(2,4)
matchByElement(3,6)
matchByElement(4,3)
matchByElement(5,5)
matchsByElements(1)
matchsByElements(3)
matchsByElements(4)
matchsByElements(5)
matchsByElements(6)
possibleMatchings(1)
possibleMatchings(2)
possibleMatchings(3)
possibleMatchings(4)
possibleMatchings(0)
// resultado esperado List( List( (1,1), (2,2) ), List( (1,2), (2,1) ) )
matchings(2)

/*
	resultado esperado: una lista con 6 listas de posibles emparejamientos validos (que no se repite copiloto)
	List(
		List((1,1), (2,2), (3,3)), 
		List((1,1), (2,3), (3,2)), 
		List((1,2), (2,1), (3,3)), 
		List((1,2), (2,3), (3,1)), 
		List((1,3), (2,1), (3,2)), 
		List((1,3), (2,2), (3,1))
	)
*/
matchings(3)

/* resultado esperado: una lista con 24 listas de posibles emparejamientos validas (que no se repite copiloto)
	List(
		List((1,1), (2,2), (3,3), (4,4)), 
		List((1,1), (2,2), (3,4), (4,3)), 
		List((1,1), (2,3), (3,2), (4,4)), 
		(.....)
		(.....)
		List((1,4), (2,2), (3,3), (4,1)), 
		List((1,4), (2,3), (3,1), (4,2)), 
		List((1,4), (2,3), (3,2), (4,1))
	)
*/
matchings(4) 

val pilot_prefs2 = Vector ( Vector ( 1 , 2 ), Vector ( 3, 4 ))
val copilot_prefs2 = Vector ( Vector ( 1 , 2) , Vector ( 3, 4 ))

weightedMatchings(2, pilot_prefs2, copilot_prefs2)
bestMatching(2, pilot_prefs2, copilot_prefs2)

val pilot_prefs3 = Vector ( Vector ( 2, 3, 1), Vector ( 4, 1, 2), Vector ( 1, 4, 1))
val copilot_prefs3 = Vector ( Vector ( 4, 1, 1), Vector ( 1, 3, 2), Vector ( 2, 3, 3))

weightedMatchings(2, pilot_prefs3, copilot_prefs3)
bestMatching(2, pilot_prefs3, copilot_prefs3)

val pilot_prefs4 = Vector ( Vector ( 2 , 3 , 1 , 1 ) , Vector ( 1 , 1 , 4 , 3 ) , Vector ( 1 , 2 , 3 , 4 ) , Vector ( 2 , 3 , 2 , 1 ) )
val copilot_prefs4 = Vector ( Vector ( 4 , 1 , 3 , 2 ) , Vector ( 4 , 2 , 3 , 1 ) , Vector ( 1 , 1 , 1 , 4 ) , Vector ( 3 , 2 , 3 , 3 ) )

weightedMatchings(4, pilot_prefs4, copilot_prefs4)
bestMatching(4, pilot_prefs4, copilot_prefs4)