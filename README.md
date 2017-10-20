# mafia-game
Implementation of card game Mafia.
Game for 4 to n players. 
It starts assigning roles to players, those could be: Civilian, Mafia, Doctor and Police.
The objective of the game is to guess which players are the mafia. 
It consist in a series of rounds, each round could have 7 states.
In these states you can:
  - If you are a Mafia, you can team up with the other Mafias to try to kill a player.
  - If you are a Doctor you can cure a player, and avoid them from dying.
  - If you are a Police you can ask if a player is a mafia
  - At the end of the round everyone votes the player who think is the Mafia
  - The most voted player dies.
If everyone in the town dies, except for the mafias, the Mafia wins.
