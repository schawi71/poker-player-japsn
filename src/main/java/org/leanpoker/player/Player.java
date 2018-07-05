package org.leanpoker.player;

import java.math.BigDecimal;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Player {

    static final String VERSION = "V 1.2";

    public static int betRequest(JsonElement request) {
    	JsonObject obj = request.getAsJsonObject();
    	JsonElement element = obj.get("current_buy_in");
    	int value = element.getAsInt();
    	return value + 10;
    }

    public static void showdown(JsonElement game) {
    }
    
    
    
    public static void main (String[] args)
    {
    	String test = "{ \"tournament_id\":\"550d1d68cd7bd10003000003\",  \"game_id\":\"550da1cb2d909006e90004b1\",  \"round\":0,  \"bet_index\":0,  \"small_blind\": 10,  \"current_buy_in\": 320,  \"pot\": 400,  \"minimum_raise\": 240,   \"dealer\": 1,   \"orbits\": 7,   \"in_action\": 1,  \"players\": [  {  \"id\": 0,  \"name\": \"Albert\",  \"status\": \"active\",      \"version\": \"Default random player\",  \"stack\": 1010,   \"bet\": 320  }, { \"id\": 1,  \"name\": \"Bob\", \"status\": \"active\", \"version\": \"Default random player\", \"stack\": 1590, \"bet\": 80, \"hole_cards\": [   { \"rank\": \"6\",  \"suit\": \"hearts\"  }, { \"rank\": \"K\", \"suit\": \"spades\" } ] }, { \"id\": 2, \"name\": \"Chuck\", \"status\": \"out\", \"version\": \"Default random player\", \"stack\": 0, \"bet\": 0 } ], \"community_cards\": [  { \"rank\": \"4\", \"suit\": \"spades\" }, { \"rank\": \"A\", \"suit\": \"hearts\" }, { \"rank\": \"6\", \"suit\": \"clubs\" } ]}";
    	
    	JsonElement elemnt = new JsonParser().parse(test);
    	JsonObject obj = elemnt.getAsJsonObject();
    	JsonElement element = obj.get("current_buy_in");
    	BigDecimal value = element.getAsBigDecimal();
    	//betRequets ();
    }
}
