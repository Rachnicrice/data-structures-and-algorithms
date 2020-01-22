package code401challenges.utilities;

import java.util.NoSuchElementException;

public class AnimalShelter {
    //instance variable
    Animal oldest;
    Animal newest;

    //Constructor function
    AnimalShelter () {
        this.oldest = null;
        this.newest = null;
    }

    //instance methods
    public void enqueue (String animal) {
        Animal node = new Animal(animal);
        if (this.oldest == null) {
            this.oldest = node;
        } else if (this.oldest == this.newest){
            this.oldest.next = node;
        } else {
            this.newest.next = node;
        }
        this.newest = node;
    }

    public String dequeue (String wantedAnimal) {
        Animal adopted = findAnimal(wantedAnimal, this.oldest, this.oldest);
        return adopted.animal;
    }

    public Animal findAnimal (String wantedAnimal, Animal node, Animal lastAnimal) {
        if (node == null) {
            throw new NoSuchElementException("We don't currently have that animal in our shelter");
        }

        if (!node.animal.equals("cat") && !node.animal.equals("dog")) {
            System.out.println("Sorry we are only adopting cats and dogs right now");
            return null;

        } else if (node.animal.equals(wantedAnimal)) {
            if (node == this.oldest && node == this.newest) {
                this.oldest = node.next;
                this.newest = node.next;
            } else if (node == this.oldest) {
                this.oldest = node.next;
            }
            lastAnimal.next = node.next;
            return node;
        } else {
            lastAnimal = node;
            return findAnimal(wantedAnimal, node.next, lastAnimal);
        }
    }
}
