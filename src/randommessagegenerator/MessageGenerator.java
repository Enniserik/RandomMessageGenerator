/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randommessagegenerator;

/**
 *
 * @author Erik
 */
public interface MessageGenerator {

    public abstract void addMessage(String message) throws IllegalArgumentException;

    public abstract boolean equals(Object obj);

    public abstract String generateMessage();

    public abstract int hashCode();

    public abstract void removeMessage(String message) throws IllegalArgumentException;

    public abstract String toString();
    
}
