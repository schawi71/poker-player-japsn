package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.Map;

public class Player {

    static final String VERSION = "V 1.1";

    public static int betRequest(JsonElement request) {

    	System.out.print(request);
    	return 110;
    }

    public static void showdown(JsonElement game) {
    }
    
    
    
    public static void main (String[] args)
    {
    	String test = "{ \"tournament_id\":\"550d1d68cd7bd10003000003\",  \"game_id\":\"550da1cb2d909006e90004b1\",  \"round\":0,  \"bet_index\":0,  \"small_blind\": 10,  \"current_buy_in\": 320,  \"pot\": 400,  \"minimum_raise\": 240,   \"dealer\": 1,   \"orbits\": 7,   \"in_action\": 1,  \"players\": [  {  \"id\": 0,  \"name\": \"Albert\",  \"status\": \"active\",      \"version\": \"Default random player\",  \"stack\": 1010,   \"bet\": 320  }, { \"id\": 1,  \"name\": \"Bob\", \"status\": \"active\", \"version\": \"Default random player\", \"stack\": 1590, \"bet\": 80, \"hole_cards\": [   { \"rank\": \"6\",  \"suit\": \"hearts\"  }, { \"rank\": \"K\", \"suit\": \"spades\" } ] }, { \"id\": 2, \"name\": \"Chuck\", \"status\": \"out\", \"version\": \"Default random player\", \"stack\": 0, \"bet\": 0 } ], \"community_cards\": [  { \"rank\": \"4\", \"suit\": \"spades\" }, { \"rank\": \"A\", \"suit\": \"hearts\" }, { \"rank\": \"6\", \"suit\": \"clubs\" } ]}";
    	
    	new JsonParser().parse(test);
    	String json = "{ \"id\": 1, // Your own player looks similar, with one extension. \"name\": \"Bob\", \"status\": \"active\", \"version\": \"Default random player\", \"stack\": 1590, \"bet\": 80, \"hole_cards\": [ // The cards of the player. This is only visible for your own player // except after showdown, when cards revealed are also included. { \"rank\": \"6\", // Rank of the card. Possible values are numbers 2-10 and J,Q,K,A \"suit\": \"hearts\" // Suit of the card. Possible values are: clubs,spades,hearts,diamonds }, { \"rank\": \"K\", \"suit\": \"spades\" } ] }";// "{ \"id\": 1, \"name\": \"Bob\", \"status\": \"active\", \"version\": \"Default random player\", \"stack\": 1590, \"bet\": 80, \"hole_cards\": [. This is only visible for your own player // except after showdown, when cards revealed are also included. { \"rank\": \"6\", // Rank of the card. Possible values are numbers 2-10 and J,Q,K,A \"suit\": \"hearts\" // Suit of the card. Possible values are: clubs,spades,hearts,diamonds }, { \"rank\": \"K\", \"suit\": \"spades\" } ] }\"); 
    	//betRequets ();
    }
}
