package entities;

import java.util.ArrayList;
import java.util.Collections;

public class Player extends Monster {

	private String name;
	private String archetype;
	private ArrayList<String> deck;
	private ArrayList<String> field;
	private ArrayList<String> handPlayer;
	private boolean atackPosition;
	private ArrayList<String> cardAtackPosition;
	private ArrayList<Boolean> cardAtack;
	private ArrayList<String> cardDefensePosition;
	private ArrayList<String> graveyard;
	
	protected int lifePoints = 2000;
	
	// Pega o cemitério
	public ArrayList<String> getGraveyard(){
		return graveyard;
	}
	
	// Pega os pontos de vida
	public int getLifePoints() {
		return lifePoints;
	}
	
	// Pega o cardAtack
	public ArrayList<Boolean> getCardAtack(){
		return cardAtack;
	}
	
	// Pega o nome da carta em ataque
	public ArrayList<String> getCardAtackPosition() {
		return cardAtackPosition;
	}

	// Pega o nome da carta em defesa
	public ArrayList<String> getCardDefensePosition() {
		return cardDefensePosition;
	}

	// Pega o nome do jogador
	public String getPlayer() {
		return name;
	}

	// Pega o arquétipo
	public String getArchetype() {
		return archetype;
	}

	// Pega o tamanho do deck
	public int getDeckSize() {
		return deck.size();
	}

	// Pega o tamanho da mão do jogador
	public int getHandPlayerSize() {
		return handPlayer.size();
	}

	// Pega o campo
	public ArrayList<String> getField() {
		return field;
	}

	// Pega o deck
	public ArrayList<String> getDeck() {
		return deck;
	}

	// Pega a mão do jogador
	public ArrayList<String> getHandPlayer() {
		return handPlayer;
	}

	// Define o nome
	public void setName(String name) {
		this.name = name;
	}

	// Define o arquétipo
	public void setArchetype(String archetype) {
		this.archetype = archetype;
	}

	// Inicializa o cemitério
	public void createGraveyard() {
		graveyard = new ArrayList<>();
	}
	
	// Inicializa a lista de carta em ataque
	public void createCardAtackPosition() {
		cardAtackPosition = new ArrayList<>();
	}

	// Inicializa se o card está em ataque
	public void createCardAtack() {
		cardAtack = new ArrayList<>();
	}

	// Inicializa a lista de carta em defesa
	public void createCardDefensePosition() {
		cardDefensePosition = new ArrayList<>();
	}

	// Inicializar o deck
	public void createDeck() {
		deck = new ArrayList<>();
	}

	// Inicializar o campo
	public void createField() {
		field = new ArrayList<>();
	}

	// Inicializar a mão do jogador
	public void createHandPlayer() {
		handPlayer = new ArrayList<>();
	}

