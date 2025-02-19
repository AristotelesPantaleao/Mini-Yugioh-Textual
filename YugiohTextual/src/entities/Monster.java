package entities;

public class Monster{
	
	private String name;
	private int atack;
	private int defense;

	public String getName() {
		return name;
	}

	public int getAtack() {
		return atack;
	}

	public int getDefense() {
		return defense;
	}
		
	public void setName(String name) {
		this.name = name;
	}
	
	private int setAtack(int atack) {
		return this.atack = atack;
	}

	private int setDefense(int defense) {
		return this.defense = defense;
	}

	public void listOfCards() {
		if(getName().equals("Mago Negro")) {
			setAtack(2500);
			setDefense(2100);
		}else if(getName().equals("Gaia o Cavaleiro Impetuoso")) {
			setAtack(2300);
			setDefense(2100);
		}else if(getName().equals("Maldição do Dragão")) {
			setAtack(2000);
			setDefense(1500);
		}else if(getName().equals("Guardião Celta")) {
			setAtack(1400);
			setDefense(1200);
		}else if(getName().equals("Castor Guerreiro")) {
			setAtack(1200);
			setDefense(1500);
		}else if(getName().equals("Elfa Mística")) {
			setAtack(800);
			setDefense(2000);
		}else if(getName().equals("Dragão Alado Guardião da Fortaleza N°1")) {
			setAtack(1400);
			setDefense(1200);
		}else if(getName().equals("Kuriboh")) {
			setAtack(300);
			setDefense(200);
		}else if(getName().equals("Demônio Chifrudo")) {
			setAtack(1300);
			setDefense(1000);
		}else if(getName().equals("Dragão Branco de Olhos Azuis")) {
			setAtack(3000);
			setDefense(2500);
		}else if(getName().equals("Ginete Vorse")){
			setAtack(1900);
			setDefense(1200);
		}else if(getName().equals("Elfos Gêmeos")) {
			setAtack(1900);
			setDefense(900);
		}else if(getName().equals("Touro Guerreiro")) {
			setAtack(1700);
			setDefense(1000);
		}else if(getName().equals("Lobo de Guerra Geneticamente Alterado")) {
			setAtack(2000);
			setDefense(100);
		}else if(getName().equals("Caçador Mecânico")) {
			setAtack(1850);
			setDefense(800);
		}else if(getName().equals("Bruxa Obscura Dunames")) {
			setAtack(1800);
			setDefense(1050);
		}else if(getName().equals("Misterioso Dragão Couraça")) {
			setAtack(2000);
			setDefense(0);
		}else if(getName().equals("Gigante Hitotsu-Me")) {
			setAtack(1200);
			setDefense(1000);
		}else if(getName().equals("Lagarto Encouraçado")) {
			setAtack(1500);
			setDefense(1200);
		}else if(getName().equals("Dragão Negro de Olhos Vermelhos")) {
			setAtack(2400);
			setDefense(2000);
		}else if(getName().equals("Caveira Invocada")) {
			setAtack(2500);
			setDefense(1200);
		}else if(getName().equals("Ilusionista Sem Rosto")) {
			setAtack(1200);
			setDefense(2200);
		}else if(getName().equals("Predador com Machado")) {
			setAtack(1700);
			setDefense(1150);
		}else if(getName().equals("Aqua Madoor")) {
			setAtack(1200);
			setDefense(2000);
		}else if(getName().equals("Hordeum Maligno Heliotrope")) {
			setAtack(1950);
			setDefense(650);
		}else if(getName().equals("Rei Rex de Duas Cabeças")) {
			setAtack(1600);
			setDefense(1200);
		}else if(getName().equals("Grifo Fantasma")) {
			setAtack(2000);
			setDefense(0);
		}else if(getName().equals("Rato Prevenido")) {
			setAtack(500);
			setDefense(2000);
		}else if(getName().equals("Masaki o Espadachim Lendário")) {
			setAtack(1100);
			setDefense(1100);
		}
	}
	
