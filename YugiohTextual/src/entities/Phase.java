package entities;

import java.util.Scanner;

public class Phase extends Player {

	private boolean drawPhase;
	private boolean standByPhase;
	private boolean mainPhase1;
	private boolean battlePhase;
	private boolean mainPhase2;
	private boolean endPhase;
	private int turn = 1;
	int summoning = 1;
	
	Scanner scanner = new Scanner(System.in);
	Monster monster = new Monster();
	
	public String getTurn() {
		return "Turno: "+turn;
	}
	
	public void isDrawPhase(Player player) {
		while(drawPhase == true) {
			System.out.println("Draw Phase");
			if(turn == 1) {
				drawPhase = false;
				standByPhase = true;
			}else {
				drawPhase = true;
				if(drawPhase == true) {
					player.drawCard();
					standByPhase = true;
					drawPhase = false;
				}
			}
		}
	}
	
	public void isStandByPhase(Player player) {
		System.out.println("StandByPhase");
		standByPhase = false;
		mainPhase1 = true;
	}
	
	public void isMainPhase1(Player player) {
		while(mainPhase1 == true) {
			System.out.println("Main Phase 1");
			if(turn == 1) {
				System.out.println("Mão do jogador "+player.getPlayer()+": "+player.getHandPlayer());
				System.out.println("Deseja pesquisar uma carta? ( sim ou não )");
				String answer = scanner.next();
				scanner.nextLine();
				while(answer.toUpperCase().equals("SIM")) {
					System.out.println("Mão do jogador "+player.getPlayer()+": "+player.getHandPlayer());
					System.out.println("Qual carta você quer pesquisar?");
					String cardSearched = scanner.next();
					scanner.nextLine();
					System.out.println(monster.showAtackOrDefenseOfYourMonster(player, cardSearched));
					System.out.println("Deseja pesquisar outra carta? ( sim ou não )");
					answer = scanner.next();
					scanner.nextLine();
				}
				System.out.println("Você quer invocar uma carta? ( sim ou não )");
				String answer2 = scanner.next();
				scanner.nextLine();
				while(answer2.toUpperCase().equals("SIM") && summoning == 1) {
					System.out.println("Considerando que a 1° carta é o índice 0 e a 2° carta é o índice 1 e assim por diante. Qual carta você quer jogar no campo: "+player.getHandPlayer());
					System.out.println("Informe o índice da carta que você quer invocar: ");
					int isSummoning = scanner.nextInt();
					System.out.println("Digite em qual posição você quer jogar: 0-"+player.getField().get(0)+ "1-"+player.getField().get(1)+"2-"+player.getField().get(2)+"3-"+player.getField().get(3)+"4-"+player.getField().get(4));
					int summoningInTheField = scanner.nextInt();
					System.out.println("DIgite qual o modo da carta: 0 - Ataque, 1 - Defesa");
					int mode = scanner.nextInt();
					player.removeCardFromTheHand(isSummoning, summoningInTheField, mode);
					summoning = 0;
				}
				System.out.println("Você quer passar o turno? ( sim ou não )");
				String answer3 = scanner.next();
				scanner.nextLine();
				if(answer3.toUpperCase().equals("SIM")) {
					mainPhase1 = false;
					endPhase = true;
					summoning = 1;
				}
			}
			if(turn >= 2) {
				System.out.println("Mão do jogador "+player.getPlayer()+": "+player.getHandPlayer());
				System.out.println("Deseja pesquisar uma carta? ( sim ou não )");
				String answer = scanner.next();
				scanner.nextLine();
				while(answer.toUpperCase().equals("SIM")) {
					System.out.println("Mão do jogador "+player.getPlayer()+": "+player.getHandPlayer());
					System.out.println("Qual carta você quer pesquisar?");
					String cardSearched = scanner.next();
					scanner.nextLine();
					System.out.println(monster.showAtackOrDefenseOfYourMonster(player, cardSearched));
					System.out.println("Deseja pesquisar outra carta? ( sim ou não )");
					answer = scanner.next();
					scanner.nextLine();
				}
				System.out.println("Você quer invocar uma carta? ( sim ou não )");
				String answer2 = scanner.next();
				scanner.nextLine();
				while(answer2.toUpperCase().equals("SIM") && summoning == 1) {
					System.out.println("Considerando que a 1° carta é o índice 0 e a 2° carta é o índice 1 e assim por diante. Qual carta você quer jogar no campo: "+player.getHandPlayer());
					System.out.println("Informe o índice da carta que você quer invocar: ");
					int isSummoning = scanner.nextInt();
					System.out.println("Digite em qual posição você quer jogar: 0-"+player.getField().get(0)+ "1-"+player.getField().get(1)+"2-"+player.getField().get(2)+"3-"+player.getField().get(3)+"4-"+player.getField().get(4));
					int summoningInTheField = scanner.nextInt();
					System.out.println("DIgite qual o modo da carta: 0 - Ataque, 1 - Defesa");
					int mode = scanner.nextInt();
					player.removeCardFromTheHand(isSummoning, summoningInTheField, mode);
					summoning = 0;
				}
				System.out.println("Você deseja batalhar? ( sim ou não )");
				String answer3 = scanner.next();
				if(answer3.toUpperCase().equals("SIM")) {
					mainPhase1 = false;
					battlePhase = true;
				}else if(answer3.toUpperCase().equals("NÃO")) {
					mainPhase1 = false;
					endPhase = true;
					summoning = 1;
				}
			}
		}
		
	}
	
