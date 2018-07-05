package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.Map;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {

    	System.out.print(request);
    	return 2;
    }

    public static void showdown(JsonElement game) {
    }
    
    
    
    public static void main (String[] args)
    {
    	//new JsonParser().parse();
    	String json = "{ \"id\": 1, // Your own player looks similar, with one extension. \"name\": \"Bob\", \"status\": \"active\", \"version\": \"Default random player\", \"stack\": 1590, \"bet\": 80, \"hole_cards\": [ // The cards of the player. This is only visible for your own player // except after showdown, when cards revealed are also included. { \"rank\": \"6\", // Rank of the card. Possible values are numbers 2-10 and J,Q,K,A \"suit\": \"hearts\" // Suit of the card. Possible values are: clubs,spades,hearts,diamonds }, { \"rank\": \"K\", \"suit\": \"spades\" } ] }";// "{ \"id\": 1, \"name\": \"Bob\", \"status\": \"active\", \"version\": \"Default random player\", \"stack\": 1590, \"bet\": 80, \"hole_cards\": [. This is only visible for your own player // except after showdown, when cards revealed are also included. { \"rank\": \"6\", // Rank of the card. Possible values are numbers 2-10 and J,Q,K,A \"suit\": \"hearts\" // Suit of the card. Possible values are: clubs,spades,hearts,diamonds }, { \"rank\": \"K\", \"suit\": \"spades\" } ] }\"); 
    	//betRequets ();
    }
}