	public String showAtackOrDefenseOfYourMonster(Player player, String monster) {
		if(player.getArchetype().toUpperCase().equals("DM")) {
			if (monster.equals("Mago")) {
				setAtack(2500);
				setDefense(2100);
				setName("Mago Negro");
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			} else if (monster.equals("Gaia")) {
				setAtack(2300);
				setDefense(2100);
				setName("Gaia o Cavaleiro Impetuoso");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			} else if (monster.equals("Maldição")) {
				setAtack(2000);
				setDefense(1500);
				setName("Maldição do Dragão");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			} else if (monster.equals("Guardião")) {
				setAtack(1400);
				setDefense(1200);
				setName("Guardião Celta");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			} else if (monster.equals("Castor")) {
				setAtack(1200);
				setDefense(1500);
				setName("Castor Guerreiro");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			} else if (monster.equals("Elfa")) {
				setAtack(800);
				setDefense(2000);
				setName("Elfa Mística");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			} else if (monster.equals("Dragão")) {
				setAtack(1400);
				setDefense(1200);
				setName("Dragão Alado Guardião da Fortaleza N°1");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			} else if (monster.equals("Kuriboh")) {
				setAtack(300);
				setDefense(200);
				setName("Kuriboh");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			} else if (monster.equals("Demônio")) {
				setAtack(1300);
				setDefense(1000);
				setName("Demônio Chifrudo");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else {
				return "Carta Inválida";
			}
		}else if(player.getArchetype().toUpperCase().equals("BE")) {
			if(monster.equals("Dragão")) {
				setAtack(3000);
				setDefense(2500);
				setName("Dragão Branco de Olhos Azuis");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Ginete")) {
				setAtack(1900);
				setDefense(1200);
				setName("Ginete Vorse");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Elfos")) {
				setAtack(1900);
				setDefense(900);
				setName("Elfos Gêmeos");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Touro")) {
				setAtack(1700);
				setDefense(1000);
				setName("Touro Guerreiro");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Lobo")) {
				setAtack(2000);
				setDefense(100);
				setName("Lobo de Guerra Geneticamente Alterado");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Caçador")) {
				setAtack(1850);
				setDefense(800);
				setName("Caçador Mecânico");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Bruxa")) {
				setAtack(1800);
				setDefense(1050);
				setName("Bruxa Obscura Dunames");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Misterioso")) {
				setAtack(2000);
				setDefense(0);
				setName("Misterioso Dragão Couraça");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Gigante")) {
				setAtack(1200);
				setDefense(1000);
				setName("Gigante Hitotsu-Me");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Lagarto")) {
				setAtack(1500);
				setDefense(1200);
				setName("Lagarto Encouraçado");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else {
				return "Carta inválida";
			}
		}else if(player.getArchetype().toUpperCase().equals("RE")) {
			if(monster.equals("Dragão")) {
				setAtack(2400);
				setDefense(2000);
				setName("Dragão Negro de Olhos Vermelhos");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Caveira")) {
				setAtack(2500);
				setDefense(1200);
				setName("Caveira Invocada");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Ilusionista")) {
				setAtack(1200);
				setDefense(2200);
				setName("Ilusionista Sem Rosto");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Predador")) {
				setAtack(1700);
				setDefense(1150);
				setName("Predador com Machado");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Aqua")) {
				setAtack(1200);
				setDefense(2000);
				setName("Aqua Madoor");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Hordeum")) {
				setAtack(1950);
				setDefense(650);
				setName("Hordeum Maligno Heliotrope");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Rei")) {
				setAtack(1600);
				setDefense(1200);
				setName("Rei Rex de Duas Cabeças");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Grifo")) {
				setAtack(2000);
				setDefense(0);
				setName("Grifo Fantasma");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Rato")) {
				setAtack(500);
				setDefense(2000);
				setName("Rato Prevenido");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else if(monster.equals("Masaki")) {
				setAtack(1100);
				setDefense(1100);
				setName("Masaki o Espadachim Lendário");
				System.out.println("Atack: "+getAtack());
				System.out.println("Defense: "+getDefense());
				return this.getName() + " possui " + getAtack() + " de ataque e " + getDefense() + " de defesa.";
			}else {
				return "Carta Inválida";
			}
		}
		
		return null;
	}

}