	public void isBattlePhase(Player player, Player player2) {
		if(turn == 1) {
			battlePhase = false;
		}
		while(battlePhase == true) {
			System.out.println("Battle Phase");
			System.out.println("Escolha um índice válido: ( começa no índice 0 )");
			System.out.println(player.getPlayer()+" com qual monstro você quer atacar? "+player.getField());
			int battleMonster = scanner.nextInt();
			System.out.println("Escolha um índice válido: ( começa no índice 0 )");
			System.out.println(player.getPlayer()+" qual monstro você quer atacar? "+player2.getField());
			int targetBattle = scanner.nextInt();
			if(targetBattle == 0 && battleMonster == 0 || targetBattle == 0 && battleMonster == 1 || targetBattle == 0 && battleMonster == 2 || targetBattle == 0 && battleMonster == 3 || targetBattle == 0 && battleMonster == 4){
				if(player.getCardAtack().get(battleMonster) == true && player2.getCardAtack().get(targetBattle) == true) {
					monster.setName(player.getField().get(battleMonster));
					System.out.println(monster.getName());
					monster.listOfCards();
					int atack = monster.getAtack();
					System.out.println(atack);
					monster.setName(player2.getField().get(targetBattle));
					System.out.println(monster.getName());
					monster.listOfCards();
					int atack2 = monster.getAtack();
					System.out.println(atack2);
					if(atack > atack2) {
						player2.lifePoints = player2.getLifePoints() - (atack - atack2);
						System.out.println("Vida do jogador: "+player2.getPlayer()+" : "+player2.getLifePoints());
						player2.addToGraveyard(targetBattle,targetBattle);
						System.out.println("Cemitério: "+player2.getGraveyard());
						System.out.println("Campo: "+player.getField());
						battlePhase = false;
						mainPhase2 = true;
					}else if(atack2 > atack) {
						player.lifePoints = player.getLifePoints() - (atack2 - atack);
						System.out.println("Vida do jogador: "+player.getPlayer()+" : "+player.getLifePoints());
						player.addToGraveyard(targetBattle, targetBattle);
						System.out.println("Cemitério: "+player.getGraveyard());
						System.out.println("Campo: "+player.getField());
						battlePhase = false;
						mainPhase2 = true;
					}else if(atack == atack2) {
						player.addToGraveyard(battleMonster, battleMonster);
						player2.addToGraveyard(targetBattle, targetBattle);
						System.out.println("Cemitério do jogador "+player.getPlayer()+" : "+player.getGraveyard());
						System.out.println("Cemitério do jogador "+player2.getPlayer()+" : "+player2.getGraveyard());
						battlePhase = false;
						mainPhase2 = true;
					}
				}else if(player.getCardAtack().get(battleMonster) == true && player2.getCardAtack().get(targetBattle) == false) {
					monster.setName(player.getField().get(battleMonster));
					System.out.println(monster.getName());
					monster.listOfCards();
					int atack = monster.getAtack();
					System.out.println(atack);
					monster.setName(player2.getField().get(targetBattle));
					System.out.println(monster.getName());
					monster.listOfCards();
					int defense = monster.getDefense();
					System.out.println(defense);
					if(atack > defense) {
						player2.addToGraveyard(targetBattle, targetBattle);
						battlePhase = false;
						mainPhase2 = true;
					}else if(defense > atack) {
						player.lifePoints = player.getLifePoints() - (defense - atack);
						System.out.println("Vida do jogador: "+player.getPlayer()+" : "+player.getLifePoints());
						battlePhase = false;
						mainPhase2 = true;
					}
				}
			}else if(targetBattle == 1 && battleMonster == 0 || targetBattle == 1 && battleMonster == 1 || targetBattle == 1 && battleMonster == 2 || targetBattle == 1 && battleMonster == 3 || targetBattle == 1 && battleMonster == 4) {
				System.out.println("Entrou aqui 1");
				if(player.getCardAtack().get(battleMonster) == true && player2.getCardAtack().get(targetBattle) == true) {
					monster.setName(player.getField().get(battleMonster));
					System.out.println(monster.getName());
					monster.listOfCards();
					int atack = monster.getAtack();
					System.out.println(atack);
					monster.setName(player2.getField().get(targetBattle));
					System.out.println(monster.getName());
					monster.listOfCards();
					int atack2 = monster.getAtack();
					System.out.println(atack2);
					if(atack > atack2) {
						player2.lifePoints = player2.getLifePoints() - (atack - atack2);
						System.out.println("Vida do jogador: "+player2.getPlayer()+" : "+player2.getLifePoints());
						player2.addToGraveyard(targetBattle,1);
						System.out.println("Cemitério: "+player2.getGraveyard());
						System.out.println("Campo: "+player.getField());
						battlePhase = false;
						mainPhase2 = true;
					}else if(atack2 > atack) {
						player.lifePoints = player.getLifePoints() - (atack2 - atack);
						System.out.println("Vida do jogador: "+player.getPlayer()+" : "+player.getLifePoints());
						player.addToGraveyard(targetBattle, 1);
						System.out.println("Cemitério: "+player.getGraveyard());
						System.out.println("Campo: "+player.getField());
						battlePhase = false;
						mainPhase2 = true;
					}else if(atack == atack2) {
						player.addToGraveyard(battleMonster, battleMonster);
						player2.addToGraveyard(targetBattle, targetBattle);
						System.out.println("Cemitério do jogador "+player.getPlayer()+" : "+player.getGraveyard());
						System.out.println("Cemitério do jogador "+player2.getPlayer()+" : "+player2.getGraveyard());
						battlePhase = false;
						mainPhase2 = true;
					}
				}else if(player.getCardAtack().get(battleMonster) == true && player2.getCardAtack().get(targetBattle) == false) {
					monster.setName(player.getField().get(battleMonster));
					System.out.println(monster.getName());
					monster.listOfCards();
					int atack = monster.getAtack();
					System.out.println(atack);
					monster.setName(player2.getField().get(targetBattle));
					System.out.println(monster.getName());
					monster.listOfCards();
					int defense = monster.getDefense();
					System.out.println(defense);
					if(atack > defense) {
						player2.addToGraveyard(targetBattle, targetBattle);
						battlePhase = false;
						mainPhase2 = true;
					}else if(defense > atack) {
						player.lifePoints = player.getLifePoints() - (defense - atack);
						System.out.println("Vida do jogador: "+player.getPlayer()+" : "+player.getLifePoints());
						battlePhase = false;
						mainPhase2 = true;
					}
				}
			}else if(targetBattle == 2 && battleMonster == 0 || targetBattle == 2 && battleMonster == 1 || targetBattle == 2 && battleMonster == 2 || targetBattle == 2 && battleMonster == 3 || targetBattle == 2 && battleMonster == 4) {
				System.out.println("Entrou aqui 2");
			}else if(targetBattle == 3 && battleMonster == 0 || targetBattle == 3 && battleMonster == 1 || targetBattle == 3 && battleMonster == 2 || targetBattle == 3 && battleMonster == 3 || targetBattle == 3 && battleMonster == 4) {
				System.out.println("Entrou aqui 3");
			}else if(targetBattle == 4 && battleMonster == 0 || targetBattle == 4 && battleMonster == 1 || targetBattle == 4 && battleMonster == 2 || targetBattle == 4 && battleMonster == 3 || targetBattle == 4 && battleMonster == 4) {
				System.out.println("Entrou aqui 4");
			}
			
		}
	}
	
