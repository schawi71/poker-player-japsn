package org.leanpoker.player;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Player {

    static final String VERSION = "V 1.6";

    public static int betRequest(JsonElement request) {
    	JsonObject obj = request.getAsJsonObject();
    	
    	int currentBuyIn = obj.get("current_buy_in").getAsInt();
    	int raiseValue = 0;
    	
    	JsonElement players = obj.get("players");
    	JsonArray playersList = players.getAsJsonArray();
    	Set<String> ranksSet = new HashSet<>();
    	Set<String> colorSet = new HashSet<>();
    	for (Iterator<JsonElement> itr = playersList.iterator() ; itr.hasNext ();) {
    		JsonElement jElement = itr.next();
    		JsonObject player = jElement.getAsJsonObject();
    		String name  = player.get("name").getAsString();
    		 if ("japsn".equalsIgnoreCase(name)) {
    			 if (player.get("hole_cards") != null){
    		         JsonArray cards = player.get("hole_cards").getAsJsonArray();
    		         for (JsonElement card : cards) {
    		        	 String rank = card.getAsJsonObject().get("rank").getAsString();
    		        	 ranksSet.add(rank);
						String suit = card.getAsJsonObject().get("suit").getAsString();
						colorSet.add(suit);
					 }
    		     }
    		 }
    	}
    	
    	if (ranksSet.size() == 1 || colorSet.size() == 1) {
    		return currentBuyIn + 10;
    	} else {
    		return 0;
    	}
    }

    public static void showdown(JsonElement game) {
    }
    
    
    public static void main (String[] args)
    {
    	String current_buy_in = "320";
    	String test = "{ \"tournament_id\":\"550d1d68cd7bd10003000003\",  \"game_id\":\"550da1cb2d909006e90004b1\",  \"round\":0,  \"bet_index\":0,  \"small_blind\": 10,  \"current_buy_in\": "+current_buy_in+ " ,  \"pot\": 400,  \"minimum_raise\": 240,   \"dealer\": 1,   \"orbits\": 7,   \"in_action\": 1,  "
    			+ "\"players\": [  {  \"id\": 0,  \"name\": \"Japsn\",  \"status\": \"active\",      \"version\": \"Default random player\",  \"stack\": 1010,   \"bet\": 320  }, { \"id\": 1,  \"name\": \"Bob\", \"status\": \"active\", \"version\": \"Japsn2\", \"stack\": 1590, \"bet\": 80, \"hole_cards\": [   { \"rank\": \"6\",  \"suit\": \"hearts\"  }, { \"rank\": \"K\", \"suit\": \"spades\" } ] }, { \"id\": 2, \"name\": \"Chuck\", \"status\": \"out\", \"version\": \"Default random player\", \"stack\": 0, \"bet\": 0 } ], \"community_cards\": [  { \"rank\": \"4\", \"suit\": \"spades\" }, { \"rank\": \"A\", \"suit\": \"hearts\" }, { \"rank\": \"6\", \"suit\": \"clubs\" } ]}";
    	
    	JsonElement elemnt = new JsonParser().parse(test);
    	JsonObject obj = elemnt.getAsJsonObject();
    	JsonElement element = obj.get("current_buy_in");
    	BigDecimal value = element.getAsBigDecimal();
    	JsonElement players = obj.get("players");
    	JsonArray playersList = players.getAsJsonArray();

    	
    	for (Iterator<JsonElement> itr = playersList.iterator() ; itr.hasNext ();) {
    		JsonElement jElement = itr.next();
    		JsonObject player = jElement.getAsJsonObject();
    		String name  = player.get("name").getAsString();
    		if ("Japsn2".equalsIgnoreCase(name)) {
    			JsonArray cards = player.get("hole_cards").getAsJsonArray();
    			
    			for (Iterator<JsonElement> itrCards = cards.iterator() ; itrCards.hasNext ();) {
    				JsonElement card = itrCards.next();
    				System.out.println(card);
    			}
    		}
    		
    	}
    	//betRequets ();
    	System.out.println("end");
    }
}
