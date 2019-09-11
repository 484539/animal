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
public class Gato extends Felino {

    public Gato() {
    }

    public Gato(String comida, String habitat) {
        super(comida, habitat);
    }
    
    @Override
    public String getComida() {
        return comida;
    }
    @Override
    public void setComida(String comida) {
        this.comida = comida;
    }
    @Override
    public String getHabitat() {
        return habitat;
    }
    @Override
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    @Override
    public void makeNoise() {
        System.out.println("Miar");
    }
    
    public String Raca(){
        return "Raça: ";
    }
}
