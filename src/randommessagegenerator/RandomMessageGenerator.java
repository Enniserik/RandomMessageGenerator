/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randommessagegenerator;

import java.util.*;

/**
 *
 * @author Erik
 */
public class RandomMessageGenerator implements MessageGenerator {
    
    private List<String> messages;
    
    public RandomMessageGenerator(){
        messages = new ArrayList<>();
    }
    
    public RandomMessageGenerator(List<String> messages){
        this.messages = messages;
    }
    
    @Override
    public void addMessage(String message) throws IllegalArgumentException {
        if(message == null || message.isEmpty()){
            throw new IllegalArgumentException("Message must not be null or empty.");
        }
        messages.add(message);
        removeDuplicates();
    }
    
    @Override
    public void removeMessage(String message) throws IllegalArgumentException {
        if(message == null || message.isEmpty()){
            throw new IllegalArgumentException("Message must not be null or empty.");
        }
        messages.remove(message);
    }
    
    @Override
    public String generateMessage(){
        Random rand = new Random(System.nanoTime());
        return messages.get(rand.nextInt(messages.size()));
    }
    
    private void removeDuplicates(){
        Set<String> noDupes = new HashSet<>(messages);
        messages = new ArrayList<>(noDupes);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.messages);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RandomMessageGenerator other = (RandomMessageGenerator) obj;
        if (!Objects.equals(this.messages, other.messages)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String msg = "";
        for(String s : messages){
            msg += s + "\n";
        }
        return msg;
    }
    
    
    
}
