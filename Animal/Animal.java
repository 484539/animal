/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author aluno
 */
public class Animal {
    
    protected String comida;
    protected String habitat;
//Construtor
    public Animal() {
    }
    public Animal(String comida, String habitat) {
        this.comida = comida;
        this.habitat = habitat;
    }
//Getters
    public String getComida() {
        return comida;
    }
    public String getHabitat() {
        return habitat;
    }
//Setters
    public void setComida(String comida) {
        this.comida = comida;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public void makeNoise() {
        System.out.println("Fazer barulho");
    }
}
