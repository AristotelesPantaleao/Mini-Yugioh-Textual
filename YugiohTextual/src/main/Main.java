package main;

import java.util.Scanner;

import entities.Monster;
import entities.Phase;
import entities.Player;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean gamming = true;
		
		Player duelist = new Player();
		Player duelist2 = new Player();
		Phase phase = new Phase();
				
		while(gamming == true) {
			System.out.println("Digite o nome do jogador 1: ");
			String player = scanner.next();
			scanner.nextLine();
			
			System.out.println("Digite o nome do jogador 2: ");
			String player2 = scanner.next();
			scanner.nextLine();
			
			System.out.println("Digite o arquétipo do jogador 1: ( DM - Dark Magician, BE - Blue Eyes, RE - Red Eyes )");
			String archetype = scanner.next();
			scanner.nextLine();
			
			System.out.println("Digite o arquétipo do jogador 2: ( DM - Dark Magician, BE - Blue Eyes, RE - Red Eyes )");
			String archetype2 = scanner.next();
			scanner.nextLine();
			
			duelist.setName(player);
			duelist.setArchetype(archetype);
			duelist.createDeck();
			duelist.chooseDeck();
			duelist.createField();
			duelist.addField();
			duelist.createHandPlayer();
			duelist.deckToHand();
			duelist.createCardAtackPosition();
			duelist.createCardAtack();
			duelist.createCardDefensePosition();
			duelist.addCardAtack();
			//duelist.addCardAtackPosition();
			//duelist.addCardDefensePosition();
			duelist.createGraveyard();
			duelist.addGraveyard();
			
			duelist2.setName(player2);
			duelist2.setArchetype(archetype2);
			duelist2.createDeck();
			duelist2.chooseDeck();
			duelist2.createField();
			duelist2.addField();
			duelist2.createHandPlayer();
			duelist2.deckToHand();
			duelist2.createCardAtackPosition();
			duelist2.createCardAtack();
			duelist2.createCardDefensePosition();
			duelist2.addCardAtack();
			//duelist2.addCardAtackPosition();
			//duelist2.addCardDefensePosition();
			duelist2.createGraveyard();
			duelist2.addGraveyard();
			
			int round = 0;
			while(round <= 11) {
				switch(round) {
				case 0:
					System.out.println(phase.getTurn());
					phase.isDrawPhase(duelist);
					round++;
					break;
				case 1:
					phase.isStandByPhase(duelist);
					round++;
					break;
				case 2:
					phase.isMainPhase1(duelist);
					round++;
					break;
				case 3:
					phase.isBattlePhase(duelist, duelist2);
					round++;
					break;
				case 4:
					phase.isMainPhase2(duelist);
					round++;
					break;
				case 5:
					phase.isEndPhase(duelist);
					round++;
					break;
				case 6:
					System.out.println(phase.getTurn());
					phase.isDrawPhase(duelist2);
					round++;
					break;
				case 7:
					phase.isStandByPhase(duelist2);
					round++;
					break;
				case 8:
					phase.isMainPhase1(duelist2);
					round++;
					break;
				case 9:
					phase.isBattlePhase(duelist2, duelist);
					round++;
					break;
				case 10:
					phase.isMainPhase2(duelist2);
					round++;
					break;
				case 11:
					phase.isEndPhase(duelist2);
					round = 0;
					break;
				}
				
			}
			
			if(duelist.getLifePoints() == 0) {
				System.out.println(duelist2.getPlayer()+" venceu!");
				gamming = false;
			}else if(duelist2.getLifePoints() == 0) {
				System.out.println(duelist.getPlayer()+" venceu!");
				gamming = false;
			}
			
		}
		
		scanner.close();
		
	}

}