	public void isMainPhase2(Player player) {
		while(mainPhase2 == true) {
			System.out.println("Main Phase 2");
			System.out.println("Mão do jogador "+player.getPlayer()+": "+player.getHandPlayer());
			System.out.println("Deseja pesquisar uma carta? ( sim ou não )");
			String answer = scanner.next();
			scanner.nextLine();
			while(answer.toUpperCase().equals("SIM")) {
				System.out.println("Mão do jogador "+player.getPlayer()+": "+player.getHandPlayer());
				System.out.println("Qual carta você quer pesquisar?");
				String cardSearched = scanner.next();
				scanner.nextLine();
				System.out.println(monster.showAtackOrDefenseOfYourMonster(player, cardSearched));
				System.out.println("Deseja pesquisar outra carta? ( sim ou não )");
				answer = scanner.next();
				scanner.nextLine();
			}
			if(summoning == 1) {
				System.out.println("Você quer invocar uma carta? ( sim ou não )");
				String answer2 = scanner.next();
				scanner.nextLine();
				while(answer2.toUpperCase().equals("SIM") && summoning == 1) {
					System.out.println("Considerando que a 1° carta é o índice 0 e a 2° carta é o índice 1 e assim por diante. Qual carta você quer jogar no campo: "+player.getHandPlayer());
					System.out.println("Informe o índice da carta que você quer invocar: ");
					int isSummoning = scanner.nextInt();
					System.out.println("Digite em qual posição você quer jogar: 0-"+player.getField().get(0)+ "1-"+player.getField().get(1)+"2-"+player.getField().get(2)+"3-"+player.getField().get(3)+"4-"+player.getField().get(4));
					int summoningInTheField = scanner.nextInt();
					System.out.println("DIgite qual o modo da carta: 0 - Ataque, 1 - Defesa");
					int mode = scanner.nextInt();
					player.removeCardFromTheHand(isSummoning, summoningInTheField, mode);
					summoning = 0;
				}
			}
			System.out.println("Você quer passar o turno? ( sim ou não )");
			String answer3 = scanner.next();
			scanner.nextLine();
			if(answer3.toUpperCase().equals("SIM")) {
				mainPhase2 = false;
				endPhase = true;
			}
		}
	}
	
	public void isEndPhase(Player player) {
		while(endPhase == true) {
			System.out.println("End Phase");
			turn++;
			drawPhase = true;
			endPhase = false;
			summoning = 1;
		}
	}
	
}