	// Método para escolher o deck
	public void chooseDeck() {
		getArchetype();
		if (archetype.toUpperCase().equals("DM")) {
			deck.add("Mago Negro");
			deck.add("Mago Negro");
			deck.add("Mago Negro");
			deck.add("Gaia o Cavaleiro Impetuoso");
			deck.add("Gaia o Cavaleiro Impetuoso");
			deck.add("Maldição do Dragão");
			deck.add("Maldição do Dragão");
			deck.add("Guardião Celta");
			deck.add("Guardião Celta");
			deck.add("Castor Guerreiro");
			deck.add("Castor Guerreiro");
			deck.add("Elfa Mística");
			deck.add("Elfa Mística");
			deck.add("Dragão Alado Guardião da Fortaleza N°1");
			deck.add("Dragão Alado Guardião da Fortaleza N°1");
			deck.add("Kuriboh");
			deck.add("Kuriboh");
			deck.add("Demônio Chifrudo");
			deck.add("Demônio Chifrudo");
			deck.add("Demônio Chifrudo");
			Collections.shuffle(deck);
		} else if (archetype.toUpperCase().equals("BE")) {
			deck.add("Dragão Branco de Olhos Azuis");
			deck.add("Dragão Branco de Olhos Azuis");
			deck.add("Dragão Branco de Olhos Azuis");
			deck.add("Ginete Vorse");
			deck.add("Elfos Gêmeos");
			deck.add("Elfos Gêmeos");
			deck.add("Touro Guerreiro");
			deck.add("Touro Guerreiro");
			deck.add("Lobo de Guerra Geneticamente Alterado");
			deck.add("Lobo de Guerra Geneticamente Alterado");
			deck.add("Caçador Mecânico");
			deck.add("Caçador Mecânico");
			deck.add("Bruxa Obscura Dunames");
			deck.add("Bruxa Obscura Dunames");
			deck.add("Misterioso Dragão Couraça");
			deck.add("Misterioso Dragão Couraça");
			deck.add("Gigante Hitotsu-Me");
			deck.add("Gigante Hitotsu-Me");
			deck.add("Lagarto Encouraçado");
			deck.add("Lagarto Encouraçado");
			Collections.shuffle(deck);
		} else if (archetype.toUpperCase().equals("RE")) {
			deck.add("Dragão Negro de Olhos Vermelhos");
			deck.add("Dragão Negro de Olhos Vermelhos");
			deck.add("Dragão Negro de Olhos Vermelhos");
			deck.add("Caveira Invocada");
			deck.add("Caveira Invocada");
			deck.add("Ilusionista Sem Rosto");
			deck.add("Predador com Machado");
			deck.add("Predador com Machado");
			deck.add("Aqua Madoor");
			deck.add("Aqua Madoor");
			deck.add("Hordeum Maligno Heliotrope");
			deck.add("Hordeum Maligno Heliotrope");
			deck.add("Rei Rex de Duas Cabeças");
			deck.add("Rei Rex de Duas Cabeças");
			deck.add("Grifo Fantasma");
			deck.add("Grifo Fantasma");
			deck.add("Rato Prevenido");
			deck.add("Rato Prevenido");
			deck.add("Masaki o Espadachim Lendário");
			deck.add("Masaki o Espadachim Lendário");
			Collections.shuffle(deck);
		} else {
			System.out.println("Arquétipo inválido!");
		}
	}

	// Método para criar o campo
	public void addField() {
		for (int i = 0; i <= 4; i++) {
			field.add("");
		}
	}
	
	public void addCardAtack() {
		for (int i = 0; i <= 4; i++) {
			cardAtack.add(null);
		}
	}
	
	public void addGraveyard() {
		for(int i = 0; i <= 20; i++) {
			graveyard.add("");
		}
	}

	// Método para remover cartas do deck e adicionar a mão
	public void deckToHand() {
		for (int i = 0; i <= deck.size(); i++) {
			if (i < 5) {
				handPlayer.add(deck.remove(i));
			}
		}
	}
	
	public void addCardAtackPosition() {
		for(int i = 0; i <= 4; i++) {
			cardAtackPosition.add("");
		}
	}
	
	public void addCardDefensePosition() {
		for(int i =0; i <= 4; i++) {
			cardDefensePosition.add("");
		}
	}

	// Método para remover uma carta da mão e jogar em uma posição no campo
	public void removeCardFromTheHand(int cardRemoved, int index, int position) {
		String removedCard = getHandPlayer().remove(cardRemoved);
		field.remove(index);
		field.add(index, removedCard);
		if (position == 0) {
			atackPosition = true;
			//cardAtackPosition.remove(index);
			cardAtackPosition.add(removedCard);
			cardAtack.add(index,atackPosition);
		} else if (position == 1) {
			atackPosition = false;
			//cardDefensePosition.remove(index);
			cardDefensePosition.add(removedCard);
			cardAtack.add(index, atackPosition);;
		} else {
			System.out.println("Modo inválido");
		}

		System.out.println("Novo campo do jogador: " + getField());

		System.out.println("Carta em ataque: " + getCardAtackPosition());
		System.out.println("Carta em defesa: " + getCardDefensePosition());
	}

	// Método de comprar carta
	public void drawCard() {
		String drawedCard = deck.remove(0);
		handPlayer.add(drawedCard);
		System.out.println("Nova mão do jogador: "+getPlayer()+" "+getHandPlayer());
	}

	// Adicionar carta para o cemitério
	public void addToGraveyard(int cardRemoved, int index) {
		String removedCard = getField().get(cardRemoved);
		if(cardAtack.get(index) == true) {
			cardAtack.remove(index);
			cardAtackPosition.remove(index);
			field.remove(index);
			graveyard.remove(index);
			graveyard.add(index,removedCard);
		}else if(cardAtack.get(index) == false) {
			cardAtack.remove(index);
			cardDefensePosition.remove(index);
			field.remove(index);
			graveyard.remove(index);
			graveyard.add(index,removedCard);
		}
	}
	
}
